package net.jake.csgomod.block.custom;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.block.entity.ModBlockEntities;
import net.jake.csgomod.item.custom.BaseCaseKeyItem;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.locks.Lock;


public class BaseCaseBlock extends BaseEntityBlock {

    public static final VoxelShape SHAPE = Block.box(0,0,4,16,9,13);

    public BaseCaseBlock(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        super.onPlace(pState, pLevel, pPos, pOldState, pIsMoving);
    }


    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {

        if (!pLevel.isClientSide()) {

            // Checks entity whether it is BaseCaseBlockEntity, if it is then sets it.
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if (entity instanceof BaseCaseBlockEntity) {
                BaseCaseBlockEntity baseCaseBlockEntity = (BaseCaseBlockEntity) entity;
                if (baseCaseBlockEntity.isLocked()){
                    if ((usingCorrectKey(pPlayer, pHand))) {
                        pPlayer.setItemInHand(pHand, ItemStack.EMPTY);
                        baseCaseBlockEntity.setLocked(false);
                        pPlayer.sendSystemMessage(Component.literal("First"));
                        NetworkHooks.openScreen(((ServerPlayer) pPlayer), (BaseCaseBlockEntity) entity, pPos);
                    }
                    else {
                        throw new IllegalStateException("Key Missing!");
                    }
                }
                else {
                    pPlayer.sendSystemMessage(Component.literal("Second"));
                    NetworkHooks.openScreen(((ServerPlayer) pPlayer), (BaseCaseBlockEntity) entity, pPos);
                }

            } else {
                throw new IllegalStateException("Our Container provider is missing!");
            }
            //Calls function to check if item in hand is the key


        }
        return InteractionResult.sidedSuccess(pLevel.isClientSide());
    }

    public boolean usingCorrectKey(Player player, InteractionHand hand) {
        return player.getItemInHand(hand).getItem().getClass() == BaseCaseKeyItem.class;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new BaseCaseBlockEntity(pPos, pState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        if(pLevel.isClientSide()){
            return null;
        }

        return createTickerHelper(pBlockEntityType, ModBlockEntities.BASE_CASE_BE.get(),
                (pLevel1, pPos, pState1, pBlockEntity) -> pBlockEntity.tick(pLevel1, pPos, pState1));

//        return super.getTicker(pLevel, pState, pBlockEntityType);
    }
}

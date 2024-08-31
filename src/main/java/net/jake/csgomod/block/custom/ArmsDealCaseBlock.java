package net.jake.csgomod.block.custom;

import net.jake.csgomod.block.entity.ArmsDealCaseBlockEntity;
import net.jake.csgomod.block.entity.ModBlockEntities;
import net.jake.csgomod.item.custom.ArmsDealCaseKeyItem;
import net.jake.csgomod.item.custom.BaseCaseKeyItem;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ArmsDealCaseBlock extends BaseCaseBlock{
    public ArmsDealCaseBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean usingCorrectKey(Player player, InteractionHand hand) {
        return player.getItemInHand(hand).getItem().getClass() == ArmsDealCaseKeyItem.class;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new ArmsDealCaseBlockEntity(pPos, pState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        if(pLevel.isClientSide()){
            return null;
        }

        return createTickerHelper(pBlockEntityType, ModBlockEntities.ARMS_DEAL_CASE_BE.get(),
                (pLevel1, pPos, pState1, pBlockEntity) -> pBlockEntity.tick(pLevel1, pPos, pState1));

//        return super.getTicker(pLevel, pState, pBlockEntityType);
    }
}

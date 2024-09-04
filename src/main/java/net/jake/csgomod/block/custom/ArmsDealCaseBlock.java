package net.jake.csgomod.block.custom;

import net.jake.csgomod.block.entity.ArmsDealCaseBlockEntity;
import net.jake.csgomod.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ArmsDealCaseBlock extends BaseCaseBlock {
    public ArmsDealCaseBlock(Properties pProperties) {
        super(pProperties, "item.csgomod.csgo_case_key");
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new ArmsDealCaseBlockEntity(pPos,pState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        if(pLevel.isClientSide()){
            return null;
        }
        System.out.println("Getting ticker for " + pBlockEntityType);
        return createTickerHelper(pBlockEntityType, ModBlockEntities.ARMS_DEAL_CASE_BE.get(),
                (pLevel1, pPos, pState1, pBlockEntity) -> pBlockEntity.tick(pLevel1, pPos, pState1));
    }
}

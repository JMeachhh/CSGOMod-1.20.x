package net.jake.csgomod.block.custom;

import net.jake.csgomod.block.entity.ArmsDealCaseBlockEntity;
import net.jake.csgomod.block.entity.GammaTwoCaseBlockEntity;
import net.jake.csgomod.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class GammaTwoCaseBlock extends BaseCaseBlock {
    public GammaTwoCaseBlock(Properties pProperties) {
        super(pProperties, "item.csgomod.gamma_two_case_key");
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new GammaTwoCaseBlockEntity(pPos,pState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        if(pLevel.isClientSide()){
            return null;
        }
        System.out.println("Getting ticker for " + pBlockEntityType);
        return createTickerHelper(pBlockEntityType, ModBlockEntities.GAMMA_TWO_CASE_BE.get(),
                (pLevel1, pPos, pState1, pBlockEntity) -> pBlockEntity.tick(pLevel1, pPos, pState1));
    }
}

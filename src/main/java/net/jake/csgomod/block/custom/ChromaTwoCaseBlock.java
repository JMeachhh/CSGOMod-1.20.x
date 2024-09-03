package net.jake.csgomod.block.custom;

import net.jake.csgomod.block.entity.ArmsDealCaseBlockEntity;
import net.jake.csgomod.block.entity.ChromaTwoCaseBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ChromaTwoCaseBlock extends BaseCaseBlock {
    public ChromaTwoCaseBlock(Properties pProperties) {
        super(pProperties , "item.csgomod.chroma_two_case_key");
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new ChromaTwoCaseBlockEntity(pPos,pState);
    }
}

package net.jake.csgomod.block.custom;

import net.jake.csgomod.block.entity.ArmsDealCaseBlockEntity;
import net.jake.csgomod.block.entity.DangerZoneCaseBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class DangerZoneCaseBlock extends BaseCaseBlock {
    public DangerZoneCaseBlock(Properties pProperties) {
        super(pProperties, "item.csgomod.danger_zone_case_key");
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new DangerZoneCaseBlockEntity(pPos,pState);
    }
}

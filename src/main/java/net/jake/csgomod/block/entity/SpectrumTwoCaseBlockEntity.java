package net.jake.csgomod.block.entity;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class SpectrumTwoCaseBlockEntity extends BaseCaseBlockEntity {
    public SpectrumTwoCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        this.setDropList(createSpectrumTwoCaseCaseDropList());
    }

    private static List<Item> createSpectrumTwoCaseCaseDropList() {
        List<Item> drops = new ArrayList<>();
        drops.add(ModItems.SPECTRUM_TWO_CASE_KEY.get());
        return drops;
    }
}

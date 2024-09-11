package net.jake.csgomod.block.entity;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class ClutchCaseBlockEntity extends BaseCaseBlockEntity {
    public ClutchCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        this.setDropList(createClutchCaseDropList());
    }

    private static List<Item> createClutchCaseDropList() {
        List<Item> drops = new ArrayList<>();

        return drops;
    }

}

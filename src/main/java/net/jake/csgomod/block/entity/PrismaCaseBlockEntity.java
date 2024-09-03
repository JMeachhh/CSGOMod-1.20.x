package net.jake.csgomod.block.entity;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class PrismaCaseBlockEntity extends BaseCaseBlockEntity {
    public PrismaCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        this.setDropList(createPrismaCaseDropList());
    }

    private static List<Item> createPrismaCaseDropList() {
        List<Item> drops = new ArrayList<>();
        drops.add(ModItems.PRISMA_CASE_KEY.get());
        return drops;
    }
}

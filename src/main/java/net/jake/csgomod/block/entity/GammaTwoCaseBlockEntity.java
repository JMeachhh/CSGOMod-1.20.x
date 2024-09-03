package net.jake.csgomod.block.entity;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class GammaTwoCaseBlockEntity extends BaseCaseBlockEntity {
    public GammaTwoCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        this.setDropList(createGammaTwoCaseDropList());
    }

    private static List<Item> createGammaTwoCaseDropList() {
        List<Item> drops = new ArrayList<>();
        drops.add(ModItems.GAMMA_TWO_CASE_KEY.get());
        return drops;
    }
}

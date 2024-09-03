package net.jake.csgomod.block.entity;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class ChromaTwoCaseBlockEntity extends BaseCaseBlockEntity {
    public ChromaTwoCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        this.setDropList(createChromaTwoCaseDropList());
    }

    private static List<Item> createChromaTwoCaseDropList() {
        List<Item> drops = new ArrayList<>();
        drops.add(ModItems.CHROMA_TWO_CASE_KEY.get());
        return drops;
    }
}

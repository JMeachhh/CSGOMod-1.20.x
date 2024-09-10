package net.jake.csgomod.block.entity;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class DreamsAndNightmaresCaseBlockEntity extends BaseCaseBlockEntity {
    public DreamsAndNightmaresCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        this.setDropList(createDreamsAndNightmaresCaseDropList());
    }

    private static List<Item> createDreamsAndNightmaresCaseDropList() {
        List<Item> drops = new ArrayList<>();

//        // Special Item - 2/1000
//        drops.add(ModItems..get());
//        drops.add(ModItems..get());
//
//        // Covert Item - 6/1000
//        drops.add(ModItems..get());
//        drops.add(ModItems..get());
//        drops.add(ModItems..get());
//        drops.add(ModItems..get());
//        drops.add(ModItems..get());
//        drops.add(ModItems..get());
//
//        // Classified + Restricted 192/1000
//        // Per Item 96/1000
//        for (int i = 0; i < 96; i++){
//            drops.add(ModItems..get());
//            drops.add(ModItems..get());
//        }
//
//        // Mil-Spec Grade 800 / 1000
//        // Per Item 400 / 1000
//        for (int i = 0; i < 400; i++){
//            drops.add(ModItems..get());
//            drops.add(ModItems..get());
//        }
        return drops;
    }
}

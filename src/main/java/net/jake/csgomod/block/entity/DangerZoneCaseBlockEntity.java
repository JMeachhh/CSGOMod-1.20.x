package net.jake.csgomod.block.entity;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class DangerZoneCaseBlockEntity extends BaseCaseBlockEntity {
    public DangerZoneCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        this.setDropList(createDangerZoneCaseDropList());
    }

    private static List<Item> createDangerZoneCaseDropList() {
        List<Item> drops = new ArrayList<>();

        // Special Item - 2/1000
        drops.add(ModItems.CRISMON_WEB.get());
        drops.add(ModItems.SCORCHED.get());

        // Covert Item - 6/1000
        drops.add(ModItems.ASIIMOV.get());
        drops.add(ModItems.ASIIMOV.get());
        drops.add(ModItems.ASIIMOV.get());
        drops.add(ModItems.NEO_NOIR.get());
        drops.add(ModItems.NEO_NOIR.get());
        drops.add(ModItems.NEO_NOIR.get());

        // Classified + Restricted 192/1000
        // Per Item 96/1000
        for (int i = 0; i < 96; i++){
            drops.add(ModItems.MECHA_INDUSTRIES.get());
            drops.add(ModItems.FLASHBACK.get());
        }

        // Mil-Spec Grade 800 / 1000
        // Per Item 400 / 1000
        for (int i = 0; i < 400; i++){
            drops.add(ModItems.OXIDE_BLAZE.get());
            drops.add(ModItems.BLACK_SAND.get());
        }

        return drops;
    }
}

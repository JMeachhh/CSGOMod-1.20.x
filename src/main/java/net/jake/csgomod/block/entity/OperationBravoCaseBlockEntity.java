package net.jake.csgomod.block.entity;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class OperationBravoCaseBlockEntity extends BaseCaseBlockEntity {
    public OperationBravoCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        this.setDropList(createOperationBravoCaseDropList());
    }

    private static List<Item> createOperationBravoCaseDropList() {
        List<Item> drops = new ArrayList<>();

        // Special - 2/1000
        drops.add(ModItems.SLAUGHTER.get());
        drops.add(ModItems.FADE.get());

        // Covert Item - 6/1000
        drops.add(ModItems.FIRE_SERPENT.get());
        drops.add(ModItems.FIRE_SERPENT.get());
        drops.add(ModItems.FIRE_SERPENT.get());
        drops.add(ModItems.GOLDEN_KOI.get());
        drops.add(ModItems.GOLDEN_KOI.get());
        drops.add(ModItems.GOLDEN_KOI.get());

        // Classified + Restricted 192/1000
        // Per Item 96/1000
        for (int i = 0; i < 96; i++){
            drops.add(ModItems.OCEAN_FOAM.get());
            drops.add(ModItems.GRAPHITE.get());
        }

        // Mil-Spec Grade 800 / 1000
        // Per Item 400 / 1000
        for (int i = 0; i < 400; i++){
            drops.add(ModItems.OVERGROWTH.get());
            drops.add(ModItems.BRIGHTWATER.get());
        }


        return drops;
    }
}

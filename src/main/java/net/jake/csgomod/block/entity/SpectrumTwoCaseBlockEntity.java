package net.jake.csgomod.block.entity;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

public class SpectrumTwoCaseBlockEntity extends BaseCaseBlockEntity {
    public SpectrumTwoCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        this.setDropList(createSpectrumTwoCaseCaseDropList());
    }

    private static List<Item> createSpectrumTwoCaseCaseDropList() {
        List<Item> drops = new ArrayList<>();

        // Special Item - 2/1000
        drops.add(ModItems.DAMASCUS_STEEL.get());
        drops.add(ModItems.TIGER_TOOTH.get());

        // Covert item - 6/1000
        drops.add(ModItems.THE_EMPRESS.get());
        drops.add(ModItems.THE_EMPRESS.get());
        drops.add(ModItems.THE_EMPRESS.get());
        drops.add(ModItems.SEE_YA_LATER.get());
        drops.add(ModItems.SEE_YA_LATER.get());
        drops.add(ModItems.SEE_YA_LATER.get());

        // Classified + Restricted 192/1000
        // Per Item 96/1000
        for (int i = 0; i < 96; i++){
            drops.add(ModItems.LEADED_GLASS.get());
            drops.add(ModItems.GOO.get());
        }

        // Mil-Spec Grade 800 / 1000
        // Per Item 400 / 1000
        for (int i = 0; i < 400; i++){
            drops.add(ModItems.MORRIS.get());
            drops.add(ModItems.OFF_WORLD.get());
        }

        return drops;
    }
}

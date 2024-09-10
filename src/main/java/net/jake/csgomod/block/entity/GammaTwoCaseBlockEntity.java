package net.jake.csgomod.block.entity;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

public class GammaTwoCaseBlockEntity extends BaseCaseBlockEntity {
    public GammaTwoCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        this.setDropList(createGammaTwoCaseDropList());
    }

    private static List<Item> createGammaTwoCaseDropList() {
        List<Item> drops = new ArrayList<>();

        // Special Item - 2/1000
        drops.add(ModItems.GAMMA_DOPPPLER.get());
        drops.add(ModItems.AUTOTRONIC.get());

        // Covert Item - 6/1000
        drops.add(ModItems.NEON_REVOLUTION.get());
        drops.add(ModItems.NEON_REVOLUTION.get());
        drops.add(ModItems.NEON_REVOLUTION.get());
        drops.add(ModItems.ROLL_CAGE.get());
        drops.add(ModItems.ROLL_CAGE.get());
        drops.add(ModItems.ROLL_CAGE.get());

        // Classified + Restricted 192/1000
        // Per Item 96/1000
        for (int i = 0; i < 96; i++){
            drops.add(ModItems.FUEL_INJECTOR.get());
            drops.add(ModItems.AIRLOCK.get());
        }

        // Mil-Spec Grade 800 / 1000
        // Per Item 400 / 1000
        for (int i = 0; i < 400; i++){
            drops.add(ModItems.DIRECTIVE.get());
            drops.add(ModItems.WEASEL.get());
        }
        return drops;
    }
}

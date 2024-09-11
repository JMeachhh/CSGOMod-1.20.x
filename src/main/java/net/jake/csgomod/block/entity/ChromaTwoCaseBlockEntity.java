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
        // Special Item - 2/1000
        drops.add(ModItems.MARBLE_FADE.get());
        drops.add(ModItems.ULTRAVIOLET.get());

        // Covert Item - 6/1000
        drops.add(ModItems.HYPER_BEAST.get());
        drops.add(ModItems.HYPER_BEAST.get());
        drops.add(ModItems.HYPER_BEAST.get());
        drops.add(ModItems.NEON_RIDER.get());
        drops.add(ModItems.NEON_RIDER.get());
        drops.add(ModItems.NEON_RIDER.get());

        // Classified + Restricted 192/1000
        // Per Item 96/1000
        for (int i = 0; i < 96; i++){
            drops.add(ModItems.WORM_GOD.get());
            drops.add(ModItems.MONKEY_BUSINESS.get());
        }

        // Mil-Spec Grade 800 / 1000
        // Per Item 400 / 1000
        for (int i = 0; i < 400; i++){
            drops.add(ModItems.ORIGAMI.get());
            drops.add(ModItems.VALENCE.get());
        }
        return drops;
    }
}

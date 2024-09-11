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

        // Special Item - 2/1000
        drops.add(ModItems.BLACK_LAMINATE.get());
        drops.add(ModItems.LORE.get());

        // Covert Item - 6/1000
        drops.add(ModItems.NIGHTWISH.get());
        drops.add(ModItems.NIGHTWISH.get());
        drops.add(ModItems.NIGHTWISH.get());
        drops.add(ModItems.STARLIGHT_PROTECTOR.get());
        drops.add(ModItems.STARLIGHT_PROTECTOR.get());
        drops.add(ModItems.STARLIGHT_PROTECTOR.get());

        // Classified + Restricted 192/1000
        // Per Item 96/1000
        for (int i = 0; i < 96; i++){
            drops.add(ModItems.RAPID_EYE_MOVEMENT.get());
            drops.add(ModItems.NIGHT_TERROR.get());
        }

        // Mil-Spec Grade 800 / 1000
        // Per Item 400 / 1000
        for (int i = 0; i < 400; i++){
            drops.add(ModItems.LIFTED_SPIRITS.get());
            drops.add(ModItems.SPIRIT_BOARD.get());
        }
        return drops;
    }
}

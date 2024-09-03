package net.jake.csgomod.block.entity;

import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class ArmsDealCaseBlockEntity extends BaseCaseBlockEntity implements MenuProvider {
    public ArmsDealCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
        this.setDropList(createArmsDealCaseDropList());
    }

    private static List<Item> createArmsDealCaseDropList() {
        List<Item> drops = new ArrayList<>();
        drops.add(ModItems.CSGO_CASE_KEY.get());
        return drops;
    }
}

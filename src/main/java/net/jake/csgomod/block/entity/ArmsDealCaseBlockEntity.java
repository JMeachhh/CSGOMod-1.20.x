package net.jake.csgomod.block.entity;

import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class ArmsDealCaseBlockEntity extends BaseCaseBlockEntity{
    public ArmsDealCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
    }

    @Override
    public List<Item> dropList() {
        List<Item> drops = new ArrayList<>();
        drops.add(ModItems.BUTTERFLY_KNIFE.get());
        drops.add(ModItems.DEFUSE_KIT.get());
        return drops;
    }
}

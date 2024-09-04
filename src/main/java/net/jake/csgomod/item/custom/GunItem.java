package net.jake.csgomod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class GunItem extends Item {

    public GunItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }
}

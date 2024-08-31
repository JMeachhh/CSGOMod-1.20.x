package net.jake.csgomod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ArmsDealCaseKeyItem extends Item {

    public ArmsDealCaseKeyItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }
}

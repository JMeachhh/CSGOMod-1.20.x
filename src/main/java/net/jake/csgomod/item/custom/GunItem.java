package net.jake.csgomod.item.custom;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class GunItem extends Item {

    public GunItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }


    // Gun Holding Animation
    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public HumanoidModel.@Nullable ArmPose getArmPose(LivingEntity entityLiving, InteractionHand hand, ItemStack itemStack) {
                // Check if the item is in the main hand or offhand
                if (hand == InteractionHand.MAIN_HAND){
                    return HumanoidModel.ArmPose.CROSSBOW_HOLD; // Apply the pose to the main hand if holding item
                } else if (hand == InteractionHand.OFF_HAND){
                    return HumanoidModel.ArmPose.ITEM; // Apply the pose to the offhand if holding item
                } else {
                    return HumanoidModel.ArmPose.EMPTY; // Default pose for other scenarios
                }
            }
        });
    }
}

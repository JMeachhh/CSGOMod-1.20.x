package net.jake.csgomod.item;

import net.jake.csgomod.CSGOMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CSGOMod.MOD_ID);

    public static final RegistryObject<Item> BUTTERFLY_KNIFE = ITEMS.register("butterfly_knife",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FIVE_POUND_NOTE = ITEMS.register("five_pound_note",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

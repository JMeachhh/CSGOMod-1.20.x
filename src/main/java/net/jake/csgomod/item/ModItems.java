package net.jake.csgomod.item;

import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.item.custom.CSGOCaseKeyItem;
import net.jake.csgomod.item.custom.BaseCaseKeyItem;
import net.jake.csgomod.item.custom.DefuseKitItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CSGOMod.MOD_ID);

    public static final RegistryObject<Item> BUTTERFLY_KNIFE = ITEMS.register("butterfly_knife",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> FIVE_POUND_NOTE = ITEMS.register("five_pound_note",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POUND_COIN = ITEMS.register("pound_coin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEFUSE_KIT = ITEMS.register("defuse_kit",
            () -> new DefuseKitItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> BASE_CASE_KEY = ITEMS.register("base_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> CSGO_CASE_KEY = ITEMS.register("csgo_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> CHROMA_TWO_CASE_KEY = ITEMS.register("chroma_two_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> CLUTCH_CASE_KEY = ITEMS.register("clutch_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> DANGER_ZONE_CASE_KEY = ITEMS.register("danger_zone_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> DREAMS_AND_NIGHTMARES_CASE_KEY = ITEMS.register("dreams_and_nightmares_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> GAMMA_TWO_CASE_KEY = ITEMS.register("gamma_two_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> PRISMA_CASE_KEY = ITEMS.register("prisma_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));

    public static final RegistryObject<Item> SPECTRUM_TWO_CASE_KEY = ITEMS.register("spectrum_two_case_key",
            () -> new CSGOCaseKeyItem(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package net.jake.csgomod.item;

import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CSGOMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CASES_TAB = CREATIVE_MODE_TABS.register("cases_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BASE_CASE.get()))
                    .title(Component.translatable("creativetab.cases_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ARMS_DEAL_CASE.get());
                        output.accept(ModBlocks.CHROMA_TWO_CASE.get());
                        output.accept(ModBlocks.CLUTCH_CASE.get());
                        output.accept(ModBlocks.DANGER_ZONE_CASE.get());
                        output.accept(ModBlocks.DREAMS_AND_NIGHTMARES_CASE.get());
                        output.accept(ModBlocks.GAMMA_TWO_CASE.get());
                        output.accept(ModBlocks.OPERATION_BRAVO.get());
                        output.accept(ModBlocks.SPECTRUM_TWO_CASE.get());

                        // output.accept(ModBlocks.BASE_CASE.get());
                        // output.accept(ModBlocks.PRISMA_CASE.get());

                        output.accept(ModItems.CSGO_CASE_KEY.get());
                        output.accept(ModItems.CHROMA_TWO_CASE_KEY.get());
                        output.accept(ModItems.CLUTCH_CASE_KEY.get());
                        output.accept(ModItems.DANGER_ZONE_CASE_KEY.get());
                        output.accept(ModItems.DREAMS_AND_NIGHTMARES_CASE_KEY.get());
                        output.accept(ModItems.GAMMA_TWO_CASE_KEY.get());
                        output.accept(ModItems.SPECTRUM_TWO_CASE_KEY.get());

                        // output.accept(ModItems.BASE_CASE_KEY.get());
                        //output.accept(ModItems.BUTTERFLY_KNIFE.get());
                        // output.accept(ModItems.PRISMA_CASE_KEY.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> WEAPONS_TAB = CREATIVE_MODE_TABS.register("weapons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GAMMA_DOPPPLER.get()))
                    .title(Component.translatable("creativetab.weapons_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // Bayonet
                        output.accept(ModItems.SLAUGHTER.get());
                        output.accept(ModItems.FADE.get());
                        output.accept(ModItems.GAMMA_DOPPPLER.get());
                        output.accept(ModItems.AUTOTRONIC.get());

                        //Butterfly Knife
                        output.accept(ModItems.TIGER_TOOTH.get());
                        output.accept(ModItems.DAMASCUS_STEEL.get());
                        output.accept(ModItems.BLACK_LAMINATE.get());
                        output.accept(ModItems.LORE.get());

                        //Stilleto Knife
                        output.accept(ModItems.CRISMON_WEB.get());
                        output.accept(ModItems.SCORCHED.get());

                        // Glock
                        output.accept(ModItems.SEE_YA_LATER.get());
                        output.accept(ModItems.OFF_WORLD.get());
                        output.accept(ModItems.GOLDEN_KOI.get());
                        output.accept(ModItems.OCEAN_FOAM.get());
                        output.accept(ModItems.DIRECTIVE.get());
                        output.accept(ModItems.WEASEL.get());
                        output.accept(ModItems.LIFTED_SPIRITS.get());
                        output.accept(ModItems.MECHA_INDUSTRIES.get());
                        output.accept(ModItems.OXIDE_BLAZE.get());

                        // USP-S
                        output.accept(ModItems.OVERGROWTH.get());
                        output.accept(ModItems.FLASHBACK.get());

                        // TEC-9
                        output.accept(ModItems.FUEL_INJECTOR.get());

                        // Sawed Off
                        output.accept(ModItems.MORRIS.get());
                        output.accept(ModItems.SPIRIT_BOARD.get());
                        output.accept(ModItems.BLACK_SAND.get());

                        //MP9
                        output.accept(ModItems.GOO.get());
                        output.accept(ModItems.AIRLOCK.get());
                        output.accept(ModItems.STARLIGHT_PROTECTOR.get());

                        // FAMAS
                        output.accept(ModItems.ROLL_CAGE.get());
                        output.accept(ModItems.RAPID_EYE_MOVEMENT.get());

                        // M4A1-S
                        output.accept(ModItems.LEADED_GLASS.get());
                        output.accept(ModItems.BRIGHTWATER.get());
                        output.accept(ModItems.NIGHT_TERROR.get());

                        // AK47
                        output.accept(ModItems.THE_EMPRESS.get());
                        output.accept(ModItems.FIRE_SERPENT.get());
                        output.accept(ModItems.NEON_REVOLUTION.get());
                        output.accept(ModItems.NIGHTWISH.get());
                        output.accept(ModItems.ASIIMOV.get());

                        // AWP
                        output.accept(ModItems.GRAPHITE.get());
                        output.accept(ModItems.NEO_NOIR.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> CURRENCY_TAB = CREATIVE_MODE_TABS.register("currency_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.POUND_COIN.get()))
                    .title(Component.translatable("creativetab.currency_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.TEN_P_COIN.get());
                        output.accept(ModItems.TWENTY_P_COIN.get());
                        output.accept(ModItems.POUND_COIN.get());
                        output.accept(ModItems.FIVE_POUND_NOTE.get());
                        output.accept(ModItems.TWENTY_POUND_NOTE.get());
                        output.accept(ModItems.FIFTY_POUND_NOTE.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> CSGO_TAB = CREATIVE_MODE_TABS.register("csgo_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BOMB.get()))
                    .title(Component.translatable("creativetab.csgo_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.BOMB.get());
                        output.accept(ModItems.DEFUSE_KIT.get());

                    })
                    .build());
    public static void  register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

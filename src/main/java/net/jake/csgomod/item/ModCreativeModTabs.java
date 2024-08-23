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

    public static final RegistryObject<CreativeModeTab> CSGO_TAB = CREATIVE_MODE_TABS.register("csgo_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BASE_CASE.get()))
                    .title(Component.translatable("creativetab.csgo_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BUTTERFLY_KNIFE.get());
                        output.accept(ModItems.FIVE_POUND_NOTE.get());
                        output.accept(ModItems.POUND_COIN.get());
                        output.accept(ModItems.DEFUSE_KIT.get());
                        output.accept(ModItems.BASE_CASE_KEY.get());

                        output.accept(ModBlocks.BOMB.get());
                        output.accept(ModBlocks.BASE_CASE.get());
                    })
                    .build());
    public static void  register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

package net.jake.csgomod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.block.ModBlocks;
import net.jake.csgomod.item.ModItems;
import net.jake.csgomod.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = CSGOMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event){

        if(event.getType() == VillagerProfession.WEAPONSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 1),
                    new ItemStack(ModBlocks.ARMS_DEAL_CASE.get(), 1),
                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 2),
                    new ItemStack(ModBlocks.CHROMA_TWO_CASE.get(), 1),
                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 3),
                    new ItemStack(ModBlocks.CLUTCH_CASE.get(), 1),
                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 2),
                    new ItemStack(ModBlocks.DANGER_ZONE_CASE.get(), 1),
                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 1),
                    new ItemStack(ModBlocks.DREAMS_AND_NIGHTMARES_CASE.get(), 1),
                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 1),
                    new ItemStack(ModBlocks.GAMMA_TWO_CASE.get(), 1),
                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 1),
                    new ItemStack(ModBlocks.OPERATION_BRAVO.get(), 1),
                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 2),
                    new ItemStack(ModBlocks.PRISMA_CASE.get(), 1),
                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 2),
                    new ItemStack(ModBlocks.SPECTRUM_TWO_CASE.get(), 1),
                    3, 8, 0.02f));
        }


        // Custom Villagers

        if(event.getType() == ModVillagers.ARMS_DEAL_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5),
                    new ItemStack(ModItems.CSGO_CASE_KEY.get(), 1), 2, 8, 0.02f));

        }

        if(event.getType() == ModVillagers.CHROMA_TWO_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5),
                    new ItemStack(ModItems.CHROMA_TWO_CASE_KEY.get(), 1), 2, 8, 0.02f));

        }

        if(event.getType() == ModVillagers.CLUTCH_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5),
                    new ItemStack(ModItems.CLUTCH_CASE_KEY.get(), 1), 2, 8, 0.02f));

        }

        if(event.getType() == ModVillagers.DANGER_ZONE_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5),
                    new ItemStack(ModItems.DANGER_ZONE_CASE_KEY.get(), 1), 2, 8, 0.02f));

        }

        if(event.getType() == ModVillagers.DREAMS_AND_NIGHTMARES_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5),
                    new ItemStack(ModItems.DREAMS_AND_NIGHTMARES_CASE_KEY.get(), 1), 2, 8, 0.02f));

        }

        if(event.getType() == ModVillagers.GAMMA_TWO_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5),
                    new ItemStack(ModItems.GAMMA_TWO_CASE_KEY.get(), 1), 2, 8, 0.02f));

        }

        if(event.getType() == ModVillagers.OPERATION_BRAVO_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5),
                    new ItemStack(ModItems.CSGO_CASE_KEY.get(), 1), 2, 8, 0.02f));

        }

        if(event.getType() == ModVillagers.PRISMA_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5),
                    new ItemStack(ModItems.PRISMA_CASE_KEY.get(), 1), 2, 8, 0.02f));

        }

        if(event.getType() == ModVillagers.SPECTRUM_TWO_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5),
                    new ItemStack(ModItems.SPECTRUM_TWO_CASE_KEY.get(), 1), 2, 8, 0.02f));

        }
    }
    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 1),
                new ItemStack(ModBlocks.CLUTCH_CASE.get(), 1),
                3, 8, 0.02f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 1),
                new ItemStack(ModBlocks.ARMS_DEAL_CASE.get(), 1),
                3, 8, 0.02f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 1),
                new ItemStack(ModBlocks.OPERATION_BRAVO.get(), 1),
                3, 8, 0.02f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItems.POUND_COIN.get(), 2),
                new ItemStack(ModItems.CSGO_CASE_KEY.get(), 1),
                3, 8, 0.02f));
    }

}

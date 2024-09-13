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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = CSGOMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event){

        if(event.getType() == VillagerProfession.WEAPONSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

//            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(ModItems.TWENTY_POUND_NOTE.get(), 4),
//                    new ItemStack(ModBlocks.ARMS_DEAL_CASE.get(), 1),
//                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.POUND_COIN.get(), 3),
                    new ItemStack(ModBlocks.CHROMA_TWO_CASE.get(), 1),
                    3, 8, 0.02f));

//            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(ModItems.POUND_COIN.get(), 1),
//                    new ItemStack(ModBlocks.CLUTCH_CASE.get(), 1),
//                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.POUND_COIN.get(), 1),
                    new ItemStack(ModBlocks.DANGER_ZONE_CASE.get(), 1),
                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.TWENTY_P_COIN.get(), 6),
                    new ItemStack(ModBlocks.DREAMS_AND_NIGHTMARES_CASE.get(), 1),
                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.POUND_COIN.get(), 2),
                    new ItemStack(ModBlocks.GAMMA_TWO_CASE.get(), 1),
                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 11),
                    new ItemStack(ModBlocks.OPERATION_BRAVO.get(), 1),
                    3, 8, 0.02f));

//            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 2),
//                    new ItemStack(ModBlocks.PRISMA_CASE.get(), 1),
//                    3, 8, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.TEN_P_COIN.get(), 17),
                    new ItemStack(ModBlocks.SPECTRUM_TWO_CASE.get(), 1),
                    3, 8, 0.02f));
        }


        // Custom Villagers

//        if(event.getType() == ModVillagers.ARMS_DEAL_TRADER.get()) {
//            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
//
//            // level 1
//            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(ModItems.POUND_COIN.get(), 2),
//                    new ItemStack(ModItems.CSGO_CASE_KEY.get(), 1), 2, 8, 0.02f));
//
//        }

        if(event.getType() == ModVillagers.CHROMA_TWO_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.POUND_COIN.get(), 2),
                    new ItemStack(ModItems.CHROMA_TWO_CASE_KEY.get(), 1), 2, 4, 0.02f));

            // level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.VALENCE.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 2), 2, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.ORIGAMI.get(), 1),
                    new ItemStack(ModItems.TEN_P_COIN.get(), 1), 2, 12, 0.02f));


            // level 3
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MONKEY_BUSINESS.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 4), 2, 16, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.WORM_GOD.get(), 1),
                    new ItemStack(ModItems.TWENTY_P_COIN.get(), 8), 2, 16, 0.02f));


            // level 4
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.HYPER_BEAST.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 1), 2, 20, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.NEON_RIDER.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 7), 2, 20, 0.02f));

            // level 5
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MARBLE_FADE.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 11), 2, 24, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.ULTRAVIOLET.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 7), 2, 24, 0.02f));

        }

//        if(event.getType() == ModVillagers.CLUTCH_TRADER.get()) {
//            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
//
//            // level 1
//            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(ModItems.POUND_COIN.get(), 2),
//                    new ItemStack(ModItems.CLUTCH_CASE_KEY.get(), 1), 2, 8, 0.02f));
//
//        }

        if(event.getType() == ModVillagers.DANGER_ZONE_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.TWENTY_POUND_NOTE.get(), 1),
                    new ItemStack(ModItems.DANGER_ZONE_CASE_KEY.get(), 1), 2, 4, 0.02f));

            // level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OXIDE_BLAZE.get(), 1),
                    new ItemStack(ModItems.TEN_P_COIN.get(), 1), 2, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OXIDE_BLAZE.get(), 1),
                    new ItemStack(ModItems.TWENTY_P_COIN.get(), 1), 2, 12, 0.02f));


            // level 3
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MECHA_INDUSTRIES.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 5), 2, 16, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FLASHBACK.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 1), 2, 16, 0.02f));


            // level 4
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.ASIIMOV.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 2), 2, 20, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.NEO_NOIR.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 2), 2, 20, 0.02f));

            // level 5
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SCORCHED.get(), 1),
                    new ItemStack(ModItems.TWENTY_POUND_NOTE.get(), 10), 2, 24, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.CRISMON_WEB.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 20), 2, 24, 0.02f));


        }

        if(event.getType() == ModVillagers.DREAMS_AND_NIGHTMARES_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.POUND_COIN.get(), 2),
                    new ItemStack(ModItems.DREAMS_AND_NIGHTMARES_CASE_KEY.get(), 1), 2, 4, 0.02f));

            // level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SPIRIT_BOARD.get(), 1),
                    new ItemStack(ModItems.TWENTY_P_COIN.get(), 1), 2, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.LIFTED_SPIRITS.get(), 1),
                    new ItemStack(ModItems.TEN_P_COIN.get(), 1), 2, 12, 0.02f));

            // level 3
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.NIGHT_TERROR.get(), 1),
                    new ItemStack(ModItems.TWENTY_P_COIN.get(), 3), 2, 16, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RAPID_EYE_MOVEMENT.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 3), 2, 16, 0.02f));

            // level 4
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.NIGHTWISH.get(), 1),
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5), 2, 20, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.STARLIGHT_PROTECTOR.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 6), 2, 20, 0.02f));

            // level 5
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.BLACK_LAMINATE.get(), 1),
                    new ItemStack(ModItems.TWENTY_POUND_NOTE.get(), 6), 2, 24, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.LORE.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 40), 2, 24, 0.02f));

        }


        if(event.getType() == ModVillagers.GAMMA_TWO_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.POUND_COIN.get(), 2),
                    new ItemStack(ModItems.GAMMA_TWO_CASE_KEY.get(), 1), 2, 4, 0.02f));

            // level 2

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DIRECTIVE.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 1), 2, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.WEASEL.get(), 1),
                    new ItemStack(ModItems.TEN_P_COIN.get(), 4), 2, 12, 0.02f));

            // level 3

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FUEL_INJECTOR.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 7), 2, 16, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.AIRLOCK.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 6), 2, 16, 0.02f));

            // level 4
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.NEON_REVOLUTION.get(), 1),
                    new ItemStack(ModItems.TWENTY_POUND_NOTE.get(), 2), 2, 20, 0.02f));

            // level 4
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.ROLL_CAGE.get(), 1),
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 1), 2, 20, 0.02f));


            // level 5
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.GAMMA_DOPPPLER.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 17), 2, 24, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.AUTOTRONIC.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 24), 2, 24, 0.02f));
        }


        if(event.getType() == ModVillagers.OPERATION_BRAVO_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.POUND_COIN.get(), 2),
                    new ItemStack(ModItems.CSGO_CASE_KEY.get(), 1), 2, 4, 0.02f));

            // level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OVERGROWTH.get(), 1),
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5), 2, 12, 0.02f));

            // level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.BRIGHTWATER.get(), 1),
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 4), 2, 12, 0.02f));

            // level 3
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OCEAN_FOAM.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 2), 2, 16, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.GRAPHITE.get(), 1),
                    new ItemStack(ModItems.TWENTY_POUND_NOTE.get(), 6), 2, 16, 0.02f));

            // level 4
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FIRE_SERPENT.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 25), 2, 20, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.GOLDEN_KOI.get(), 1),
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 17), 2, 20, 0.02f));


            // level 5
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SLAUGHTER.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 10), 2, 24, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FADE.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 14), 2, 24, 0.02f));
        }

//        if(event.getType() == ModVillagers.PRISMA_TRADER.get()) {
//            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
//
//            // level 1
//            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(ModItems.POUND_COIN.get(), 2),
//                    new ItemStack(ModItems.PRISMA_CASE_KEY.get(), 1), 2, 8, 0.02f));
//
//        }

        if(event.getType() == ModVillagers.SPECTRUM_TWO_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.POUND_COIN.get(), 2),
                    new ItemStack(ModItems.SPECTRUM_TWO_CASE_KEY.get(), 1), 2, 4, 0.02f));


            // level 2

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MORRIS.get(), 1),
                    new ItemStack(ModItems.TEN_P_COIN.get(), 1), 2, 12, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.OFF_WORLD.get(), 1),
                    new ItemStack(ModItems.TEN_P_COIN.get(), 5), 2, 12, 0.02f));


            // level 3

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.LEADED_GLASS.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 7), 2, 16, 0.02f));


            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.GOO.get(), 1),
                    new ItemStack(ModItems.POUND_COIN.get(), 1), 2, 16, 0.02f));


            // level 4
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.THE_EMPRESS.get(), 1),
                    new ItemStack(ModItems.TWENTY_POUND_NOTE.get(), 4), 2, 20, 0.02f));

            // level 4
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SEE_YA_LATER.get(), 1),
                    new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 3), 2, 20, 0.02f));

            // level 5
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DAMASCUS_STEEL.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 20), 2, 24, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.TIGER_TOOTH.get(), 1),
                    new ItemStack(ModItems.FIFTY_POUND_NOTE.get(), 32), 2, 24, 0.02f));

        }
    }

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();


        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItems.FIVE_POUND_NOTE.get(), 5),
                new ItemStack(ModBlocks.OPERATION_BRAVO.get(), 1),
                3, 8, 0.02f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItems.POUND_COIN.get(), 2),
                new ItemStack(ModItems.CSGO_CASE_KEY.get(), 1),
                3, 8, 0.02f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItems.POUND_COIN.get(), 1),
                new ItemStack(ModItems.GAMMA_TWO_CASE_KEY.get(), 1),
                3, 8, 0.02f));
    }
}


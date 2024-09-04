package net.jake.csgomod.villager;

import com.google.common.collect.ImmutableSet;
import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {


    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, CSGOMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, CSGOMod.MOD_ID);


    // Arms Deal Trader
    public static final RegistryObject<PoiType> ARMS_DEAL_POI = POI_TYPES.register("arms_deal_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ARMS_DEAL_CASE.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> ARMS_DEAL_TRADER =
            VILLAGER_PROFESSIONS.register("armsdealtrader", () -> new VillagerProfession("armsdealtrader",
            holder -> holder.get() == ARMS_DEAL_POI.get(), holder -> holder.get() == ARMS_DEAL_POI.get(),
            ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    // Chroma Two Trader

    public static final RegistryObject<PoiType> CHROMA_TWO_POI = POI_TYPES.register("chroma_two_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.CHROMA_TWO_CASE.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> CHROMA_TWO_TRADER =
            VILLAGER_PROFESSIONS.register("chromatwotrader", () -> new VillagerProfession("chromatwotrader",
                    holder -> holder.get() == CHROMA_TWO_POI.get(), holder -> holder.get() == CHROMA_TWO_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    //Clutch Trader

    public static final RegistryObject<PoiType> CLUTCH_POI = POI_TYPES.register("clutch_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.CLUTCH_CASE.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> CLUTCH_TRADER =
            VILLAGER_PROFESSIONS.register("clutchtrader", () -> new VillagerProfession("clutchtrader",
                    holder -> holder.get() == CLUTCH_POI.get(), holder -> holder.get() == CLUTCH_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

        // Danger Zone Trader

    public static final RegistryObject<PoiType> DANGER_ZONE_POI = POI_TYPES.register("danger_zone_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.DANGER_ZONE_CASE.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> DANGER_ZONE_TRADER =
            VILLAGER_PROFESSIONS.register("dangerzonetrader", () -> new VillagerProfession("dangerzonetrader",
                    holder -> holder.get() == DANGER_ZONE_POI.get(), holder -> holder.get() == DANGER_ZONE_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    // Dreams And Nightmares Trader

    public static final RegistryObject<PoiType> DREAMS_AND_NIGHTMARES_POI = POI_TYPES.register("dreams_and_nightmares_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.DREAMS_AND_NIGHTMARES_CASE.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> DREAMS_AND_NIGHTMARES_TRADER =
            VILLAGER_PROFESSIONS.register("dreamsandnightmarestrader", () -> new VillagerProfession("dreamsandnightmarestrader",
                    holder -> holder.get() == DREAMS_AND_NIGHTMARES_POI.get(), holder -> holder.get() == DREAMS_AND_NIGHTMARES_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    // Gamma Two Trader

    public static final RegistryObject<PoiType> GAMMA_TWO_POI = POI_TYPES.register("gamma_two_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.GAMMA_TWO_CASE.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> GAMMA_TWO_TRADER =
            VILLAGER_PROFESSIONS.register("gammatwotrader", () -> new VillagerProfession("gammatwotrader",
                    holder -> holder.get() == GAMMA_TWO_POI.get(), holder -> holder.get() == GAMMA_TWO_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    // Operation Bravo Trader

    public static final RegistryObject<PoiType> OPERATION_BRAVO_POI = POI_TYPES.register("operation_bravo_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.OPERATION_BRAVO.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> OPERATION_BRAVO_TRADER =
            VILLAGER_PROFESSIONS.register("operationbravotrader", () -> new VillagerProfession("operationbravotrader",
                    holder -> holder.get() == OPERATION_BRAVO_POI.get(), holder -> holder.get() == OPERATION_BRAVO_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    // Prisma Trader

    public static final RegistryObject<PoiType> PRISMA_POI = POI_TYPES.register("prisma_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.PRISMA_CASE.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> PRISMA_TRADER =
            VILLAGER_PROFESSIONS.register("prismatrader", () -> new VillagerProfession("prismatrader",
                    holder -> holder.get() == PRISMA_POI.get(), holder -> holder.get() == PRISMA_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    // Spectrum Two Trader

    public static final RegistryObject<PoiType> SPECTRUM_TWO_POI = POI_TYPES.register("spectrum_two_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.SPECTRUM_TWO_CASE.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> SPECTRUM_TWO_TRADER =
            VILLAGER_PROFESSIONS.register("spectrumtwotrader", () -> new VillagerProfession("spectrumtwotrader",
                    holder -> holder.get() == SPECTRUM_TWO_POI.get(), holder -> holder.get() == SPECTRUM_TWO_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}

package net.jake.csgomod.block.entity;

import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.block.ModBlocks;
import net.jake.csgomod.block.custom.BaseCaseBlock;
import net.jake.csgomod.block.custom.DangerZoneCaseBlock;
import net.jake.csgomod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CSGOMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<BaseCaseBlockEntity>> BASE_CASE_BE =
            BLOCK_ENTITIES.register("base_case_be", () ->
                    BlockEntityType.Builder.of(BaseCaseBlockEntity::new, ModBlocks.BASE_CASE.get()).build(null));
    public static final RegistryObject<BlockEntityType<ArmsDealCaseBlockEntity>> ARMS_DEAL_CASE_BE =
            BLOCK_ENTITIES.register("arms_deal_case_be", () ->
                    BlockEntityType.Builder.of(ArmsDealCaseBlockEntity::new, ModBlocks.ARMS_DEAL_CASE.get()).build(null));

    public static final RegistryObject<BlockEntityType<ChromaTwoCaseBlockEntity>> CHROMA_TWO_CASE_BE =
            BLOCK_ENTITIES.register("chroma_two_case_be", () ->
                    BlockEntityType.Builder.of(ChromaTwoCaseBlockEntity::new, ModBlocks.CHROMA_TWO_CASE.get()).build(null));


    public static final RegistryObject<BlockEntityType<ClutchCaseBlockEntity>> CLUTCH_CASE_BE =
            BLOCK_ENTITIES.register("clutch_case_be", () ->
                    BlockEntityType.Builder.of(ClutchCaseBlockEntity::new, ModBlocks.CLUTCH_CASE.get()).build(null));

    public static final RegistryObject<BlockEntityType<DangerZoneCaseBlockEntity>> DANGER_ZONE_CASE_BE =
            BLOCK_ENTITIES.register("danger_zone_case_be", () ->
                    BlockEntityType.Builder.of(DangerZoneCaseBlockEntity::new, ModBlocks.DANGER_ZONE_CASE.get()).build(null));


    public static final RegistryObject<BlockEntityType<DreamsAndNightmaresCaseBlockEntity>> DREAMS_AND_NIGHTMARES_CASE_BE =
            BLOCK_ENTITIES.register("dreams_and_nightmares_case_be", () ->
                    BlockEntityType.Builder.of(DreamsAndNightmaresCaseBlockEntity::new, ModBlocks.DREAMS_AND_NIGHTMARES_CASE.get()).build(null));

    public static final RegistryObject<BlockEntityType<GammaTwoCaseBlockEntity>> GAMMA_TWO_CASE_BE =
            BLOCK_ENTITIES.register("gamma_two_case_be", () ->
                    BlockEntityType.Builder.of(GammaTwoCaseBlockEntity::new, ModBlocks.GAMMA_TWO_CASE.get()).build(null));


    public static final RegistryObject<BlockEntityType<OperationBravoCaseBlockEntity>> OPERATION_BRAVO_CASE_BE =
            BLOCK_ENTITIES.register("operation_bravo_case_be", () ->
                    BlockEntityType.Builder.of(OperationBravoCaseBlockEntity::new, ModBlocks.OPERATION_BRAVO.get()).build(null));

    public static final RegistryObject<BlockEntityType<PrismaCaseBlockEntity>> PRISMA_CASE_BE =
            BLOCK_ENTITIES.register("prisma_case_be", () ->
                    BlockEntityType.Builder.of(PrismaCaseBlockEntity::new, ModBlocks.PRISMA_CASE.get()).build(null));

    public static final RegistryObject<BlockEntityType<SpectrumTwoCaseBlockEntity>> SPECTRUM_TWO_CASE_BE =
            BLOCK_ENTITIES.register("spectrum_two_case_be", () ->
                    BlockEntityType.Builder.of(SpectrumTwoCaseBlockEntity::new, ModBlocks.SPECTRUM_TWO_CASE.get()).build(null));


    public static final RegistryObject<BlockEntityType<BombBlockEntity>> BOMB_BE =
            BLOCK_ENTITIES.register("bomb_be", () ->
                    BlockEntityType.Builder.of(BombBlockEntity::new,
                            ModBlocks.BOMB.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}

package net.jake.csgomod.block.entity;

import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CSGOMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<BaseCaseBlockEntity>> BASE_CASE_BE =
            BLOCK_ENTITIES.register("base_case_be", () ->
                    BlockEntityType.Builder.of(BaseCaseBlockEntity::new,
                    ModBlocks.BASE_CASE.get()).build(null));

    public static final RegistryObject<BlockEntityType<BombBlockEntity>> BOMB_BE =
            BLOCK_ENTITIES.register("bomb_be", () ->
                    BlockEntityType.Builder.of(BombBlockEntity::new,
                            ModBlocks.BOMB.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}

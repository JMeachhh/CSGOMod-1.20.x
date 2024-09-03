package net.jake.csgomod.block;

import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.block.custom.*;
import net.jake.csgomod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CSGOMod.MOD_ID);


    public static final RegistryObject<Block> BOMB = registerBlock("bomb",
            () -> new BombBlock(BlockBehaviour.Properties.copy(Blocks.CHAIN).sound(SoundType.BASALT).noOcclusion()));

    public static final RegistryObject<Block> BASE_CASE = registerBlock("base_case",
            () -> new BaseCaseBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion(), "item.csgomod.base_case_key"));

    public static final RegistryObject<Block> ARMS_DEAL_CASE = registerBlock("arms_deal_case",
            () -> new ArmsDealCaseBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> CHROMA_TWO_CASE = registerBlock("chroma_two_case",
            () -> new ChromaTwoCaseBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> CLUTCH_CASE = registerBlock("clutch_case",
            () -> new ClutchCaseBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> DANGER_ZONE_CASE = registerBlock("danger_zone_case",
            () -> new DangerZoneCaseBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> DREAMS_AND_NIGHTMARES_CASE = registerBlock("dreams_and_nightmares_case",
            () -> new DreamsAndNightmaresCaseBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> GAMMA_TWO_CASE = registerBlock("gamma_two_case",
            () -> new GammaTwoCaseBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> OPERATION_BRAVO = registerBlock("operation_bravo_case",
            () -> new OperationBravoCaseBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));
    public static final RegistryObject<Block> PRISMA_CASE = registerBlock("prisma_case",
            () -> new PrismaCaseBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> SPECTRUM_TWO_CASE = registerBlock("spectrum_two_case",
            () -> new SpectrumTwoCaseBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}

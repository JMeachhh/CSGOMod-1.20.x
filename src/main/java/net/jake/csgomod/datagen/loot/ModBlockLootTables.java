package net.jake.csgomod.datagen.loot;

import net.jake.csgomod.block.ModBlocks;
import net.jake.csgomod.block.custom.BaseCaseBlock;
import net.jake.csgomod.block.entity.BaseCaseBlockEntity;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.BOMB.get());
        this.dropSelf(ModBlocks.BASE_CASE.get());
        this.dropSelf(ModBlocks.ARMS_DEAL_CASE.get());
        this.dropSelf(ModBlocks.CHROMA_TWO_CASE.get());
        this.dropSelf(ModBlocks.CLUTCH_CASE.get());
        this.dropSelf(ModBlocks.DANGER_ZONE_CASE.get());
        this.dropSelf(ModBlocks.DREAMS_AND_NIGHTMARES_CASE.get());
        this.dropSelf(ModBlocks.GAMMA_TWO_CASE.get());
        this.dropSelf(ModBlocks.OPERATION_BRAVO.get());
        this.dropSelf(ModBlocks.PRISMA_CASE.get());
        this.dropSelf(ModBlocks.SPECTRUM_TWO_CASE.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

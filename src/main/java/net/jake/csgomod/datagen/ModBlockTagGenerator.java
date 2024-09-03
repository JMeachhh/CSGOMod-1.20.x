package net.jake.csgomod.datagen;

import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.block.ModBlocks;
import net.jake.csgomod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CSGOMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.CASES)
                .add(ModBlocks.BASE_CASE.get()).addTag(ModTags.Blocks.CASES)
                .add(ModBlocks.ARMS_DEAL_CASE.get()).addTag(ModTags.Blocks.CASES)
                .add(ModBlocks.CHROMA_TWO_CASE.get()).addTag(ModTags.Blocks.CASES)
                .add(ModBlocks.CLUTCH_CASE.get()).addTag(ModTags.Blocks.CASES)
                .add(ModBlocks.DANGER_ZONE_CASE.get()).addTag(ModTags.Blocks.CASES)
                .add(ModBlocks.GAMMA_TWO_CASE.get()).addTag(ModTags.Blocks.CASES)
                .add(ModBlocks.PRISMA_CASE.get()).addTag(ModTags.Blocks.CASES)
                .add(ModBlocks.SPECTRUM_TWO_CASE.get()).addTag(ModTags.Blocks.CASES)
                .add(ModBlocks.DREAMS_AND_NIGHTMARES_CASE.get()).addTag(ModTags.Blocks.CASES)
                .add(ModBlocks.OPERATION_BRAVO.get()).addTag(ModTags.Blocks.CASES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BASE_CASE.get(),
                        ModBlocks.ARMS_DEAL_CASE.get(),
                        ModBlocks.CHROMA_TWO_CASE.get(),
                        ModBlocks.CLUTCH_CASE.get(),
                        ModBlocks.DANGER_ZONE_CASE.get(),
                        ModBlocks.GAMMA_TWO_CASE.get(),
                        ModBlocks.GAMMA_TWO_CASE.get(),
                        ModBlocks.PRISMA_CASE.get(),
                        ModBlocks.SPECTRUM_TWO_CASE.get(),
                        ModBlocks.DREAMS_AND_NIGHTMARES_CASE.get(),
                        ModBlocks.OPERATION_BRAVO.get(),

                    ModBlocks.BOMB.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.BOMB.get());


    }

}

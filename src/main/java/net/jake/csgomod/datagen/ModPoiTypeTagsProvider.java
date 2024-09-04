package net.jake.csgomod.datagen;

import net.jake.csgomod.CSGOMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PoiTypeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.PoiTypeTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModPoiTypeTagsProvider extends PoiTypeTagsProvider {
    public ModPoiTypeTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pProvider, CSGOMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(PoiTypeTags.ACQUIRABLE_JOB_SITE)
                .addOptional(new ResourceLocation(CSGOMod.MOD_ID, "arms_deal_poi"))
                .addOptional(new ResourceLocation(CSGOMod.MOD_ID, "chroma_two_poi"))
                .addOptional(new ResourceLocation(CSGOMod.MOD_ID, "clutch_poi"))
                .addOptional(new ResourceLocation(CSGOMod.MOD_ID, "danger_zone_poi"))
                .addOptional(new ResourceLocation(CSGOMod.MOD_ID, "dreams_and_nightmares_poi"))
                .addOptional(new ResourceLocation(CSGOMod.MOD_ID, "gamma_two_poi"))
                .addOptional(new ResourceLocation(CSGOMod.MOD_ID, "operation_bravo_poi"))
                .addOptional(new ResourceLocation(CSGOMod.MOD_ID, "prisma_poi"))
                .addOptional(new ResourceLocation(CSGOMod.MOD_ID, "spectrum_two_poi"));

    }
}

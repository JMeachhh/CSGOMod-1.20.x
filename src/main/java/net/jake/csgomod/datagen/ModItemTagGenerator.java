package net.jake.csgomod.datagen;

import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.block.ModBlocks;
import net.jake.csgomod.item.ModItems;
import net.jake.csgomod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, CSGOMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Items.CURRENCY)
                .add(ModItems.FIVE_POUND_NOTE.get()).addTag(ModTags.Items.CURRENCY)
                .add(ModItems.POUND_COIN.get()).addTag(ModTags.Items.CURRENCY);

        this.tag(ModTags.Items.KEYS)
                .add(ModItems.BASE_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.CSGO_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.CHROMA_TWO_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.DANGER_ZONE_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.DREAMS_AND_NIGHTMARES_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.GAMMA_TWO_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.PRISMA_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.SPECTRUM_TWO_CASE_KEY.get()).addTag(ModTags.Items.KEYS);



        this.tag(ModTags.Items.BASE_CASE_DROPS)
                .add(ModItems.BUTTERFLY_KNIFE.get()).addTag(ModTags.Items.BASE_CASE_DROPS);
//                .add();

    }
}

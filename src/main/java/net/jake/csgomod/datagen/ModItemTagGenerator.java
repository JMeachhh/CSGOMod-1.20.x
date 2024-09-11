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
                .add(ModItems.POUND_COIN.get()).addTag(ModTags.Items.CURRENCY)
                .add(ModItems.FIFTY_POUND_NOTE.get()).addTag(ModTags.Items.CURRENCY)
                .add(ModItems.TWENTY_POUND_NOTE.get()).addTag(ModTags.Items.CURRENCY)
                .add(ModItems.TWENTY_P_COIN.get()).addTag(ModTags.Items.CURRENCY)
                .add(ModItems.TEN_P_COIN.get()).addTag(ModTags.Items.CURRENCY);

        this.tag(ModTags.Items.KEYS)
                .add(ModItems.BASE_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.CSGO_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.CHROMA_TWO_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.DANGER_ZONE_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.DREAMS_AND_NIGHTMARES_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.GAMMA_TWO_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.PRISMA_CASE_KEY.get()).addTag(ModTags.Items.KEYS)
                .add(ModItems.SPECTRUM_TWO_CASE_KEY.get()).addTag(ModTags.Items.KEYS);



        this.tag(ModTags.Items.KNIVES)
                .add(ModItems.BUTTERFLY_KNIFE.get()).addTag(ModTags.Items.KNIVES)
                .add(ModItems.TIGER_TOOTH.get()).addTag(ModTags.Items.KNIVES)
                .add(ModItems.DAMASCUS_STEEL.get()).addTag(ModTags.Items.KNIVES)
                .add(ModItems.SLAUGHTER.get()).addTag(ModTags.Items.KNIVES)
                .add(ModItems.FADE.get()).addTag(ModTags.Items.KNIVES)
                .add(ModItems.GAMMA_DOPPPLER.get()).addTag(ModTags.Items.KNIVES)
                .add(ModItems.AUTOTRONIC.get()).addTag(ModTags.Items.KNIVES)
                .add(ModItems.BLACK_LAMINATE.get()).addTag(ModTags.Items.KNIVES)
                .add(ModItems.LORE.get()).addTag(ModTags.Items.KNIVES)
                .add(ModItems.CRISMON_WEB.get()).addTag(ModTags.Items.KNIVES)
                .add(ModItems.SCORCHED.get()).addTag(ModTags.Items.KNIVES);

        this.tag(ModTags.Items.GUNS)
                .add(ModItems.THE_EMPRESS.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.SEE_YA_LATER.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.LEADED_GLASS.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.GOO.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.MORRIS.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.OFF_WORLD.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.FIRE_SERPENT.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.GOLDEN_KOI.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.OCEAN_FOAM.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.GRAPHITE.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.OVERGROWTH.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.BRIGHTWATER.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.NEON_REVOLUTION.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.ROLL_CAGE.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.FUEL_INJECTOR.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.AIRLOCK.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.DIRECTIVE.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.WEASEL.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.NIGHTWISH.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.STARLIGHT_PROTECTOR.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.NIGHT_TERROR.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.RAPID_EYE_MOVEMENT.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.SPIRIT_BOARD.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.LIFTED_SPIRITS.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.NEO_NOIR.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.ASIIMOV.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.MECHA_INDUSTRIES.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.FLASHBACK.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.OXIDE_BLAZE.get()).addTag(ModTags.Items.GUNS)
                .add(ModItems.BLACK_SAND.get()).addTag(ModTags.Items.GUNS);


    }
}

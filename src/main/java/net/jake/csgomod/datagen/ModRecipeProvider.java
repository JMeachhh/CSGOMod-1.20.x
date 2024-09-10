package net.jake.csgomod.datagen;

import net.jake.csgomod.block.ModBlocks;
import net.jake.csgomod.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TEN_P_COIN.get())
                .pattern("III")
                .pattern("I#I")
                .pattern("III")
                .define('#', Items.EMERALD)
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter, "ten_p_coin_create");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TWENTY_P_COIN.get())
                .pattern("   ")
                .pattern("T#T")
                .pattern("   ")
                .define('T', ModItems.TEN_P_COIN.get())
                .define('#', Items.IRON_BLOCK)
                .unlockedBy(getHasName(ModItems.TEN_P_COIN.get()), has(ModItems.TEN_P_COIN.get()))
                .save(pWriter, "twenty_p_coin_create");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.POUND_COIN.get())
                .pattern("   ")
                .pattern("TTT")
                .pattern("TCT")
                .define('C', Items.COPPER_INGOT)
                .define('T', ModItems.TWENTY_P_COIN.get())
                .unlockedBy(getHasName(ModItems.TWENTY_P_COIN.get()), has(ModItems.TWENTY_P_COIN.get()))
                .save(pWriter, "pound_coin_create");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FIVE_POUND_NOTE.get())
                .pattern("   ")
                .pattern("###")
                .pattern("#P#")
                .define('#', ModItems.POUND_COIN.get())
                .define('P', Items.PAPER)
                .unlockedBy(getHasName(ModItems.POUND_COIN.get()), has(ModItems.POUND_COIN.get()))
                .save(pWriter, "five_pound_note_create");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TWENTY_POUND_NOTE.get())
                .pattern("###")
                .pattern("PHP")
                .pattern("PPP")
                .define('P', ModItems.POUND_COIN.get())
                .define('H', Items.PAPER)
                .define('#', ModItems.FIVE_POUND_NOTE.get())
                .unlockedBy(getHasName(ModItems.FIVE_POUND_NOTE.get()), has(ModItems.FIVE_POUND_NOTE.get()))
                .save(pWriter, "twenty_pound_note_create");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FIFTY_POUND_NOTE.get())
                .pattern(" # ")
                .pattern("THT")
                .pattern(" # ")
                .define('T', ModItems.TWENTY_POUND_NOTE.get())
                .define('H', Items.PAPER)
                .define('#', ModItems.FIVE_POUND_NOTE.get())
                .unlockedBy(getHasName(ModItems.TWENTY_POUND_NOTE.get()), has(ModItems.TWENTY_POUND_NOTE.get()))
                .save(pWriter, "fifty_pound_note_create");


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TEN_P_COIN.get(), 2)
                .requires(ModItems.TWENTY_P_COIN.get())
                .unlockedBy(getHasName(ModItems.TWENTY_P_COIN.get()), has(ModItems.TWENTY_P_COIN.get()))
                .save(pWriter, "ten_p_coin_from_twenty_p_coin");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TWENTY_P_COIN.get(), 5)
                .requires(ModItems.POUND_COIN.get())
                .unlockedBy(getHasName(ModItems.POUND_COIN.get()), has(ModItems.POUND_COIN.get()))
                .save(pWriter, "twenty_p_coin_from_pound_coin");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POUND_COIN.get(), 5)
                .requires(ModItems.FIVE_POUND_NOTE.get())
                .unlockedBy(getHasName(ModItems.FIVE_POUND_NOTE.get()), has(ModItems.FIVE_POUND_NOTE.get()))
                .save(pWriter, "pound_coin_from_five_pound_note");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FIVE_POUND_NOTE.get(), 4)
                .requires(ModItems.TWENTY_POUND_NOTE.get())
                .unlockedBy(getHasName(ModItems.TWENTY_POUND_NOTE.get()), has(ModItems.TWENTY_POUND_NOTE.get()))
                .save(pWriter, "five_pound_note_from_twenty_pound_note");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FIFTY_POUND_NOTE.get(), 10)
                .requires(ModItems.FIFTY_POUND_NOTE.get())
                .unlockedBy(getHasName(ModItems.FIFTY_POUND_NOTE.get()), has(ModItems.FIFTY_POUND_NOTE.get()))
                .save(pWriter, "twenty_pound_note_from_fifty_pound_note");
    }
}
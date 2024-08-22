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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FIVE_POUND_NOTE.get())
                .pattern("   ")
                .pattern("###")
                .pattern("#P#")
                .define('#', ModItems.POUND_COIN.get())
                .define('P', Items.PAPER)
                .unlockedBy(getHasName(ModItems.POUND_COIN.get()), has(ModItems.POUND_COIN.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POUND_COIN.get(), 5)
                .requires(ModItems.FIVE_POUND_NOTE.get())
                .unlockedBy(getHasName(ModItems.FIVE_POUND_NOTE.get()), has(ModItems.FIVE_POUND_NOTE.get()))
                .save(pWriter);
    }
}

package net.jake.csgomod.datagen;

import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CSGOMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.BOMB.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/bomb")));

        simpleBlock(ModBlocks.BASE_CASE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/base_case")));

        simpleBlock(ModBlocks.ARMS_DEAL_CASE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/arms_deal_case")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

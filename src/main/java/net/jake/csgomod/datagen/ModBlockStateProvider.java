package net.jake.csgomod.datagen;

import net.jake.csgomod.CSGOMod;
import net.jake.csgomod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
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

        simpleBlock(ModBlocks.CHROMA_TWO_CASE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/chroma_two_case")));

        simpleBlock(ModBlocks.CLUTCH_CASE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/clutch_case")));

        simpleBlock(ModBlocks.DANGER_ZONE_CASE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/danger_zone_case")));

        simpleBlock(ModBlocks.DREAMS_AND_NIGHTMARES_CASE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/dreams_and_nightmares_case")));

        simpleBlock(ModBlocks.GAMMA_TWO_CASE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/gamma_two_case")));

        simpleBlock(ModBlocks.OPERATION_BRAVO.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/operation_bravo_case")));

        simpleBlock(ModBlocks.PRISMA_CASE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/prisma_case")));

        simpleBlock(ModBlocks.SPECTRUM_TWO_CASE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/spectrum_two_case")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

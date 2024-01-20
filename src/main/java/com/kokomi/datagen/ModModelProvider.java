package com.kokomi.datagen;

import com.kokomi.block.ModBlocks;
import com.kokomi.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FU_XUAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_FU_XUAN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_FU_XUAN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FU_XUAN_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.NANA, Models.GENERATED);
        itemModelGenerator.register(ModItems.COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.FU_XUAN_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FU_XUAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
    }
}

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
        //纹理池
        BlockStateModelGenerator.BlockTexturePool fu_xuan_pool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FU_XUAN_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_FU_XUAN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_FU_XUAN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FU_XUAN_ORE);

        fu_xuan_pool.stairs(ModBlocks.FU_XUAN_STAIRS);
        fu_xuan_pool.slab(ModBlocks.FU_XUAN_SLAB);
        fu_xuan_pool.button(ModBlocks.FU_XUAN_BUTTON);
        fu_xuan_pool.pressurePlate(ModBlocks.FU_XUAN_PRESSURE_PLATE);
        fu_xuan_pool.fence(ModBlocks.FU_XUAN_FENCE);
        fu_xuan_pool.fenceGate(ModBlocks.FU_XUAN_FENCE_GATE);
        fu_xuan_pool.wall(ModBlocks.FU_XUAN_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.FU_XUAN_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FU_XUAN_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.NANA, Models.GENERATED);
        itemModelGenerator.register(ModItems.COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEACH, Models.GENERATED);
        itemModelGenerator.register(ModItems.FU_XUAN_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FU_XUAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
    }
}

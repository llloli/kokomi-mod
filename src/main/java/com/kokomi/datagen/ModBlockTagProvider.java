package com.kokomi.datagen;

import com.kokomi.block.ModBlocks;
import com.kokomi.item.ModItems;
import com.kokomi.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
//        探测器可探测方块的Tags
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_BLOCKS)
                .add(ModBlocks.FU_XUAN_ORE)
                .add(ModBlocks.END_FU_XUAN_ORE)
                .add(ModBlocks.DEEPSLATE_FU_XUAN_ORE)
                .forceAddTag(BlockTags.DIAMOND_ORES);

//        稿子采集
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.FU_XUAN_BLOCK)
                .add(ModBlocks.FU_XUAN_ORE)
                .add(ModBlocks.END_FU_XUAN_ORE)
                .add(ModBlocks.DEEPSLATE_FU_XUAN_ORE)
                .add(ModBlocks.FU_XUAN_BUTTON)
                .add(ModBlocks.FU_XUAN_DOOR)
                .add(ModBlocks.FU_XUAN_TRAPDOOR)
                .add(ModBlocks.FU_XUAN_PRESSURE_PLATE)
                .add(ModBlocks.FU_XUAN_STAIRS)
                .add(ModBlocks.FU_XUAN_SLAB)
                .add(ModBlocks.FU_XUAN_FENCE)
                .add(ModBlocks.FU_XUAN_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(ModBlocks.SOUND_BLOCK);
        //需要钻石级别
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK,new Identifier("fabric","needs_tool_level_4")))
                .add(ModBlocks.FU_XUAN_BLOCK)
                .add(ModBlocks.FU_XUAN_ORE)
                .add(ModBlocks.END_FU_XUAN_ORE)
                .add(ModBlocks.DEEPSLATE_FU_XUAN_ORE);

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.FU_XUAN_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.FU_XUAN_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.FU_XUAN_WALL);
        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES).add(ModBlocks.FU_XUAN_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.BUTTONS).add(ModBlocks.FU_XUAN_BUTTON);
        getOrCreateTagBuilder(BlockTags.SLABS).add(ModBlocks.FU_XUAN_SLAB);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS).add(ModBlocks.FU_XUAN_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.DOORS).add(ModBlocks.FU_XUAN_DOOR);
        getOrCreateTagBuilder(BlockTags.STAIRS).add(ModBlocks.FU_XUAN_STAIRS);
    }
}

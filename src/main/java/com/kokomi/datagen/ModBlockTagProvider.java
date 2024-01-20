package com.kokomi.datagen;

import com.kokomi.block.ModBlocks;
import com.kokomi.item.ModItems;
import com.kokomi.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

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
                .add(ModBlocks.DEEPSLATE_FU_XUAN_ORE);

        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(ModBlocks.SOUND_BLOCK);
        //需要钻石级别
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.FU_XUAN_BLOCK)
                .add(ModBlocks.FU_XUAN_ORE)
                .add(ModBlocks.END_FU_XUAN_ORE)
                .add(ModBlocks.DEEPSLATE_FU_XUAN_ORE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.FU_XUAN_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.FU_XUAN_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.FU_XUAN_WALL);
    }
}

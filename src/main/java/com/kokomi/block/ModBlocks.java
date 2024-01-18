package com.kokomi.block;

import com.kokomi.Kokomi;
import com.kokomi.item.custom.SoundBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block FU_XUAN_BLOCK = registerBlock("fu_xuan_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block FU_XUAN_ORE = registerBlock("fu_xuan_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(3F), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_FU_XUAN_ORE = registerBlock("deepslate_fu_xuan_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
                    .strength(4F), UniformIntProvider.create(3, 7)));
    public static final Block END_FU_XUAN_ORE = registerBlock("end_fu_xuan_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)
                    .strength(4F), UniformIntProvider.create(5, 7)));
    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)
                    .strength(1F)));

    private static Block registerBlock(String blockName, Block block) {
        registerBlockItem(blockName, block);
        return Registry.register(Registries.BLOCK, new Identifier(Kokomi.MOD_ID, blockName), block);
    }

    private static Item registerBlockItem(String blockName, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Kokomi.MOD_ID, blockName),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Kokomi.LOGGER.debug(Kokomi.MOD_ID + "registering ModBlocks...");
    }

}

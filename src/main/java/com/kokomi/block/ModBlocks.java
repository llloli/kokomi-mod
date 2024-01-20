package com.kokomi.block;

import com.kokomi.Kokomi;
import com.kokomi.item.custom.SoundBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block FU_XUAN_BLOCK = registerBlock("fu_xuan_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4F)));
    public static final Block FU_XUAN_ORE = registerBlock("fu_xuan_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(5F), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_FU_XUAN_ORE = registerBlock("deepslate_fu_xuan_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
                    .strength(6F), UniformIntProvider.create(3, 7)));
    public static final Block END_FU_XUAN_ORE = registerBlock("end_fu_xuan_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)
                    .strength(6F), UniformIntProvider.create(5, 7)));
    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)
                    .strength(1F)));
    public static final Block FU_XUAN_STAIRS = registerBlock("fu_xuan_stairs",
            new StairsBlock(ModBlocks.FU_XUAN_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FU_XUAN_SLAB = registerBlock("fu_xuan_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FU_XUAN_BUTTON = registerBlock("fu_xuan_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),BlockSetType.IRON,20,true));
    public static final Block FU_XUAN_PRESSURE_PLATE = registerBlock("fu_xuan_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING
                    ,FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),BlockSetType.IRON));
    public static final Block FU_XUAN_FENCE = registerBlock("fu_xuan_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FU_XUAN_FENCE_GATE = registerBlock("fu_xuan_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),WoodType.ACACIA));
    public static final Block FU_XUAN_WALL = registerBlock("fu_xuan_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FU_XUAN_DOOR = registerBlock("fu_xuan_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque(),BlockSetType.CHERRY));
    public static final Block FU_XUAN_TRAPDOOR = registerBlock("fu_xuan_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque(),BlockSetType.CHERRY));

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

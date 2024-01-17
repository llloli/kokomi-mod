package com.kokomi.block;

import com.kokomi.Kokomi;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block FU_XUAN_BLOCK = registerBlock("fu_xuan_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block FU_XUAN_ORE = registerBlock("fu_xuan_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private  static Block registerBlock(String blockName,Block block){
        registerBlockItem(blockName,block);
        return Registry.register(Registries.BLOCK,new Identifier(Kokomi.MOD_ID,blockName),block);
    }
    private static Item registerBlockItem(String blockName, Block block){
        return Registry.register(Registries.ITEM,new Identifier(Kokomi.MOD_ID,blockName),
                new BlockItem(block,new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        Kokomi.LOGGER.debug(Kokomi.MOD_ID+"registering ModBlocks...");
    }

}

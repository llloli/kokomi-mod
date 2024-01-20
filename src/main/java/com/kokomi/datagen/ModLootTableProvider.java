package com.kokomi.datagen;

import com.kokomi.block.ModBlocks;
import com.kokomi.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //普通掉落物
        addDrop(ModBlocks.SOUND_BLOCK);
        addDrop(ModBlocks.FU_XUAN_BLOCK);
        //矿物掉落物
        addDrop(ModBlocks.FU_XUAN_ORE, fuXuanOreDrops(ModBlocks.FU_XUAN_ORE, ModItems.FU_XUAN_STONE));
        addDrop(ModBlocks.DEEPSLATE_FU_XUAN_ORE, fuXuanOreDrops(ModBlocks.DEEPSLATE_FU_XUAN_ORE, ModItems.FU_XUAN_STONE));
        addDrop(ModBlocks.END_FU_XUAN_ORE, fuXuanOreDrops(ModBlocks.END_FU_XUAN_ORE, ModItems.FU_XUAN_STONE));

        addDrop(ModBlocks.FU_XUAN_STAIRS);
        addDrop(ModBlocks.FU_XUAN_TRAPDOOR);
        addDrop(ModBlocks.FU_XUAN_WALL);
        addDrop(ModBlocks.FU_XUAN_FENCE);
        addDrop(ModBlocks.FU_XUAN_FENCE_GATE);
        addDrop(ModBlocks.FU_XUAN_BUTTON);
        addDrop(ModBlocks.FU_XUAN_PRESSURE_PLATE);

        addDrop(ModBlocks.FU_XUAN_DOOR,doorDrops(ModBlocks.FU_XUAN_DOOR));
        addDrop(ModBlocks.FU_XUAN_SLAB,slabDrops(ModBlocks.FU_XUAN_SLAB));


    }

    public LootTable.Builder fuXuanOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ItemEntry.builder(item)
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}

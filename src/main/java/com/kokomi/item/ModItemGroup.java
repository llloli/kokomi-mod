package com.kokomi.item;

import com.kokomi.Kokomi;
import com.kokomi.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {
    public static void registerModItemGroup() {
        Kokomi.LOGGER.debug(Kokomi.MOD_ID + "registering ModItemGroup...");
    }

    public static final ItemGroup NanaGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Kokomi.MOD_ID, "nana"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.kokomi.nanagroup"))
                    .icon(() -> new ItemStack(ModItems.FU_XUAN_STONE)).entries((displayContext, entries) -> {
                        //添加到NanaGroup中
                        entries.add(ModItems.NANA);
                        entries.add(ModItems.FU_XUAN_STICK);
                        entries.add(ModItems.FU_XUAN_STONE);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.PEACH);
                        entries.add(ModItems.COAL);
                        entries.add(ModItems.RUBY_STAFF);
                        entries.add(ModItems.FU_XUAN_SWORD);
                        entries.add(ModItems.FU_XUAN_PICKAXE);




                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModBlocks.FU_XUAN_BLOCK);
                        entries.add(ModBlocks.FU_XUAN_STAIRS);
                        entries.add(ModBlocks.FU_XUAN_SLAB);
                        entries.add(ModBlocks.FU_XUAN_WALL);
                        entries.add(ModBlocks.FU_XUAN_FENCE);
                        entries.add(ModBlocks.FU_XUAN_FENCE_GATE);
                        entries.add(ModBlocks.FU_XUAN_DOOR);
                        entries.add(ModBlocks.FU_XUAN_TRAPDOOR);
                        entries.add(ModBlocks.FU_XUAN_PRESSURE_PLATE);
                        entries.add(ModBlocks.FU_XUAN_BUTTON);
                        entries.add(ModBlocks.FU_XUAN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_FU_XUAN_ORE);
                        entries.add(ModBlocks.END_FU_XUAN_ORE);










                    }).build());

}

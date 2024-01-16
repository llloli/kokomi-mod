package com.kokomi.item;

import com.kokomi.Kokomi;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.kokomi.Kokomi.MOD_ID;

public class ModItem {
    //添加一个叫做nana的物品
    public static final Item NANA = Registry.register(Registries.ITEM,
            new Identifier(MOD_ID,"nana"),
            new Item(new FabricItemSettings())
    );
    public static void registerItem() {
        Kokomi.LOGGER.debug(MOD_ID + "正在注册物品");
        //添加到工具物品组
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(NANA);
        });
    }
}

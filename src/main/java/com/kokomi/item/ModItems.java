package com.kokomi.item;

import com.kokomi.Kokomi;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.kokomi.Kokomi.MOD_ID;

public class ModItems {
    public static void registerModItem() {
        Kokomi.LOGGER.debug(MOD_ID + "registering ModItems...");
    }

    public static final Item NANA = registerItem("nana",
            new Item(new FabricItemSettings()));
    public static final Item FU_XUAN_STONE = registerItem("fu_xuan_stone",
            new Item(new FabricItemSettings()));
    public static final Item FU_XUAN_SWORD = registerItem("fu_xuan_sword",
            new Item(new FabricItemSettings()));

    public static Item registerItem(String itemName, Item item) {
        //注册到fabric注册表中
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, itemName), item);
    }


}

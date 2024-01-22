package com.kokomi.item;

import com.kokomi.Kokomi;
import com.kokomi.item.custom.MetalDetectorItem;
import com.kokomi.tooltip.FuXuanStoneToolTip;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.kokomi.Kokomi.MOD_ID;

public class ModItems {
    public static void registerModItem() {
        Kokomi.LOGGER.debug(MOD_ID + "registering ModItems...");
    }

    public static final Item NANA = registerItem("nana", new Item(new FabricItemSettings()));
    public static final Item FU_XUAN_STICK = registerItem("fu_xuan_stick",
            new Item(new FabricItemSettings()));
    public static final Item FU_XUAN_STONE = registerItem("fu_xuan_stone",
            new FuXuanStoneToolTip(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final Item PEACH = registerItem("peach",
            new Item(new FabricItemSettings().food(ModFoodComponents.PEACH)));
    public static final Item COAL = registerItem("coal",
            new Item(new FabricItemSettings()));
    public static final Item RUBY_STAFF = registerItem("ruby_staff",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item FU_XUAN_SWORD = registerItem("fu_xuan_sword",
            new SwordItem(ModToolMaterial.FU_XUAN_STONE, 5, -2.1f, new FabricItemSettings()));
    public static final Item FU_XUAN_PICKAXE = registerItem("fu_xuan_pickaxe",
            new PickaxeItem(ModToolMaterial.FU_XUAN_STONE, 1, -2.5f, new FabricItemSettings()));

    public static Item registerItem(String itemName, Item item) {
        //注册到fabric注册表中
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, itemName), item);
    }


}

package com.kokomi.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModCoalItem {

    public static void registerCoalItem() {
        FuelRegistry.INSTANCE.add(ModItems.COAL, 800);  //燃烧时间  800tick  40秒
    }
}

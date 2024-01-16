package com.kokomi;

import com.kokomi.item.ModItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Kokomi implements ModInitializer {
    public static final String MOD_ID = "kokomi";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItem.registerItem();

        LOGGER.info("-----------------------\n" +
                "mod is run~~\n" +
                "-----------------------");
    }
}
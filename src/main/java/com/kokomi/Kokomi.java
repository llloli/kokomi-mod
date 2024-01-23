package com.kokomi;

import com.kokomi.block.ModBlocks;
import com.kokomi.item.ModCoalItem;
import com.kokomi.item.ModItemGroup;
import com.kokomi.item.ModItems;
import com.kokomi.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Kokomi implements ModInitializer {
	public static final String MOD_ID = "kokomi";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mod is loading...");
		//注册物品组
		ModItemGroup.registerModItemGroup();
		//注册物品
		ModItems.registerModItem();
		//注册方块
		ModBlocks.registerModBlocks();
		//注册燃料
		ModCoalItem.registerCoalItem();

		ModWorldGeneration.generateModWorldGen();
	}
}
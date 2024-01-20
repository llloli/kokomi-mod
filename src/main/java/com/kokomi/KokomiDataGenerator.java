package com.kokomi;

import com.kokomi.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class KokomiDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);    //生成方块标签
		pack.addProvider(ModItemTagProvider::new);     //生成物品标签
		pack.addProvider(ModLootTableProvider::new);   //生成战利品掉落物
		pack.addProvider(ModRecipeProvider::new);      //生成配方
		pack.addProvider(ModModelProvider::new);       //生成模型
	}
}

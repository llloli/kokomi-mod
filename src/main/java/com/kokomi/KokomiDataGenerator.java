package com.kokomi;

import com.kokomi.datagen.*;
import com.kokomi.world.ModConfiguredFeatures;
import com.kokomi.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class KokomiDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);    //生成方块标签
		pack.addProvider(ModItemTagProvider::new);     //生成物品标签
		pack.addProvider(ModLootTableProvider::new);   //生成战利品掉落物
		pack.addProvider(ModRecipeProvider::new);      //生成配方
		pack.addProvider(ModModelProvider::new);       //生成模型
		pack.addProvider(ModWorldgenerator::new);       //生成矿石
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::boostrap);
	}
}

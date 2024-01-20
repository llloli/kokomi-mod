package com.kokomi.datagen;

import com.kokomi.block.ModBlocks;
import com.kokomi.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> FU_XUAN_STONE_SMELTABLES = List.of(ModItems.FU_XUAN_STONE,
            ModBlocks.FU_XUAN_ORE, ModBlocks.DEEPSLATE_FU_XUAN_ORE, ModBlocks.END_FU_XUAN_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, FU_XUAN_STONE_SMELTABLES, RecipeCategory.MISC, ModItems.FU_XUAN_STONE,
                2f, 200, "fu_xuan_stone");  //熔炉
        offerBlasting(exporter, FU_XUAN_STONE_SMELTABLES, RecipeCategory.MISC, ModItems.FU_XUAN_STONE,
                2f, 100, "fu_xuan_stone");  //高炉

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.FU_XUAN_STONE, RecipeCategory.DECORATIONS,
                ModBlocks.FU_XUAN_BLOCK);  //块相互合成

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FU_XUAN_SWORD, 1)
                .pattern("S")
                .pattern("S")
                .pattern("C")
                .input('C', Items.STICK)
                .input('S', ModItems.FU_XUAN_STONE)
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.FU_XUAN_STONE),conditionsFromItem(ModItems.FU_XUAN_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.FU_XUAN_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.METAL_DETECTOR, 1)
                .pattern(" S ")
                .pattern("SCS")
                .pattern(" S ")
                .input('C', Items.DIAMOND)
                .input('S', ModItems.FU_XUAN_STONE)
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(ModItems.FU_XUAN_STONE),conditionsFromItem(ModItems.FU_XUAN_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.METAL_DETECTOR)));
    }
}

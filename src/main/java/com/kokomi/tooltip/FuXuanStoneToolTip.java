package com.kokomi.tooltip;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FuXuanStoneToolTip extends Item {
    public FuXuanStoneToolTip(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        // 添加提示
        tooltip.add(Text.translatable("item.kokomi.fu_xuan_stone.tooltip").formatted(Formatting.AQUA));


        super.appendTooltip(stack, world, tooltip, context);
    }
}

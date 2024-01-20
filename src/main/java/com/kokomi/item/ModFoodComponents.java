package com.kokomi.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PEACH = new FoodComponent.Builder()
            .hunger(3)  //回复3饱食度
            .saturationModifier(0.25f)  //隐藏饱食度
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 2400), 0.5f) //持续2分钟，0.5概率

            .build();
}

package net.nicholas.tutmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    // Example: Cooked cheese restores 6 hunger and decent saturation
    public static final FoodProperties CHEESE = new FoodProperties.Builder()
            .nutrition(6)                 // Hunger points restored (1 = half-icon)
            .saturationModifier(0.6f)     // Saturation modifier
            .build();

    public static final FoodProperties RAW_CHEESE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 10, 2), 0.8f)
            .build();
}

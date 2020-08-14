package com.christopher.supercraft.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DIAMOND_APPLE;
    public static final FoodComponent ENCHANTED_DIAMOND_APPLE;

    static {
        DIAMOND_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4800, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 6000, 0),1.0F).alwaysEdible().build();
        ENCHANTED_DIAMOND_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 12000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 12000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4800, 4), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 9600, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 3), 1.0F).alwaysEdible().build();
    }
}

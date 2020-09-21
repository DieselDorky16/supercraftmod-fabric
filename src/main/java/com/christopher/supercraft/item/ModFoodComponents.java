package com.christopher.supercraft.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent COOKED_HOGLIN_MEAT;
    public static final FoodComponent DIAMOND_APPLE;
    public static final FoodComponent ENCHANTED_DIAMOND_APPLE;
    public static final FoodComponent ENCHANTED_NETHERITE_APPLE;
    public static final FoodComponent NETHERITE_APPLE;
    public static final FoodComponent HOGLIN_MEAT;


    static {
        COOKED_HOGLIN_MEAT = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).meat().build();
        DIAMOND_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4800, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 6000, 0),1.0F).alwaysEdible().build();
        ENCHANTED_DIAMOND_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 12000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 12000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4800, 4), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 9600, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 3), 1.0F).alwaysEdible().build();
        ENCHANTED_NETHERITE_APPLE = (new FoodComponent.Builder()).hunger(12).saturationModifier(3.6F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,800,5), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,19200,6), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,19200,0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,9600,4), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK,12000,5), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,19200,5), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,12000,2), 1.0F).alwaysEdible().build();
        HOGLIN_MEAT = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.8F).meat().build();
        NETHERITE_APPLE = (new FoodComponent.Builder()).hunger(8).saturationModifier(2.4F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,400,4), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,9600,5), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,9600,0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,4800,1), 1.0F).alwaysEdible().build();

    }
}

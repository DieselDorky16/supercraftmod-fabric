package com.christopher.supercraft.registry;

import com.christopher.supercraft.Supercraft;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPotions {
    public static final Potion BUFFED_HARMING= new Potion("healing", new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 2));
    public static final Potion BUFFED_HEALING= new Potion("healing", new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 2));
    public static final Potion BUFFED_POISON = new Potion(new StatusEffectInstance(StatusEffects.POISON, 900, 2));
    public static final Potion BUFFED_REGENERATION = new Potion(new StatusEffectInstance(StatusEffects.REGENERATION, 900, 2));
    public static final Potion BUFFED_STRENGTH = new Potion("strength", new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 2));
    public static final Potion BUFFED_WEAKNESS = new Potion("weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, 3600, 2));
    public static void registerPotions() {
        Registry.register(Registry.POTION, new Identifier(Supercraft.MOD_ID, "buffed_harming"), BUFFED_HARMING);
        Registry.register(Registry.POTION, new Identifier(Supercraft.MOD_ID, "buffed_healing"), BUFFED_HEALING);
        Registry.register(Registry.POTION, new Identifier(Supercraft.MOD_ID, "buffed_poison"), BUFFED_POISON);
        Registry.register(Registry.POTION, new Identifier(Supercraft.MOD_ID, "buffed_regeneration"), BUFFED_REGENERATION);
        Registry.register(Registry.POTION, new Identifier(Supercraft.MOD_ID, "buffed_strength"), BUFFED_STRENGTH);
        Registry.register(Registry.POTION, new Identifier(Supercraft.MOD_ID, "buffed_weakness"), BUFFED_WEAKNESS);
    }
}

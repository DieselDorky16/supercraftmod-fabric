package com.christopher.supercraft.registry;

import com.christopher.supercraft.Supercraft;
import com.christopher.supercraft.enchantments.SmeltingTouchEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SkyblockEnchantments {
    public static final Enchantment SMELTING_TOUCH = new SmeltingTouchEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[] {EquipmentSlot.MAINHAND});

    public static void registerEnchantments() {

        Registry.register(Registry.ENCHANTMENT, new Identifier(Supercraft.MOD_ID, "smelting_touch"), SMELTING_TOUCH);

    }
}

/*
Other possibilities (if i get around to it...):

- AIMING
- CLEAVING
- CRITICAL
- EXECUTE
- EXPERIENCE
- FIRST STRIKE
- GIANT KILLER
- INFINITE QUIVER
- LETHALITY
- LIFE STEAL
- LUCK
- REJUVINATE
- SCAVENGER
- VAMPIRISM
- VENOMUS
 */

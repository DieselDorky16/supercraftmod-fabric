package com.christopher.supercraft.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;

public class SmeltingTouchEnchantment extends Enchantment {
    public SmeltingTouchEnchantment(Enchantment.Rarity weight, EquipmentSlot... slotTypes) {
        super(weight, EnchantmentTarget.DIGGER, slotTypes);
    }

    public int getMinPower(int level) {return 15;}

    public int getMaxPower(int level) {
        return super.getMinPower(level) + 50;
    }

    public int getMaxLevel() {
        return 1;
    }

    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.FORTUNE && other != Enchantments.SILK_TOUCH;
    }
}

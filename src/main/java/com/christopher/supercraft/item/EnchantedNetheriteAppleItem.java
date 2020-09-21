package com.christopher.supercraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedNetheriteAppleItem extends Item {
    public EnchantedNetheriteAppleItem(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}

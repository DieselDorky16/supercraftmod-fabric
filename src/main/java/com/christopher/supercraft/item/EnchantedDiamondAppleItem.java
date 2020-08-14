package com.christopher.supercraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedDiamondAppleItem extends Item {
    public EnchantedDiamondAppleItem(Item.Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}

package com.christopher.supercraft.item.skyblock.rarity.enchanted;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class EnchantedVerySpecialItem extends Item {
    private static final Text rarityTooltip;
    public EnchantedVerySpecialItem(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(rarityTooltip);
        super.appendTooltip(stack, world, tooltip, context);
    }
    static {
        rarityTooltip = (new TranslatableText("tooltip.supercraft.rarity.very_special")).formatted(Formatting.DARK_RED, Formatting.BOLD);
    }
}

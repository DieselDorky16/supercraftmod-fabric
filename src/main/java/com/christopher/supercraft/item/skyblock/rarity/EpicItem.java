package com.christopher.supercraft.item.skyblock.rarity;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class EpicItem extends Item {
    private static final Text rarityTooltip;

    public EpicItem(Settings settings) {
        super(settings);
    }

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(rarityTooltip);
        super.appendTooltip(stack, world, tooltip, context);
    }

    static {
        rarityTooltip = (new TranslatableText("tooltip.supercraft.rarity.epic")).formatted(Formatting.BOLD, Formatting.LIGHT_PURPLE);
    }
}
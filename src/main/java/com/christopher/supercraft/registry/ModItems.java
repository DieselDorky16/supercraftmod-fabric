package com.christopher.supercraft.registry;

import com.christopher.supercraft.Supercraft;
import com.christopher.supercraft.item.EnchantedDiamondAppleItem;
import com.christopher.supercraft.item.ModFoodComponents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item DIAMOND_APPLE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.DIAMOND_APPLE));
    public static final Item ENCHANTED_DIAMOND_APPLE = new EnchantedDiamondAppleItem(new Item.Settings().group(ItemGroup.FOOD).rarity(Rarity.EPIC).food(ModFoodComponents.ENCHANTED_DIAMOND_APPLE));
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "diamond_apple"), DIAMOND_APPLE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_diamond_apple"), ENCHANTED_DIAMOND_APPLE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "mossy_polished_blackstone_bricks"), new BlockItem(ModBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "soul_magma_block"), new BlockItem(ModBlocks.SOUL_MAGMA_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
}

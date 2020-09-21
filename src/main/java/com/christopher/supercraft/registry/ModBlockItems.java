package com.christopher.supercraft.registry;

import com.christopher.supercraft.Supercraft;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockItems {
    //There is nothing new to register here...
    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "mossy_polished_blackstone_bricks"), new BlockItem(ModBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "mossy_polished_blackstone_brick_slab"), new BlockItem(ModBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "mossy_polished_blackstone_brick_stairs"), new BlockItem(ModBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "mossy_polished_blackstone_brick_wall"), new BlockItem(ModBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "soul_magma_block"), new BlockItem(ModBlocks.SOUL_MAGMA_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "basalt_stone"), new BlockItem(ModBlocks.BASALT_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "polished_basalt_stone"), new BlockItem(ModBlocks.POLISHED_BASALT_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}

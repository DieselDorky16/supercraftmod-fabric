package com.christopher.supercraft.item;

import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;

public class ModSpawnEggs {
    public static final Item ENDER_DRAGON_SPAWN_EGG = new SpawnEggItem(EntityType.ENDER_DRAGON, 0x000000, 0x2A093B, (new Item.Settings()).group(ItemGroup.MISC));
    public static final Item IRON_GOLEM_SPAWN_EGG = new SpawnEggItem(EntityType.IRON_GOLEM, 0xEEEEEE, 0xEB4D3D, (new Item.Settings()).group(ItemGroup.MISC));
    public static final Item ILLUSIONER_SPAWN_EGG = new SpawnEggItem(EntityType.ILLUSIONER, 0x005597, 0x949B9B, (new Item.Settings()).group(ItemGroup.MISC));
    public static final Item SNOW_GOLEM_SPAWN_EGG = new SpawnEggItem(EntityType.SNOW_GOLEM, 0xFFFFFF, 0xEBA351, (new Item.Settings()).group(ItemGroup.MISC));
    public static final Item WITHER_SPAWN_EGG = new SpawnEggItem(EntityType.WITHER, 0x000000, 0x2B1F2B, (new Item.Settings()).group(ItemGroup.MISC));
}

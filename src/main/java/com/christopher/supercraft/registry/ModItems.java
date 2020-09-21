package com.christopher.supercraft.registry;

import com.christopher.supercraft.Supercraft;
import com.christopher.supercraft.item.EnchantedDiamondAppleItem;
import com.christopher.supercraft.item.EnchantedNetheriteAppleItem;
import com.christopher.supercraft.item.IllagerEyeItem;
import com.christopher.supercraft.item.ModFoodComponents;
import com.christopher.supercraft.item.ModSpawnEggs;
import com.christopher.supercraft.item.PiglinEyeItem;
import com.christopher.supercraft.item.skyblock.rarity.enchanted.EnchantedLegendaryItem;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.OnAStickItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item COOKED_HOGLIN_MEAT = new Item(new Item.Settings().group(ItemGroup.FOOD).fireproof().food(ModFoodComponents.COOKED_HOGLIN_MEAT));
    public static final Item DIAMOND_APPLE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.DIAMOND_APPLE));
    public static final Item ENCHANTED_DIAMOND_APPLE = new EnchantedDiamondAppleItem(new Item.Settings().group(ItemGroup.FOOD).rarity(Rarity.EPIC).food(ModFoodComponents.ENCHANTED_DIAMOND_APPLE));
    public static final Item ENCHANTED_NETHERITE_APPLE = new EnchantedNetheriteAppleItem(new Item.Settings().group(ItemGroup.FOOD).rarity(Rarity.EPIC).food(ModFoodComponents.ENCHANTED_DIAMOND_APPLE));
    public static final Item HOGLIN_MEAT = new Item(new Item.Settings().group(ItemGroup.FOOD).fireproof().food(ModFoodComponents.HOGLIN_MEAT));
    public static final Item NETHERITE_APPLE = new Item(new Item.Settings().group(ItemGroup.FOOD).fireproof().food(ModFoodComponents.DIAMOND_APPLE));
    public static final Item COMPRESSED_DEBRIS = new EnchantedLegendaryItem(new Item.Settings().maxCount(64).group(ItemGroup.SEARCH));
    public static final Item PIGLIN_EYE = new PiglinEyeItem(new Item.Settings().group(ItemGroup.MISC));
    public static final Item ILLAGER_EYE = new IllagerEyeItem(new Item.Settings().group(ItemGroup.MISC));
    public static final Item CRIMSON_FUNGUS_ON_A_STICK = (Item)(new OnAStickItem((new Item.Settings()).maxDamage(100).group(ItemGroup.SEARCH), EntityType.HOGLIN, 1));
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "cooked_hoglin_meat"), COOKED_HOGLIN_MEAT);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "crimson_fungus_on_a_stick"), CRIMSON_FUNGUS_ON_A_STICK);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "diamond_apple"), DIAMOND_APPLE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_diamond_apple"), ENCHANTED_DIAMOND_APPLE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_netherite_apple"), ENCHANTED_NETHERITE_APPLE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "hoglin_meat"), HOGLIN_MEAT);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "netherite_apple"), NETHERITE_APPLE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "piglin_eye"), PIGLIN_EYE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "illager_eye"), ILLAGER_EYE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "compressed_debris"), COMPRESSED_DEBRIS);


    }
    public static void registerSpawnEggs() {
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "ender_dragon_spawn_egg"), ModSpawnEggs.ENDER_DRAGON_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "iron_golem_spawn_egg"), ModSpawnEggs.IRON_GOLEM_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "illusioner_spawn_egg"), ModSpawnEggs.ILLUSIONER_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "snow_golem_spawn_egg"), ModSpawnEggs.SNOW_GOLEM_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "wither_spawn_egg"), ModSpawnEggs.WITHER_SPAWN_EGG);
    }
}

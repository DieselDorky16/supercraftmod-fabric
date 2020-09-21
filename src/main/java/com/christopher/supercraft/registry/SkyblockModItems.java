package com.christopher.supercraft.registry;

import com.christopher.supercraft.Supercraft;
import com.christopher.supercraft.item.skyblock.rarity.enchanted.EnchantedRareItem;
import com.christopher.supercraft.item.skyblock.rarity.enchanted.EnchantedUncommonItem;
import com.christopher.supercraft.item.skyblock.special_tools.HealingWandItem;
import com.christopher.supercraft.item.skyblock.special_tools.MendingWandItem;
import com.christopher.supercraft.item.skyblock.special_tools.RestorationWandItem;
import com.christopher.supercraft.item.skyblock.tools.SculptorsAxeItem;
import com.christopher.supercraft.item.skyblock.weapons.EmeraldBladeItem;
import com.christopher.supercraft.item.skyblock.weapons.JerryAspectItem;
import com.christopher.supercraft.item.skyblock.weapons.RaiderAxeItem;
import com.christopher.supercraft.util.enums.ModToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SkyblockModItems {
    public static final Item ENCHANTED_OAK_LOG = new EnchantedUncommonItem(new Item.Settings().maxCount(64).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item ENCHANTED_SPRUCE_LOG = new EnchantedUncommonItem(new Item.Settings().maxCount(64).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item ENCHANTED_BIRCH_LOG = new EnchantedUncommonItem(new Item.Settings().maxCount(64).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item ENCHANTED_JUNGLE_LOG = new EnchantedUncommonItem(new Item.Settings().maxCount(64).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item ENCHANTED_ACACIA_LOG = new EnchantedUncommonItem(new Item.Settings().maxCount(64).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item ENCHANTED_DARK_OAK_LOG = new EnchantedUncommonItem(new Item.Settings().maxCount(64).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item ENCHANTED_CRIMSON_STEM = new EnchantedRareItem(new Item.Settings().maxCount(64).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item ENCHANTED_WARPED_STEM = new EnchantedRareItem(new Item.Settings().maxCount(64).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item ENCHANTED_COBBLESTONE = new EnchantedUncommonItem(new Item.Settings().maxCount(64).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item ENCHANTED_GLOWSTONE = new EnchantedUncommonItem(new Item.Settings().maxCount(64).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item SCULPTORS_AXE = new SculptorsAxeItem(ModToolMaterials.SCULPTOR, 7.0F, -3.2F, (new Item.Settings()).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item RAIDER_AXE = new RaiderAxeItem(ModToolMaterials.RAIDER, 15, 6, (new Item.Settings()).group(Supercraft.SKYBLOCK_ITEMS));

    public static final Item HEALING_WAND = new HealingWandItem(new Item.Settings().maxCount(1).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item MENDING_WAND = new MendingWandItem(new Item.Settings().maxCount(1).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item RESTORATION_WAND = new RestorationWandItem(new Item.Settings().maxCount(1).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item EMERALD_BLADE = new EmeraldBladeItem(new Item.Settings().maxCount(1).group(Supercraft.SKYBLOCK_ITEMS));
    public static final Item ASPECT_OF_THE_JERRY = new JerryAspectItem(ModToolMaterials.AOTJ, 3, -2.4F, (new Item.Settings()).group(Supercraft.SKYBLOCK_ITEMS));

    public static void registerSkyblockItems() {
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_cobblestone"), ENCHANTED_COBBLESTONE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_oak_log"), ENCHANTED_OAK_LOG);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_spruce_log"), ENCHANTED_SPRUCE_LOG);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_birch_log"), ENCHANTED_BIRCH_LOG);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_jungle_log"), ENCHANTED_JUNGLE_LOG);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_acacia_log"), ENCHANTED_ACACIA_LOG);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_dark_oak_log"), ENCHANTED_DARK_OAK_LOG);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_crimson_stem"), ENCHANTED_CRIMSON_STEM);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_warped_stem"), ENCHANTED_WARPED_STEM);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "enchanted_glowstone"), ENCHANTED_GLOWSTONE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "sculptors_axe"), SCULPTORS_AXE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "healing_wand"), HEALING_WAND);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "mending_wand"), MENDING_WAND);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "restoration_wand"), RESTORATION_WAND);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "raider_axe"), RAIDER_AXE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "emerald_blade"), EMERALD_BLADE);
        Registry.register(Registry.ITEM, new Identifier(Supercraft.MOD_ID, "aspect_of_the_jerry"), ASPECT_OF_THE_JERRY);
    }

}
/*
Other possibilities (if i get around to it...):

For Skyblock-Based Weapons:
- ASPECT OF THE END
- END SWORD
- SPIDER SWORD
- UNDEAD SWORD
- ZOMBIE SWORD

For Skyblock-Based Tools:
- PROMISING PICKAXE
- ROOKIE HOE (don't know how to code this one tbh...)
- SWEET AXE
- ZOMBIE PICKAXE

For Skyblock-based Bonuses:
- MORE LISTED HERE
 */
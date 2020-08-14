package com.christopher.supercraft;

import com.christopher.supercraft.registry.ModBlocks;
import com.christopher.supercraft.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Supercraft implements ModInitializer {
    public static final String MOD_ID = "supercraft";

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();

    }
}
package com.christopher.supercraft.registry;

import com.christopher.supercraft.Supercraft;
import com.christopher.supercraft.blocks.SoulMagmaBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE).strength(1.5F, 6.0F));
    public static final Block SOUL_MAGMA_BLOCK = new SoulMagmaBlock(AbstractBlock.Settings.of(Material.STONE, MaterialColor.NETHER).requiresTool().lightLevel((state) -> {
        return 1;
    }).ticksRandomly().strength(0.5F).allowsSpawning((state, world, pos, entityType) -> {
        return entityType.isFireImmune();
    }));
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Supercraft.MOD_ID, "mossy_polished_blackstone_bricks"), MOSSY_POLISHED_BLACKSTONE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Supercraft.MOD_ID, "soul_magma_block"), SOUL_MAGMA_BLOCK);

    }
}

package com.christopher.supercraft.registry;

import com.christopher.supercraft.Supercraft;
import com.christopher.supercraft.blocks.ModStairsBlock;
import com.christopher.supercraft.blocks.SoulMagmaBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE).strength(1.5F, 6.0F));
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(MOSSY_POLISHED_BLACKSTONE_BRICKS));
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = new ModStairsBlock(MOSSY_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(MOSSY_POLISHED_BLACKSTONE_BRICKS));
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(MOSSY_POLISHED_BLACKSTONE_BRICKS));
    public static final Block SOUL_MAGMA_BLOCK = new SoulMagmaBlock(AbstractBlock.Settings.of(Material.STONE, MaterialColor.NETHER).requiresTool().lightLevel((state) -> {
        return 1;
    }).ticksRandomly().strength(0.5F).allowsSpawning((state, world, pos, entityType) -> {
        return entityType.isFireImmune();
    }));
    public static final Block BASALT_STONE = new PillarBlock(AbstractBlock.Settings.of(Material.STONE, MaterialColor.BLACK).strength(1.25F,4.2F).sounds(BlockSoundGroup.BASALT));
    public static final Block POLISHED_BASALT_STONE = new PillarBlock(AbstractBlock.Settings.of(Material.STONE, MaterialColor.BLACK).strength(1.25F,4.2F).sounds(BlockSoundGroup.BASALT));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Supercraft.MOD_ID, "mossy_polished_blackstone_bricks"), MOSSY_POLISHED_BLACKSTONE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Supercraft.MOD_ID, "mossy_polished_blackstone_brick_slab"), MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Supercraft.MOD_ID, "mossy_polished_blackstone_brick_stairs"), MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Supercraft.MOD_ID, "mossy_polished_blackstone_brick_wall"), MOSSY_POLISHED_BLACKSTONE_BRICK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(Supercraft.MOD_ID, "soul_magma_block"), SOUL_MAGMA_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Supercraft.MOD_ID, "basalt_stone"), BASALT_STONE);
        Registry.register(Registry.BLOCK, new Identifier(Supercraft.MOD_ID, "polished_basalt_stone"), POLISHED_BASALT_STONE);

    }
    private static ToIntFunction<BlockState> createLightLevelFromBlockState(int litLevel) {
        return (blockState) -> {
            return (Boolean) blockState.get(Properties.LIT) ? litLevel : 0;
        };
    }
}

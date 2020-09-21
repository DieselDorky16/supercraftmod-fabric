package com.christopher.supercraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class ModBookshelfBlocks extends Block {
    public ModBookshelfBlocks(Settings settings) {
        super(Block.Settings.of(Material.WOOD).strength(1.5F).sounds(BlockSoundGroup.WOOD));
    }

    

}

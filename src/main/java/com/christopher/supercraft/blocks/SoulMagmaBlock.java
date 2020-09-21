package com.christopher.supercraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class SoulMagmaBlock extends Block {
    public SoulMagmaBlock(Block.Settings settings) {
        super(settings);
    }

    public void onSteppedOn(World world, BlockPos pos, Entity entity) {
        if (!entity.isFireImmune() && entity instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity)entity)) {
            entity.damage(DamageSource.HOT_FLOOR, 2.0F);
        }

        super.onSteppedOn(world, pos, entity);
    }

}

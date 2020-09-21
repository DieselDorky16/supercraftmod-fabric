package com.christopher.supercraft.item;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.EyeOfEnderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.RayTraceContext;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.StructureFeature;

public class PiglinEyeItem extends Item {
    public PiglinEyeItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        HitResult hitResult = rayTrace(world, user, RayTraceContext.FluidHandling.NONE);
            user.setCurrentHand(hand);
            if (world instanceof ServerWorld) {
                BlockPos blockPos = ((ServerWorld)world).getChunkManager().getChunkGenerator().locateStructure((ServerWorld)world, StructureFeature.BASTION_REMNANT, user.getBlockPos(), 100, false);
                if (blockPos != null) {
                    EyeOfEnderEntity eyeOfEnderEntity = new EyeOfEnderEntity(world, user.getX(), user.getBodyY(0.5D), user.getZ());
                    eyeOfEnderEntity.setItem(itemStack);
                    eyeOfEnderEntity.initTargetPos(blockPos);
                    world.spawnEntity(eyeOfEnderEntity);
                    if (user instanceof ServerPlayerEntity) {
                        Criteria.USED_ENDER_EYE.trigger((ServerPlayerEntity)user, blockPos);
                    }

                    world.playSound((PlayerEntity)null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ENDER_EYE_LAUNCH, SoundCategory.NEUTRAL, 0.5F, 0.4F / (RANDOM.nextFloat() * 0.4F + 0.8F));
                    world.syncWorldEvent((PlayerEntity)null, 1003, user.getBlockPos(), 0);
                    if (!user.abilities.creativeMode) {
                        itemStack.decrement(1);
                    }

                    user.incrementStat(Stats.USED.getOrCreateStat(this));
                    user.swingHand(hand, true);
                    return TypedActionResult.success(itemStack);
                }
            }

            return TypedActionResult.consume(itemStack);
        }
    }


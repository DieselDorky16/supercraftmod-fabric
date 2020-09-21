package com.christopher.supercraft.item.skyblock.weapons;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Vanishable;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.function.Consumer;

public class JerryAspectItem extends ToolItem implements Vanishable {
        private final float attackDamage;
        private final Multimap<EntityAttribute, EntityAttributeModifier> field_23745;

        public JerryAspectItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
            super(toolMaterial, settings);
            this.attackDamage = (float)attackDamage + toolMaterial.getAttackDamage();
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
            builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Weapon modifier", (double)this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
            builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Weapon modifier", (double)attackSpeed, EntityAttributeModifier.Operation.ADDITION));
            this.field_23745 = builder.build();
        }

        public float getAttackDamage() {
            return this.attackDamage;
        }

        public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
            return false;
        }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        BlockPos blockPos = user.getBlockPos();
        world.playSound(user, blockPos, SoundEvents.ENTITY_VILLAGER_AMBIENT, SoundCategory.PLAYERS, 1.0F, 1.0F);
            return super.use(world, user, hand);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
            return slot == EquipmentSlot.MAINHAND ? this.field_23745 : super.getAttributeModifiers(slot);
        }
}

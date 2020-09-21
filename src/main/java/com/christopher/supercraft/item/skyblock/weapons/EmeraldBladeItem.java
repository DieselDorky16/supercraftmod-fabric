package com.christopher.supercraft.item.skyblock.weapons;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Vanishable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

@SuppressWarnings("ALL")
public class EmeraldBladeItem extends Item implements Vanishable {
    private static final Text itemTooltip1, itemTooltip2;
    private final float attackDamage;
    private final Multimap<EntityAttribute, EntityAttributeModifier> field_23745;

    public EmeraldBladeItem(Settings settings) {
        super(settings);
        this.attackDamage = this.getAttackDamage();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Weapon modifier", (double)this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
        this.field_23745 = builder.build();
    }


    public float getAttackDamage() {
        return 25;
    }

    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return false;
    }
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return slot == EquipmentSlot.MAINHAND ? this.field_23745 : super.getAttributeModifiers(slot);
    }
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(itemTooltip1);
        tooltip.add(itemTooltip2);
        super.appendTooltip(stack, world, tooltip, context);
    }

    static {
        itemTooltip1 = (new TranslatableText("tooltip.supercraft.item.emerald_blade_line1")).formatted(Formatting.GRAY);
        itemTooltip2 = (new TranslatableText("tooltip.supercraft.item.emerald_blade_line2")).formatted(Formatting.GRAY);
    }
}


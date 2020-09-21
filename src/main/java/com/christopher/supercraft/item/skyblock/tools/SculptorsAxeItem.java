package com.christopher.supercraft.item.skyblock.tools;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@SuppressWarnings("ALL")
public class SculptorsAxeItem extends MiningToolItem {
    private static final Text itemTooltip;
    private static final Set<Material> field_23139;
    private static final Set<Block> EFFECTIVE_BLOCKS;
    protected static final Map<Block, Block> WOOD_BLOCKS;

    public SculptorsAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings) {
        super(attackDamage, attackSpeed, material, EFFECTIVE_BLOCKS, settings);
    }

    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        Material material = state.getMaterial();
        return field_23139.contains(material) ? this.miningSpeed : super.getMiningSpeedMultiplier(stack, state);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        Block block = (Block)WOOD_BLOCKS.get(blockState.getBlock());
        if (block != null) {
            PlayerEntity playerEntity = context.getPlayer();
            world.playSound(playerEntity, blockPos, SoundEvents.BLOCK_WOOD_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if (!world.isClient) {
                world.setBlockState(blockPos, (BlockState)block.getDefaultState().with(PillarBlock.AXIS, blockState.get(PillarBlock.AXIS)), 11);
                if (playerEntity != null) {
                    context.getStack().damage(0, (LivingEntity)playerEntity, (Consumer)((p) -> {
                    }));
                }
            }

            return ActionResult.success(world.isClient);
        } else {
            return ActionResult.PASS;
        }
    }

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(itemTooltip);
        super.appendTooltip(stack, world, tooltip, context);
    }

    static {
        itemTooltip = (new TranslatableText("tooltip.supercraft.item.sculptors_axe")).formatted(Formatting.GRAY);

        field_23139 = Sets.newHashSet(new Material[]{Material.WOOD, Material.NETHER_WOOD, Material.PLANT, Material.REPLACEABLE_PLANT, Material.BAMBOO, Material.GOURD});
        EFFECTIVE_BLOCKS = Sets.newHashSet(new Block[]{Blocks.LADDER, Blocks.SCAFFOLDING, Blocks.OAK_BUTTON, Blocks.SPRUCE_BUTTON, Blocks.BIRCH_BUTTON, Blocks.JUNGLE_BUTTON, Blocks.DARK_OAK_BUTTON, Blocks.ACACIA_BUTTON, Blocks.CRIMSON_BUTTON, Blocks.WARPED_BUTTON});
        WOOD_BLOCKS = (new ImmutableMap.Builder()).put(Blocks.OAK_LOG, Blocks.OAK_WOOD).put(Blocks.SPRUCE_LOG, Blocks.SPRUCE_WOOD).put(Blocks.BIRCH_LOG, Blocks.BIRCH_WOOD).put(Blocks.JUNGLE_LOG, Blocks.JUNGLE_WOOD).put(Blocks.ACACIA_LOG, Blocks.ACACIA_WOOD).put(Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_WOOD).put(Blocks.CRIMSON_STEM, Blocks.CRIMSON_HYPHAE).put(Blocks.WARPED_STEM, Blocks.WARPED_HYPHAE).put(Blocks.STRIPPED_OAK_LOG, Blocks.STRIPPED_OAK_WOOD).put(Blocks.STRIPPED_SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_WOOD).put(Blocks.STRIPPED_BIRCH_LOG, Blocks.STRIPPED_BIRCH_WOOD).put(Blocks.STRIPPED_JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_WOOD).put(Blocks.STRIPPED_ACACIA_LOG, Blocks.STRIPPED_ACACIA_WOOD).put(Blocks.STRIPPED_DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_WOOD).put(Blocks.STRIPPED_CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_HYPHAE).put(Blocks.STRIPPED_WARPED_STEM, Blocks.STRIPPED_WARPED_HYPHAE).build();
    }
}

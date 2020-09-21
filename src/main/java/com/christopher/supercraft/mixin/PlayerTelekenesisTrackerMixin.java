package com.christopher.supercraft.mixin;

import com.christopher.supercraft.util.telekenesis_stuff.PlayerTelekinesisTracker;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(PlayerEntity.class)
public abstract class PlayerTelekenesisTrackerMixin implements PlayerTelekinesisTracker {
    @Unique
    private BlockPos lastTelekenesisBreakPos;

    @Unique
    private long lastTelekenesisBreakTime;

    public void setLastTelekenesisBreak(BlockPos pos, long tick) {
        lastTelekenesisBreakPos = pos;
        lastTelekenesisBreakTime = tick;
    }

    public BlockPos getLastTelekenesisBreakPos() {
        return lastTelekenesisBreakPos;
    }

    public boolean checkTelekenesisTick(long tick) {
        return lastTelekenesisBreakTime >= tick - 1 && lastTelekenesisBreakTime <= tick + 1;
    }
}

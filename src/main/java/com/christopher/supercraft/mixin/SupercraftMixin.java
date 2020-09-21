package com.christopher.supercraft.mixin;

import com.christopher.supercraft.client.ZoomFeature;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(GameRenderer.class)
public class SupercraftMixin {
    @Inject(method = "getFov(Lnet/minecraft/client/render/Camera;FZ)D", at = @At("HEAD"), cancellable = true)
    public void getZoomLevel(CallbackInfoReturnable<Double> callbackInfo) {
        if(ZoomFeature.isZooming()) {
            callbackInfo.setReturnValue(ZoomFeature.level());
        }

        ZoomFeature.manageSmoothCamera();
    }
}

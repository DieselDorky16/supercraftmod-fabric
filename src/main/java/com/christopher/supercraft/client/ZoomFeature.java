package com.christopher.supercraft.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class ZoomFeature implements ClientModInitializer {

    private static Boolean currentlyZoomed;
    private static KeyBinding keyBinding;
    private static Boolean originalSmoothCameraEnabled;
    private static final MinecraftClient mc = MinecraftClient.getInstance();

    @Override
    //The following strings are untranslatable until we figure something out
    public void onInitializeClient() {
        keyBinding = new KeyBinding("Zoom", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_C, "key.category.misc");

        currentlyZoomed = false;
        originalSmoothCameraEnabled = false;

        KeyBindingHelper.registerKeyBinding(keyBinding);
    }

    public static Boolean isZooming() {
        return keyBinding.isPressed();
    }

    public static double level() {
        return 19.0; // Hardcoded for now, same FoV amount as Optifine as far as I can make out
    }

    public static void manageSmoothCamera() {
        if (zoomStarting()) {
            zoomStarted();
            enableSmoothCamera();
        }

        if (zoomStopping()) {
            zoomStopped();
            resetSmoothCamera();
        }
    }

    private static Boolean isSmoothCamera() {
        return mc.options.smoothCameraEnabled;
    }

    private static void enableSmoothCamera() {
        mc.options.smoothCameraEnabled = true;
    }

    private static void disableSmoothCamera() {
        mc.options.smoothCameraEnabled = false;
    }

    private static boolean zoomStarting() {
        return isZooming() && !currentlyZoomed;
    }

    private static boolean zoomStopping() {
        return !isZooming() && currentlyZoomed;
    }

    private static void zoomStarted() {
        originalSmoothCameraEnabled = isSmoothCamera();
        currentlyZoomed = true;
    }

    private static void zoomStopped() {
        currentlyZoomed = false;
    }

    private static void resetSmoothCamera() {
        if (originalSmoothCameraEnabled) {
            enableSmoothCamera();
        } else {
            disableSmoothCamera();
        }
    }
}

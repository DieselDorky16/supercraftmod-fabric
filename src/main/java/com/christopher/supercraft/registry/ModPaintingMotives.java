package com.christopher.supercraft.registry;

import com.christopher.supercraft.Supercraft;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintingMotives {
    public static final PaintingMotive DREAMWASTAKEN = new PaintingMotive(64, 64);
    public static final PaintingMotive GEORGENOTFOUND = new PaintingMotive(64, 64);
    public static final PaintingMotive SAPNAP = new PaintingMotive(64, 64);
    public static final PaintingMotive BADBOYHALO = new PaintingMotive(64, 64);

    public static void registerPaintingMotives() {
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier(Supercraft.MOD_ID, "dreamwastaken"), DREAMWASTAKEN);
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier(Supercraft.MOD_ID, "georgenotfound"), GEORGENOTFOUND);
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier(Supercraft.MOD_ID, "sapnap"), SAPNAP);
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier(Supercraft.MOD_ID, "badboyhalo"), BADBOYHALO);
    }
}

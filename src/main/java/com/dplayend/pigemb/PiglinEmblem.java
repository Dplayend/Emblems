package com.dplayend.pigemb;

import com.dplayend.pigemb.item.PiglinEmblemItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class PiglinEmblem implements ModInitializer {
    public static final String MOD_ID = "pigemb";
    public static final Item PIGLIN_EMBLEM = new PiglinEmblemItem();

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "piglin_emblem"), PIGLIN_EMBLEM);
    }
}
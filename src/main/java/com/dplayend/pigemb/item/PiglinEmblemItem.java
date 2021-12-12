package com.dplayend.pigemb.item;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class PiglinEmblemItem extends TrinketItem {
    public PiglinEmblemItem() {
        super(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.onEquip(stack, slot, entity);
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.onUnequip(stack, slot, entity);
    }

}

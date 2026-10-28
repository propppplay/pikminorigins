package net.propppplay.pikminorigin.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

import javax.swing.*;

public class NectarItem extends Item {
    public NectarItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient) {
            CowEntity cow = new CowEntity(EntityType.COW,context.getWorld());
            context.getWorld().spawnEntity(cow);
            cow.setPosition(context.getHitPos());
        }


        context.getStack().decrement(1);
        return ActionResult.CONSUME;
    }
}

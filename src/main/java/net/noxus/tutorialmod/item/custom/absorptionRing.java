package net.noxus.tutorialmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class absorptionRing extends Item {
    public absorptionRing(Properties pProperties){
        super(pProperties);
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);

        if(pEntity instanceof Player player && !pLevel.isClientSide){
            if(player.getInventory().contains(pStack)){
                player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 3, 0, true,false));
            }
        }
    }
}



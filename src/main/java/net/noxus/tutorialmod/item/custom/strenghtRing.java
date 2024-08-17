package net.noxus.tutorialmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;


public class strenghtRing extends Item {
    public strenghtRing(Properties pProperties){
        super(pProperties);
    }
    @Override
    public boolean isFoil(ItemStack stack) {
        return true; // Enable enchantment glint
    }
    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotid, boolean isSelected){
        super.inventoryTick(pStack, pLevel, pEntity, pSlotid, isSelected);

        if(pEntity instanceof Player player && !pLevel.isClientSide){
            if(player.getInventory().contains(pStack)){
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3, 0, true, false ));
            }
        }
    }

}

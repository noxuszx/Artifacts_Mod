package net.noxus.tutorialmod.item.custom;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import oshi.annotation.concurrent.Immutable;

public class immuCross extends Item {
    public immuCross(Properties pProperties){
        super(pProperties);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private boolean hasImmuCross(Player player){
        for(ItemStack itemStack : player.getInventory().items){
            return itemStack.getItem() instanceof immuCross;
        }
        return false;
    }
    @SubscribeEvent
    public void onPlayerHurt(LivingHurtEvent event){
        if(event.getEntity() instanceof Player player){
            if(hasImmuCross(player)){
                player.invulnerableTime += 1000;
            }
        }
    }
}

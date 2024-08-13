package net.noxus.tutorialmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.noxus.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)));

    public static final RegistryObject<Item> POKEBALL = ITEMS.register("pokeball",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)));

    public static final RegistryObject<Item> YANAGEM = ITEMS.register("yana_gem",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)));

    public static final RegistryObject<Item> PACKING = ITEMS.register("packings_stethoscope",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)));

    public static final RegistryObject<Item> NASH = ITEMS.register("nashs_meth_crystal",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> COKEBEER = ITEMS.register("coke_beer",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.EPIC)
            ));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

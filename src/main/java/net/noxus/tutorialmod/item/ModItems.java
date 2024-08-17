package net.noxus.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.noxus.tutorialmod.TutorialMod;
import net.noxus.tutorialmod.item.custom.*;

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

    // MOD EFFECT ITEMS
    public static final RegistryObject<Item> NOX_RING = ITEMS.register("nox_ring",
            () -> new regenRing(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> NICO_RING = ITEMS.register("nico_ring",
            () -> new speedRing(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> JAY_RING = ITEMS.register("jay_ring",
            () -> new absorptionRing(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> EON_CROSS = ITEMS.register("eon_cross",
            () -> new immuCross(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> CHRIS_RING = ITEMS.register("chris_ring",
            () -> new strenghtRing(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

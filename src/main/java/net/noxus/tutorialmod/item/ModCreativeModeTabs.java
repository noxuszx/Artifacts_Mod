package net.noxus.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.noxus.tutorialmod.TutorialMod;
import net.noxus.tutorialmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register(
            "tutorial_tab", () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SAPPHIRE.get())).title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.YANAGEM.get());
                        output.accept(ModItems.NASH.get());
                        output.accept(ModItems.PACKING.get());
                        output.accept(ModItems.POKEBALL.get());
                        output.accept(ModItems.COKEBEER.get());
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModItems.NOX_RING.get());
                        output.accept(ModItems.NOX_RING.get());
                        output.accept(ModItems.NICO_RING.get());
                        output.accept(ModItems.JAY_RING.get());

                    })
                    .build());
}

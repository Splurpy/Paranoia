package net.splurpy.paranoiamod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.splurpy.paranoiamod.ParanoiaMod;

import java.rmi.registry.Registry;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ParanoiaMod.MOD_ID);


    public static final RegistryObject<Item> LITHIUM = ITEMS.register("lithium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_PARANOIA)));

    public static final RegistryObject<Item> MORTAR = ITEMS.register("mortar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_PARANOIA)));

    public static final RegistryObject<Item> PESTLE = ITEMS.register("pestle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_PARANOIA)));

    public static final RegistryObject<Item> POWDERED_LITHIUM = ITEMS.register("powdered_lithium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_PARANOIA)));

    public static final RegistryObject<Item> GELATIN_POWDER = ITEMS.register("gelatin_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_PARANOIA)));

    public static final RegistryObject<Item> PILL_CAPSULE = ITEMS.register("pill_capsule",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_PARANOIA)));

    public static final RegistryObject<Item> SANITY_PILL = ITEMS.register("sanity_pill",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_PARANOIA)));


    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}

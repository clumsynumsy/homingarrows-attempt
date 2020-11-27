package com.breadboxyt.homingarrows.util;

import com.breadboxyt.homingarrows.homingarrows;
import com.breadboxyt.homingarrows.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


;import java.util.function.Supplier;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, homingarrows.MOD_ID);

    public static void init() {
       ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> HOMING_ARROWS = ITEMS.register("homing_arrows", ItemBase::new);

}
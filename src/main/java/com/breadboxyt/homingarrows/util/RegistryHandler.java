package com.breadboxyt.homingarrows.util;

import com.breadboxyt.homingarrows.homingarrows;
import com.breadboxyt.homingarrows.items.ItemBase;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
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
    public static final RegistryObject<ArrowItem> HOMING_ARROWS = ITEMS.register("homing_arrows", );

}



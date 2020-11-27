package com.breadboxyt.homingarrows.items;

import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.event.entity.ProjectileImpactEvent;

public class homing_arrows extends ProjectileImpactEvent.Arrow {
    public homing_arrows(AbstractArrowEntity arrow, RayTraceResult ray) {
        super(arrow, ray);
       getClass(); homing_arrows entitytracker;
    }
}

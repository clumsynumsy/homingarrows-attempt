package com.breadboxyt.homingarrows.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.ProjectileImpactEvent;

public class homing_arrows extends ArrowEntity {

    public homing_arrows(EntityType<? extends ArrowEntity> type, World worldIn) {
        super(type, worldIn);
    }
}


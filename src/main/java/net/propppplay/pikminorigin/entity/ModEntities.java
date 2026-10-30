package net.propppplay.pikminorigin.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.propppplay.pikminorigin.Pikminorigin;
import net.propppplay.pikminorigin.entity.custom.RedpikminEntity;

public class ModEntities {
    public static final EntityType<RedpikminEntity> REDPIKMIN = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Pikminorigin.MOD_ID, "redpikmin"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RedpikminEntity::new)
                    .dimensions(EntityDimensions.fixed(5/16f, 12/16f)).build());

}

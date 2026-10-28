package net.propppplay.pikminorigin;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.propppplay.pikminorigin.entity.ModEntities;
import net.propppplay.pikminorigin.entity.client.ModModelLayers;
import net.propppplay.pikminorigin.entity.client.RedpikminRenderer;
import net.propppplay.pikminorigin.entity.client.redpikmin;

public class PikminoriginClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.REDPIKMIN, RedpikminRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.REDPIKMIN, redpikmin::getTexturedModelData);
    }
}

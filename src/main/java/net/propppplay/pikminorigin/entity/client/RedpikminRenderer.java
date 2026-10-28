package net.propppplay.pikminorigin.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.propppplay.pikminorigin.Pikminorigin;
import net.propppplay.pikminorigin.entity.custom.RedpikminEntity;

public class RedpikminRenderer extends MobEntityRenderer<RedpikminEntity, redpikmin<RedpikminEntity>> {
    private static final Identifier TEXTURE = new Identifier(Pikminorigin.MOD_ID, "textures/entity/redpikmin.png");

    public RedpikminRenderer(EntityRendererFactory.Context context) {
        super(context, new redpikmin<>(context.getPart(ModModelLayers.REDPIKMIN)), 0.3f);
    }

    @Override
    public Identifier getTexture(RedpikminEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(RedpikminEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}

package wannabeNifty.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import wannabeNifty.ExampleMod;
import wannabeNifty.entity.custom.RaccoonEntity;
import wannabeNifty.entity.custom.WaspEntity;

public class WaspRenderer extends GeoEntityRenderer<WaspEntity> {
    public WaspRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WaspModel());
        this.shadowRadius = 0.0f;
    }


    @Override
    public ResourceLocation getTextureLocation(WaspEntity entity) {
        return new ResourceLocation(ExampleMod.MODID, "textures/entity/wasp/wasp.png");
    }


    @Override
    public RenderType getRenderType(WaspEntity animatable , float partialTicks , PoseStack stack,
                                    MultiBufferSource renderTypeBuffer , VertexConsumer vertexBuilder , int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f , 0.8f , 0.8f);
        return super.getRenderType(animatable , partialTicks , stack , renderTypeBuffer , vertexBuilder,
                packedLightIn , textureLocation);
    }


}

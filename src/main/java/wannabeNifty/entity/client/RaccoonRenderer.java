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

public class RaccoonRenderer extends GeoEntityRenderer<RaccoonEntity> {





    public RaccoonRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager , new RaccoonModel());
        this.shadowRadius = 0.3f;
    }


    @Override
    public ResourceLocation getTextureLocation(RaccoonEntity entity) {
        return new ResourceLocation(ExampleMod.MODID , "textures/entity/raccoon/raccoon.png");
    }

    @Override
    public RenderType getRenderType(RaccoonEntity animatable , float partialTicks , PoseStack stack,
                                    MultiBufferSource renderTypeBuffer , VertexConsumer vertexBuilder , int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f , 0.8f , 0.8f);
        return super.getRenderType(animatable , partialTicks , stack , renderTypeBuffer , vertexBuilder,
                packedLightIn , textureLocation);
    }
}

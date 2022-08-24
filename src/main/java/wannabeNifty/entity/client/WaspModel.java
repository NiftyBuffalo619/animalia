package wannabeNifty.entity.client;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import wannabeNifty.ExampleMod;
import wannabeNifty.entity.custom.WaspEntity;

public class WaspModel extends AnimatedGeoModel<WaspEntity> {
    @Override
    public ResourceLocation getModelResource(WaspEntity object) {
        return new ResourceLocation(ExampleMod.MODID, "geo/wasp.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WaspEntity object) {
        return new ResourceLocation(ExampleMod.MODID, "textures/entity/wasp/wasp.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WaspEntity animatable) {
        return new ResourceLocation(ExampleMod.MODID, "animations/wasp.animation.json");
    }
}

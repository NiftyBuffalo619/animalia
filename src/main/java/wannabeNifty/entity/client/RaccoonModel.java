package wannabeNifty.entity.client;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import wannabeNifty.ExampleMod;
import wannabeNifty.entity.custom.RaccoonEntity;

public class RaccoonModel extends AnimatedGeoModel<RaccoonEntity> {

    @Override
    public ResourceLocation getModelResource(RaccoonEntity object) {
        return new ResourceLocation(ExampleMod.MODID , "geo/raccoon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RaccoonEntity object) {
        return new ResourceLocation(ExampleMod.MODID , "textures/entity/raccoon/racccon.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RaccoonEntity animatable) {
        return new ResourceLocation(ExampleMod.MODID , "animations/raccoon.animation.json");
    }
}

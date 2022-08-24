package wannabeNifty.entity;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import wannabeNifty.ExampleMod;
import wannabeNifty.entity.client.RaccoonRenderer;
import wannabeNifty.entity.custom.RaccoonEntity;
import wannabeNifty.entity.custom.WaspEntity;

public class ModEntityTypes {
public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExampleMod.MODID);

public static RegistryObject<EntityType<RaccoonEntity>> RACCOON = ENTITY_TYPES.register("raccoon" , () ->
        EntityType.Builder.of(RaccoonEntity::new , MobCategory.CREATURE)
                .sized(0.8f , 0.6f)
                .build(new ResourceLocation(ExampleMod.MODID , "raccoon").toString()));

public static RegistryObject<EntityType<WaspEntity>> WASP = ENTITY_TYPES.register("wasp", () ->
        EntityType.Builder.of(WaspEntity::new , MobCategory.CREATURE)
        .sized(0.8f , 0.6f)
        .build(new ResourceLocation(ExampleMod.MODID, "wasp").toString()));

    public static void RegisterEntities(IEventBus event) {
        ENTITY_TYPES.register(event);

     }

}

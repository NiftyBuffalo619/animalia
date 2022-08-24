package wannabeNifty.sounds;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import wannabeNifty.ExampleMod;

public class Sounds {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ExampleMod.MODID);


    public static RegistryObject<SoundEvent> airsiren = SOUNDS.register("airsiren" , () ->
            new SoundEvent(new ResourceLocation("airsiren")));

    public static void register(IEventBus bus) {
        SOUNDS.register(bus);
    }
}

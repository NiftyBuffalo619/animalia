package wannabeNifty.event;

import net.minecraft.client.player.KeyboardInput;
import net.minecraft.network.chat.PlayerChatMessage;
import net.minecraft.world.entity.ai.behavior.CelebrateVillagersSurvivedRaid;
import net.minecraft.world.entity.ai.behavior.VillagerPanicTrigger;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.level.timers.TimerQueue;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import wannabeNifty.ExampleMod;
import wannabeNifty.entity.ModEntityTypes;
import wannabeNifty.entity.custom.RaccoonEntity;
import wannabeNifty.entity.custom.WaspEntity;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID , bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBus {


    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.RACCOON.get(), RaccoonEntity.setAttributes());
        event.put(ModEntityTypes.WASP.get(), WaspEntity.setAttributes());
    }

}

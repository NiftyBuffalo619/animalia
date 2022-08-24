package wannabeNifty.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import wannabeNifty.ExampleMod;
import wannabeNifty.entity.ModEntityTypes;
import wannabeNifty.entity.custom.RaccoonEntity;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS , ExampleMod.MODID);


    public static final RegistryObject<SpawnEggItem> RACCOON_SPAWN_EGG = ITEMS.register("raccoon_spawn_egg", () ->
            new ForgeSpawnEggItem(ModEntityTypes.RACCOON , 0x948e8d , 0x3b3635,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<SpawnEggItem> WASP_SPAWN_EGG = ITEMS.register("wasp_spawn_egg" ,() ->
            new ForgeSpawnEggItem(ModEntityTypes.WASP , 16777062 , 263169 ,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}

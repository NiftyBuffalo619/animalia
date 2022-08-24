package wannabeNifty.blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import wannabeNifty.ExampleMod;
import wannabeNifty.blocks.custom.RadioBlock;
import wannabeNifty.items.ModItems;

public class ModBlocks {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS , ExampleMod.MODID);

    /*public static final RegistryObject<Block> LAMP = registerBlock("lamp" , () -> new Lamp(BlockBehaviour.Properties.of(Material.METAL)
    .strength(6.0f).requiresCorrectToolForDrops()
    .lightLevel(state -> state.getValue(Lamp.LIT) ? 15 : 0)), CreativeModeTab.TAB_DECORATIONS);*/
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES , ExampleMod.MODID);





    private static <T extends Block> RegistryObject<T> registerBlock(String name , RegistryObject<T> block ,
                                                                     CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name , block);
        registerBlockItem(name , toReturn , tab);
        return toReturn;
    }
   /* private static <T extends BlockEntityType<?>> RegistryObject<BlockEntityType<?>> registerBlock_Entity_Type(String name , RegistryObject<BlockEntityType<?>> block ,
                                                                                           CreativeModeTab tab) {
        RegistryObject<BlockEntityType<?>> toReturn = BLOCK_ENTITY_TYPES.register(name , block);
        registerBlockItem_BlockItem(name , toReturn , tab);
        return toReturn;
    }*/

   /* private static <T extends BlockEntityType<?>> void registerBlockItem_BlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name , new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }*/


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name , RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name , () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void registerBlocks(IEventBus bus) {
        BLOCKS.register(bus);
    }

    public static final RegistryObject<Block> RadioBlock = BLOCKS.register("radio_block", () ->
            new RadioBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().sound(SoundType.WOOD)));
    /*public static final RegistryObject<BlockEntityType<?>> RadioBlock_2 = registerBlock_Entity_Type("radio_block",
            RegistryObject.create(new ResourceLocation("") , ForgeRegistries.BLOCK_ENTITY_TYPES) , CreativeModeTab.TAB_DECORATIONS);*/

}

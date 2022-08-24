package wannabeNifty.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.Clearable;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class RadioBlockEntity extends BlockEntity implements Clearable {


    public RadioBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(BlockEntityType.JUKEBOX, blockPos, blockState);
    }

    @Override
    public void clearContent() {

    }
}

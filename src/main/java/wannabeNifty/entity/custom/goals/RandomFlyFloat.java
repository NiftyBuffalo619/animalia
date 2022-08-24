package wannabeNifty.entity.custom.goals;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.animal.Bee;
import wannabeNifty.entity.custom.WaspEntity;

import java.util.EnumSet;

public class RandomFlyFloat extends Goal {

    private final WaspEntity wasp;

    public RandomFlyFloat(WaspEntity wasp) {
        this.wasp = wasp;
        this.setFlags(EnumSet.of(Flag.MOVE));
    }


    @Override
    public boolean canUse() {
        MoveControl control = this.wasp.getMoveControl();
        if (!control.hasWanted()) {
            return true;
        } else {
            double d_0 = control.getWantedX() - this.wasp.getX();
            double d_1 = control.getWantedY() - this.wasp.getY();
            double d_2 = control.getWantedZ() - this.wasp.getZ();
            double d_3 = d_0 * d_0 + d_1 * d_1 + d_2 * d_2;
            return d_3 < 1.0D || d_3 > 10.0D;
        }


    }

    @Override
    public void start() {
        RandomSource source = this.wasp.getRandom();
        double d0 = this.wasp.getX() + (double)((source.nextFloat() * 2.0F - 1.0F) * 16.0F);
        double d1 = this.wasp.getY() + (double)((source.nextFloat() * 2.0F - 1.0F) * 16.0F);
        double d2 = this.wasp.getZ() + (double)((source.nextFloat() * 2.0F - 1.0F) * 16.0F);
        this.wasp.getMoveControl().setWantedPosition(d0, d1, d2, 1.0D);
    }

    @Override
    public boolean canContinueToUse() {
        return true;
    }
}

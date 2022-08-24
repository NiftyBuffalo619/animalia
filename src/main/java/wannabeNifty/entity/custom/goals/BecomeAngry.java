package wannabeNifty.entity.custom.goals;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;

public class BecomeAngry extends NearestAttackableTargetGoal<Player> {

    public BecomeAngry(Mob mob, Class<Player> playerClass, boolean p_26062_) {
        super(mob, playerClass, true);
    }


    public boolean canUse() {
        return true;
    }
}

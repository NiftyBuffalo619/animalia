package wannabeNifty.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.NeutralMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomFlyingGoal;
import net.minecraft.world.entity.ai.goal.target.ResetUniversalAngerTargetGoal;
import net.minecraft.world.entity.ai.util.AirAndWaterRandomPos;
import net.minecraft.world.entity.ai.util.HoverRandomPos;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.FlyingAnimal;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.level.Level;

import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import wannabeNifty.entity.custom.goals.RandomFlyFloat;

import java.util.EnumSet;
import java.util.Random;
import java.util.UUID;

public class WaspEntity extends FlyingMob implements IAnimatable, FlyingAnimal , NeutralMob {

    public boolean isAngry = false;

    private AnimationFactory factory = new AnimationFactory(this);

    public WaspEntity(EntityType<? extends FlyingMob> entity, Level level) {
        super(entity, level);
       // this.moveControl =
    }


    public static AttributeSupplier setAttributes() {
        return FlyingMob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 5.0f)
                .add(Attributes.MOVEMENT_SPEED, 3.0f)
                .add(Attributes.ATTACK_DAMAGE, 1.0f)
                .build();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0 , new FloatGoal(this));
        this.goalSelector.addGoal(1 , new FlyingGoal(this));
        this.goalSelector.addGoal(2, new ResetUniversalAngerTargetGoal<>(this , true));
    }





    //GEOCKOLIB

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.wasp.fly", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.wasp.idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this , "controller", 0 , this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }


    @Override
    public boolean isFlying() {
        return true;
    }

    @Override
    public SoundEvent getAmbientSound() {
        return SoundEvents.BEE_LOOP;
    }

    @Override
    public int getRemainingPersistentAngerTime() {
        return 1;
    }

    @Override
    public void setRemainingPersistentAngerTime(int p_21673_) {

    }

    @Nullable
    @Override
    public UUID getPersistentAngerTarget() {
        return null;
    }

    @Override
    public void setPersistentAngerTarget(@Nullable UUID p_21672_) {

    }

    @Override
    public void startPersistentAngerTimer() {

    }

    static class FlyingGoal extends Goal {
    private final WaspEntity wasp;

    public FlyingGoal(WaspEntity wasp) {
        this.wasp = wasp;
        this.setFlags(EnumSet.of(Flag.MOVE));
    }

    @Override
    public boolean canUse() {
        return false;
    }

    public void start() {

    }




}
}


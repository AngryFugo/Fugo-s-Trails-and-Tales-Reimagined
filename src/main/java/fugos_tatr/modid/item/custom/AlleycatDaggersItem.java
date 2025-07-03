package fugos_tatr.modid.item.custom;

import fugos_tatr.modid.entity.projectile.thrown.AlleycatDaggersEntity;
import fugos_tatr.modid.sound.ModSounds;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

import java.util.concurrent.TimeUnit;

public class AlleycatDaggersItem extends Item implements ProjectileItem {
    public static float POWER = 1.5F;

    public AlleycatDaggersItem(Item.Settings settings) {
        super(settings);
    }

    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound((Entity)null, user.getX(), user.getY(), user.getZ(), ModSounds.ALLEYCAT_KNIFE_THROW, SoundCategory.NEUTRAL, 0.5F, 1F);

        new Thread()
        {
            @Override
            public void run()
            {
                if (world instanceof ServerWorld serverWorld) {
                    ProjectileEntity.spawnWithVelocity(AlleycatDaggersEntity::new, serverWorld, itemStack, user, 0.0F, POWER, 0.5F);
                }
                waitTime(160); //Use a delay to not "send commands too quickly".
                if (world instanceof ServerWorld serverWorld) {
                    ProjectileEntity.spawnWithVelocity(AlleycatDaggersEntity::new, serverWorld, itemStack, user, 0.0F, POWER, 0.5F);
                }
            }
        }.start();

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        return ActionResult.SUCCESS;
    }

    public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
        return new SnowballEntity(world, pos.getX(), pos.getY(), pos.getZ(), stack);
    }

    private void waitTime(int MS) {
        try
        {
            TimeUnit.MILLISECONDS.sleep(MS);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}

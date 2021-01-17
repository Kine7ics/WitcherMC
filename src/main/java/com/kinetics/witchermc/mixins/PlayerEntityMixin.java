package com.kinetics.witchermc.mixins;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin
{
    @Shadow public int experienceLevel;
    @Shadow public float experienceProgress;
    @Shadow public int totalExperience;

    @Overwrite
    public void addExperience(int experience)
    {
        totalExperience = MathHelper.clamp(totalExperience + experience, 0, 124000);

        if (totalExperience < 9000)
        {
            experienceLevel = 1 + MathHelper.floor((float) totalExperience / 1000f);
            experienceProgress = (float)(totalExperience - (experienceLevel - 1) * 1000) / 1000f;
        }
        else if (totalExperience < 24000)
        {
            experienceLevel = 10 + MathHelper.floor(((float) totalExperience - 9000f) / 1500f);
            experienceProgress = (float)(totalExperience - ((experienceLevel - 10) * 1500 + 9000)) / 1500f;
        }
        else
        {
            experienceLevel = 20 + MathHelper.floor(((float) totalExperience - 24000f) / 2000f);
            experienceProgress = (float) (totalExperience - ((experienceLevel - 20) * 2000 + 24000)) / 2000f;
        }

        if (experienceLevel == 70)
            experienceProgress = 1.0f;
    }
}

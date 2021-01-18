package com.kinetics.witchermc;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class WitcherSword extends WitcherItem
{
    public enum SwordMaterial
    {
        SILVER, STEEL
    }

    private final SwordMaterial material;
    private final float attackDamage;
    private final float attackSpeed;
    private Oil equippedOil;
    private int remainingCharges;

    public WitcherSword(Settings settings, float weight, int slots, SwordMaterial material, float attackDamage, float attackSpeed)
    {
        super(settings, weight, slots);
        this.material = material;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
    }

    public void EquipOil(Oil oil)
    {
        this.equippedOil = oil;
        this.remainingCharges = oil.getCharges();
    }

    private void useCharges(int charges)
    {
        remainingCharges -= charges;
    }

    public void RemoveOil()
    {
        equippedOil = null;
        remainingCharges = 0;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker)
    {
        if (equippedOil != null)
        {
            useCharges(1);
            if (remainingCharges == 0)
                RemoveOil();
        }
        return true;
    }
}

package com.kinetics.witchermc.toolmaterials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SteelToolMaterial implements ToolMaterial
{
    public static final SteelToolMaterial INSTANCE = new SteelToolMaterial();

    @Override
    public int getDurability()
    {
        return 20000;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 0;
    }

    @Override
    public float getAttackDamage()
    {
        return 12;
    }

    @Override
    public int getMiningLevel()
    {
        return 0;
    }

    @Override
    public int getEnchantability()
    {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return null;
    }
}

package com.kinetics.witchermc;

import net.minecraft.item.Item;

public class WitcherItem extends Item
{
    private final float weight;
    private final int slots;

    public WitcherItem(Settings settings, float weight, int slots)
    {
        super(settings);
        this.weight = weight;
        this.slots = slots;
    }
}

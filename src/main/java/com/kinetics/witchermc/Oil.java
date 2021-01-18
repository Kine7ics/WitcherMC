package com.kinetics.witchermc;

public class Oil extends WitcherItem
{
    private final int charges;
    private final float functionality;
    private final EntityType effectiveType;
    private final WitcherSword.SwordMaterial equipableMaterial;

    public Oil(Settings settings, float weight, int slots, int charges, float functionality, EntityType type, WitcherSword.SwordMaterial material)
    {
        super(settings, 0, 1);
        this.charges = charges;
        this.functionality = functionality;
        this.effectiveType = type;
        this.equipableMaterial = material;
    }

    public int getCharges()
    {
        return charges;
    }
}

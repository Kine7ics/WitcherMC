package com.kinetics.witchermc;

import com.kinetics.witchermc.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class WitcherMC implements ModInitializer
{
    public static final String MOD_ID = "witchermc";

    @Override
    public void onInitialize()
    {
        ModItems.RegisterItems();
    }
}

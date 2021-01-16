package com.kinetics.witchermc.registry;

import com.kinetics.witchermc.WitcherMC;
import com.kinetics.witchermc.toolmaterials.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static ToolItem SILVER_SWORD = new SwordItem(SilverToolMaterial.INSTANCE, 12, 0.01f, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem STEEL_SWORD = new SwordItem(SteelToolMaterial.INSTANCE, 12, 0.01f, new Item.Settings().group(ItemGroup.COMBAT));

    public static void RegisterItems()
    {
        //Weapons
        Registry.register(Registry.ITEM, new Identifier(WitcherMC.MOD_ID, "silver_sword"), SILVER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(WitcherMC.MOD_ID, "steel_sword"), STEEL_SWORD);
    }
}

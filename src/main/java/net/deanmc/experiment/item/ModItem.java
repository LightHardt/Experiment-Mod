package net.deanmc.experiment.item;

import net.deanmc.experiment.Experiment;
import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Consumer;

public class ModItem {

    public static final Item SPECIAL_INGOT = registerItem("special_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item SPECIAL_SWORD = registerItem("special_sword",
            new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM,new Identifier(Experiment.MOD_ID, name),item);
    }
    public static void registerModItem() {
        Experiment.LOGGER.info("Registering ModItem for " + Experiment.MOD_ID);
    }

}
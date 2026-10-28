package net.propppplay.pikminorigin.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.propppplay.pikminorigin.Pikminorigin;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.propppplay.pikminorigin.item.custom.NectarItem;

public class ModItems {
    public static final Item NECTAR = registerItem("nectar", new NectarItem(new FabricItemSettings().maxCount(16)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(NECTAR);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Pikminorigin.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Pikminorigin.LOGGER.info("Registering Mod Items for " + Pikminorigin.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

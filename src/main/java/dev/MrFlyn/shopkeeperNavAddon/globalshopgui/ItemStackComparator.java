package dev.MrFlyn.shopkeeperNavAddon.globalshopgui;

import org.bukkit.inventory.ItemStack;

import java.util.Comparator;

public class ItemStackComparator implements Comparator<ItemStack> {
        public int compare(ItemStack a, ItemStack b)
        {
            return a.getType().toString().compareTo(b.getType().toString());
        }
}

package meinkraftgangbangers.gasymod.init;

import meinkraftgangbangers.gasymod.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item GASY = new ItemBase("gasy", CreativeTabs.MATERIALS);
    public static final Item GASY_INGOT = new ItemBase("gasy_ingot", CreativeTabs.MATERIALS);
}

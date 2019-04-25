package meinkraftgangbangers.gasymod.init;

import meinkraftgangbangers.gasymod.items.ItemBase;
import meinkraftgangbangers.gasymod.items.tools.ToolAxe;
import meinkraftgangbangers.gasymod.items.tools.ToolPickaxe;
import meinkraftgangbangers.gasymod.items.tools.ToolShovel;
import meinkraftgangbangers.gasymod.items.tools.ToolSword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final Item.ToolMaterial MATERIAL_GASY = EnumHelper.addToolMaterial("material_gasy", 2, 310, 9.5F, 2.5F, 10);

    //Items
    public static final Item GASY = new ItemBase("gasy", CreativeTabs.MATERIALS);
    public static final Item GASY_INGOT = new ItemBase("gasy_ingot", CreativeTabs.MATERIALS);
    public static final Item GASY_DUST = new ItemBase("gasy_dust", CreativeTabs.MATERIALS);

    //Tools
    public static final ItemAxe GASY_AXE = new ToolAxe("gasy_axe", MATERIAL_GASY, 6.0F, -3.2F);
    public static final ItemPickaxe GASY_PICKAXE = new ToolPickaxe("gasy_pickaxe", MATERIAL_GASY);
    public static final ItemSword GASY_SWORD = new ToolSword("gasy_sword", MATERIAL_GASY);
    public static final ItemSpade GASY_SHOVEL = new ToolShovel("gasy_shovel", MATERIAL_GASY);

    public static void init() {
        MATERIAL_GASY.setRepairItem(new ItemStack(ModItems.GASY_INGOT));

        System.out.println(MATERIAL_GASY.getRepairItemStack());
    }
}

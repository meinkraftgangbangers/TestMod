package meinkraftgangbangers.gasymod.items.tools;

import meinkraftgangbangers.gasymod.Main;
import meinkraftgangbangers.gasymod.init.ModItems;
import meinkraftgangbangers.gasymod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

    public ToolPickaxe(String name, ToolMaterial material) {
        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        System.out.println(this.toolMaterial.getRepairItemStack().getItem());
        if (repair.getItem().equals(this.toolMaterial.getRepairItemStack().getItem())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void registerModels() { Main.proxy.registerItemRenderer(this, 0, "inventory"); }
}

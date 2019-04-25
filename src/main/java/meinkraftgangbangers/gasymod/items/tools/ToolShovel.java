package meinkraftgangbangers.gasymod.items.tools;

import meinkraftgangbangers.gasymod.Main;
import meinkraftgangbangers.gasymod.init.ModItems;
import meinkraftgangbangers.gasymod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ToolShovel extends ItemSpade implements IHasModel {

    public ToolShovel(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (repair.getItem().equals(this.toolMaterial.getRepairItemStack().getItem())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void registerModels() { Main.proxy.registerItemRenderer(this, 0, "inventory");}
}

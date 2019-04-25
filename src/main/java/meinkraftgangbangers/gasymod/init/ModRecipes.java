package meinkraftgangbangers.gasymod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModItems.GASY_DUST, new ItemStack(ModItems.GASY_INGOT, 1), 2.5f);
        GameRegistry.addSmelting(ModBlocks.GASY_ORE, new ItemStack(ModItems.GASY_INGOT, 1), 2.5f);

    }

}

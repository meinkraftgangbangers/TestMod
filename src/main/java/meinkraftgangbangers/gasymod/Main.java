package meinkraftgangbangers.gasymod;

import meinkraftgangbangers.gasymod.init.ModItems;
import meinkraftgangbangers.gasymod.init.ModRecipes;
import meinkraftgangbangers.gasymod.proxy.CommonProxy;
import meinkraftgangbangers.gasymod.util.Reference;
import meinkraftgangbangers.gasymod.world.ModWorldGeneration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        ModRecipes.init();
        ModItems.init();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }
}

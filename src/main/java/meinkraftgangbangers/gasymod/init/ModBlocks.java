package meinkraftgangbangers.gasymod.init;

import meinkraftgangbangers.gasymod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block GASY_ORE = new BlockBase("gasy_ore", Material.ROCK);
    public static final Block GASY_BLOCK = new BlockBase("gasy_block", Material.IRON);
}

package meinkraftgangbangers.gasymod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GasyOre extends BlockBase {

    public GasyOre(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(5.0F);
        setResistance(60.0F);
        setHarvestLevel("pickaxe", 2);
    }
}

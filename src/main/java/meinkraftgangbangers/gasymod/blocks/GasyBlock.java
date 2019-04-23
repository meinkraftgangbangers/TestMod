package meinkraftgangbangers.gasymod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GasyBlock extends BlockBase {

    public GasyBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.METAL);
        setHardness(8.0F);
        setResistance(600.0F);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(0.3F);
    }
}

package meinkraftgangbangers.gasymod.blocks;

import meinkraftgangbangers.gasymod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class GasyOre extends BlockBase {

    public GasyOre(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(5.0F);
        setResistance(60.0F);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.GASY;
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random rand) {
        if (fortune > 0) {
            int r = rand.nextInt(fortune) + fortune;
            return quantityDropped(rand) + r;
        }
        else {
            return quantityDropped(rand);
        }
    }

    @Override
    public int quantityDropped(Random rand) {
        int[] values = {1, 2, 2, 2, 2, 3, 3};
        return values[rand.nextInt(values.length)];
    }
}

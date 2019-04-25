package meinkraftgangbangers.gasymod.blocks;

import meinkraftgangbangers.gasymod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

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
            int i = rand.nextInt(fortune + 2) - 1;

            if (i < 0) {
                i = 0;
            }

            return this.quantityDropped(rand) * (i + 1);
        }
        else {
            return this.quantityDropped(rand);
        }
    }

    @Override
    public int quantityDropped(Random rand) {
        return 1 + rand.nextInt(2);
    }

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        Random rand = new Random();
        int i = rand.nextInt(fortune + 2) - 1;

        if (i < 0) {
            i = 0;
        }
        return rand.nextInt(3) * (i + 1) ;
    }
}

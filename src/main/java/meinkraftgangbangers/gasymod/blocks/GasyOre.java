package meinkraftgangbangers.gasymod.blocks;

import meinkraftgangbangers.gasymod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

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
    public int quantityDropped(Random rand) {
        int[] values = {1, 2, 2, 2, 2, 3, 3, 3, 4, 0};

        return values[rand.nextInt(values.length - 1)];
    }

}

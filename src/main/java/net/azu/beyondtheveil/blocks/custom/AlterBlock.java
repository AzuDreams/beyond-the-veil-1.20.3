package net.azu.beyondtheveil.blocks.custom;

import net.azu.beyondtheveil.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AlterBlock extends Block {
    public AlterBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        Item item = player.getMainHandStack().getItem();
        int stackNum = player.getMainHandStack().getCount();
        if (item == ModItems.RAW_GOOBITE){
            player.setStackInHand(hand, new ItemStack(ModItems.GOOBITE_INGOT, stackNum));
        }
        return ActionResult.SUCCESS;
    }
}

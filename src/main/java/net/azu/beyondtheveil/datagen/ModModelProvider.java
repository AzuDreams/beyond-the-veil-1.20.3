package net.azu.beyondtheveil.datagen;

import net.azu.beyondtheveil.blocks.ModBlocks;
import net.azu.beyondtheveil.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOOBITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOOBITE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GOOBITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_GOOBITE, Models.GENERATED);


    }
}

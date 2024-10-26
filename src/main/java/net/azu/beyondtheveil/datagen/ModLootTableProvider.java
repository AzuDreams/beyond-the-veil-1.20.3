package net.azu.beyondtheveil.datagen;

import net.azu.beyondtheveil.blocks.ModBlocks;
import net.azu.beyondtheveil.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;


public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GOOBITE_ORE, oreDrops(ModBlocks.GOOBITE_ORE, ModItems.RAW_GOOBITE));

        addDrop(ModBlocks.GOOBITE_BLOCK);

    }
}

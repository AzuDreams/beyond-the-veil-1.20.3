package net.azu.beyondtheveil.datagen;

import net.azu.beyondtheveil.blocks.ModBlocks;
import net.azu.beyondtheveil.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;


public class ModLootTableProvider extends FabricBlockLootTableProvider {
    protected ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TEMP_ORE, oreDrops(ModBlocks.TEMP_ORE, ModItems.RAW_TEMP));

    }
}

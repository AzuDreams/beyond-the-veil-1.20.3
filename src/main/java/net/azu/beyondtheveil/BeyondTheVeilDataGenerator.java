package net.azu.beyondtheveil;

import net.azu.beyondtheveil.datagen.ModBlockTagProvider;
import net.azu.beyondtheveil.datagen.ModLootTableProvider;
import net.azu.beyondtheveil.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BeyondTheVeilDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		//pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		//pack.addProvider(ModRecipieProvider::new);

	}
}

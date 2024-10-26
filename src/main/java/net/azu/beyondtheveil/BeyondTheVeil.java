package net.azu.beyondtheveil;

import net.azu.beyondtheveil.blocks.ModBlocks;
import net.azu.beyondtheveil.items.ModItemGroups;
import net.azu.beyondtheveil.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeyondTheVeil implements ModInitializer {
	public static final String MOD_ID = "beyondtheveil";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}
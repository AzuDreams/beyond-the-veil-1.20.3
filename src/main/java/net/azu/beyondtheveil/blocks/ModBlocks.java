package net.azu.beyondtheveil.blocks;

import net.azu.beyondtheveil.BeyondTheVeil;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block  TEMP_ORE = registerBlock("temp_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5), FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));


    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BeyondTheVeil.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BeyondTheVeil.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BeyondTheVeil.LOGGER.info("Registering Mod Blocks for " + BeyondTheVeil.MOD_ID);
    }
}

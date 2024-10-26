package net.azu.beyondtheveil.items;

import net.azu.beyondtheveil.BeyondTheVeil;
import net.azu.beyondtheveil.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BeyondTheVeil.MOD_ID, "eldritch"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eldritch"))
                    .icon(() -> new ItemStack(ModItems.GOOBITE_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_GOOBITE);
                        entries.add(ModItems.GOOBITE_INGOT);
                        entries.add(ModBlocks.GOOBITE_ORE);
                        entries.add(ModBlocks.GOOBITE_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        BeyondTheVeil.LOGGER.info("Registering item groups for " + BeyondTheVeil.MOD_ID);


    }
}

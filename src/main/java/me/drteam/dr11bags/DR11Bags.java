package me.drteam.dr11bags;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DR11Bags implements ModInitializer {

    public static ItemGroup BAGS = FabricItemGroupBuilder.create(new Identifier( "dr11bags", "dr11bags"))
            .icon(() -> new ItemStack(DR11Bags.STRAP))
            .build();

    public static Item STRAP = new Item(new FabricItemSettings().maxCount(64).group(BAGS));
    public static Item BUCKLE = new Item(new FabricItemSettings().maxCount(64).group(BAGS));

    public static final String MODID = "dr11bags";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);


    @Override
    public void onInitialize() {

        LOGGER.info( "\n" +
                " _______   _______     __      __    _______    ______    ______    ______  \n" +
                "|       \\ |       \\  _/  \\   _/  \\  |       \\  /      \\  /      \\  /      \\ \n" +
                "| $$$$$$$\\| $$$$$$$\\|   $$  |   $$  | $$$$$$$\\|  $$$$$$\\|  $$$$$$\\|  $$$$$$\\\n" +
                "| $$  | $$| $$__| $$ \\$$$$   \\$$$$  | $$__/ $$| $$__| $$| $$ __\\$$| $$___\\$$\n" +
                "| $$  | $$| $$    $$  | $$    | $$  | $$    $$| $$    $$| $$|    \\ \\$$    \\ \n" +
                "| $$  | $$| $$$$$$$\\  | $$    | $$  | $$$$$$$\\| $$$$$$$$| $$ \\$$$$ _\\$$$$$$\\\n" +
                "| $$__/ $$| $$  | $$ _| $$_  _| $$_ | $$__/ $$| $$  | $$| $$__| $$|  \\__| $$\n" +
                "| $$    $$| $$  | $$|   $$ \\|   $$ \\| $$    $$| $$  | $$ \\$$    $$ \\$$    $$\n" +
                " \\$$$$$$$  \\$$   \\$$ \\$$$$$$ \\$$$$$$ \\$$$$$$$  \\$$   \\$$  \\$$$$$$   \\$$$$$$ "
        );
        Registry.register(Registry.ITEM, new Identifier("dr11bags", "strap"), STRAP );
        Registry.register(Registry.ITEM, new Identifier("dr11bags", "buckle"), BUCKLE );
    }
}

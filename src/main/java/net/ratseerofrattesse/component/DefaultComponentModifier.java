package net.ratseerofrattesse.component;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.fabricmc.fabric.api.registry.FuelValueEvents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Items;

public class DefaultComponentModifier {
    public static void modifyComponents() {
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.DIAMOND_SWORD, builder -> {
                builder.set(DataComponents.UNBREAKABLE, net.minecraft.util.Unit.INSTANCE);
            });
        });
    }

    //TODO THIS IS TEMPORARY. ONCE 26.3 IS OUT, USE THE COOKING FUEL COMPONENT
    public static void modifyFuels() {
        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(Items.FEATHER, 120);
        });
    }
}

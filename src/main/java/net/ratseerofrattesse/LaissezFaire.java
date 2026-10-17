package net.ratseerofrattesse;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.Identifier;

import net.ratseerofrattesse.command.ModCommands;
import net.ratseerofrattesse.component.DefaultComponentModifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LaissezFaire implements ModInitializer {
	public static final String MOD_ID = "laissezfaire";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DefaultComponentModifier.modifyComponents();
		DefaultComponentModifier.modifyFuels();
		ModCommands.registerCommands();
		if (FabricLoader.getInstance().isModLoaded("realmbinder")) {
			LOGGER.info("Scales galore!");
		} else {
			LOGGER.info("It's time to economy.");
		}
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}

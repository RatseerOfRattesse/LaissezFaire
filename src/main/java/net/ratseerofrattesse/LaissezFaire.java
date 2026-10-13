package net.ratseerofrattesse;

import net.fabricmc.api.ModInitializer;

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
		LOGGER.info("It's time to economy.");
		DefaultComponentModifier.modifyComponents();
		DefaultComponentModifier.modifyFuels();
		ModCommands.registerCommands();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}

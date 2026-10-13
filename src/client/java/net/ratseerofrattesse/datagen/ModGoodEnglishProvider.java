package net.ratseerofrattesse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModGoodEnglishProvider extends FabricLanguageProvider {
    public ModGoodEnglishProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_ca", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider holderLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("trim_pattern.laissezfaire.confluence", "Confluence");
        translationBuilder.add("trim_pattern.laissezfaire.violence", "Violence");
        translationBuilder.add("trim_pattern.laissezfaire.foresight", "Foresight");
        translationBuilder.add("trim_pattern.laissezfaire.internecion", "Internecion");
        translationBuilder.add("trim_pattern.laissezfaire.naivety", "Naivety");
        translationBuilder.add("trim_pattern.laissezfaire.rebellion", "Rebellion");
        translationBuilder.add("trim_pattern.laissezfaire.unity", "Unity");
        translationBuilder.add("item.laissezfaire.confluence", "Confluence Armour Trim");
        translationBuilder.add("item.laissezfaire.violence", "Violence Armour Trim");
        translationBuilder.add("item.laissezfaire.foresight", "Foresight Armour Trim");
        translationBuilder.add("item.laissezfaire.internecion", "Internecion Armour Trim");
        translationBuilder.add("item.laissezfaire.naivety", "Naivety Armour Trim");
        translationBuilder.add("item.laissezfaire.rebellion", "Rebellion Armour Trim");
        translationBuilder.add("item.laissezfaire.unity", "Unity Armour Trim");



        translationBuilder.add("enchantment.laissezfaire.spark_intrinsic", "Spark Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.disperse_intrinsic", "Disperse Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.ripple_intrinsic", "Ripple Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.accrue_intrinsic", "Accrue Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.phantom_intrinsic", "Phantom Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.vengeful_intrinsic", "Vengeful Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.vitality_intrinsic", "Vitality Intrinsic");



        translationBuilder.add("laissezfaire.intrinsic.setbonus", "Full Set Bonus:");

        translationBuilder.add("laissezfaire.intrinsic.spark.1", " Spawns a particle on hit");
        translationBuilder.add("laissezfaire.intrinsic.spark.2", " that nearby entities are");
        translationBuilder.add("laissezfaire.intrinsic.spark.3", " forced to look at.");

        translationBuilder.add("laissezfaire.intrinsic.spark.iron.helmet", "Reflection Helmet");
        translationBuilder.add("laissezfaire.intrinsic.spark.iron.chestplate", "Reflection Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.spark.iron.leggings", "Reflection Leggings");
        translationBuilder.add("laissezfaire.intrinsic.spark.iron.boots", "Reflection Boots");

        translationBuilder.add("laissezfaire.intrinsic.spark.diamond.helmet", "Mirrorweave Helmet");
        translationBuilder.add("laissezfaire.intrinsic.spark.diamond.chestplate", "Mirrorweave Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.spark.diamond.leggings", "Mirrorweave Leggings");
        translationBuilder.add("laissezfaire.intrinsic.spark.diamond.boots", "Mirrorweave Boots");

        translationBuilder.add("laissezfaire.intrinsic.disperse.1", " If a mob attacks you,");
        translationBuilder.add("laissezfaire.intrinsic.disperse.2", " it gets knocked back.");
        translationBuilder.add("laissezfaire.intrinsic.disperse.3", " You spawn a smoke cloud");
        translationBuilder.add("laissezfaire.intrinsic.disperse.4", " and teleport forward.");

        translationBuilder.add("laissezfaire.intrinsic.disperse.iron.helmet", "Precautionary Helmet");
        translationBuilder.add("laissezfaire.intrinsic.disperse.iron.chestplate", "Precautionary Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.disperse.iron.leggings", "Precautionary Leggings");
        translationBuilder.add("laissezfaire.intrinsic.disperse.iron.boots", "Precautionary Boots");

        translationBuilder.add("laissezfaire.intrinsic.disperse.diamond.helmet", "Foreshadowed Helmet");
        translationBuilder.add("laissezfaire.intrinsic.disperse.diamond.chestplate", "Foreshadowed Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.disperse.diamond.leggings", "Foreshadowed Leggings");
        translationBuilder.add("laissezfaire.intrinsic.disperse.diamond.boots", "Foreshadowed Boots");

        translationBuilder.add("laissezfaire.intrinsic.ripple.1", " Mobs that hit you receive");
        translationBuilder.add("laissezfaire.intrinsic.ripple.2", " damage and spread echoes");
        translationBuilder.add("laissezfaire.intrinsic.ripple.3", " of the damage to other");
        translationBuilder.add("laissezfaire.intrinsic.ripple.4", " nearby enemies.");

        translationBuilder.add("laissezfaire.intrinsic.ripple.iron.helmet", "Echoing Helmet");
        translationBuilder.add("laissezfaire.intrinsic.ripple.iron.chestplate", "Echoing Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.ripple.iron.leggings", "Echoing Leggings");
        translationBuilder.add("laissezfaire.intrinsic.ripple.iron.boots", "Echoing Boots");

        translationBuilder.add("laissezfaire.intrinsic.ripple.diamond.helmet", "Tidecycle Helmet");
        translationBuilder.add("laissezfaire.intrinsic.ripple.diamond.chestplate", "Tidecycle Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.ripple.diamond.leggings", "Tidecycle Leggings");
        translationBuilder.add("laissezfaire.intrinsic.ripple.diamond.boots", "Tidecycle Boots");

        translationBuilder.add("laissezfaire.intrinsic.accrue.1", " Gain experience and speed");
        translationBuilder.add("laissezfaire.intrinsic.accrue.2", " for every hit you take.");

        translationBuilder.add("laissezfaire.intrinsic.accrue.iron.helmet", "Learning Helmet");
        translationBuilder.add("laissezfaire.intrinsic.accrue.iron.chestplate", "Learning Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.accrue.iron.leggings", "Learning Leggings");
        translationBuilder.add("laissezfaire.intrinsic.accrue.iron.boots", "Learning Boots");

        translationBuilder.add("laissezfaire.intrinsic.accrue.diamond.helmet", "Wisdomheld Helmet");
        translationBuilder.add("laissezfaire.intrinsic.accrue.diamond.chestplate", "Wisdomheld Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.accrue.diamond.leggings", "Wisdomheld Leggings");
        translationBuilder.add("laissezfaire.intrinsic.accrue.diamond.boots", "Wisdomheld Boots");

        translationBuilder.add("laissezfaire.intrinsic.phantom.1", " An invisible bridge builds");
        translationBuilder.add("laissezfaire.intrinsic.phantom.2", " beneath you while you walk.");
        translationBuilder.add("laissezfaire.intrinsic.phantom.3", " While wearing the full set and");
        translationBuilder.add("laissezfaire.intrinsic.phantom.4", " sprinting, you cannot jump.");

        translationBuilder.add("laissezfaire.intrinsic.phantom.iron.helmet", "Floating Helmet");
        translationBuilder.add("laissezfaire.intrinsic.phantom.iron.chestplate", "Floating Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.phantom.iron.leggings", "Floating Leggings");
        translationBuilder.add("laissezfaire.intrinsic.phantom.iron.boots", "Floating Boots");

        translationBuilder.add("laissezfaire.intrinsic.phantom.diamond.helmet", "Vexwalker Helmet");
        translationBuilder.add("laissezfaire.intrinsic.phantom.diamond.chestplate", "Vexwalker Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.phantom.diamond.leggings", "Vexwalker Leggings");
        translationBuilder.add("laissezfaire.intrinsic.phantom.diamond.boots", "Vexwalker Boots");

        translationBuilder.add("laissezfaire.intrinsic.vengeful.1", " On hit, burn health to");
        translationBuilder.add("laissezfaire.intrinsic.vengeful.2", " deliver a secondary");
        translationBuilder.add("laissezfaire.intrinsic.vengeful.3", " strike of rage.");
        translationBuilder.add("laissezfaire.intrinsic.vengeful.4", " to enemies around you.");

        translationBuilder.add("laissezfaire.intrinsic.vengeful.iron.helmet", "Angered Helmet");
        translationBuilder.add("laissezfaire.intrinsic.vengeful.iron.chestplate", "Angered Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.vengeful.iron.leggings", "Angered Leggings");
        translationBuilder.add("laissezfaire.intrinsic.vengeful.iron.boots", "Angered Boots");

        translationBuilder.add("laissezfaire.intrinsic.vengeful.diamond.helmet", "Hollowed Helmet");
        translationBuilder.add("laissezfaire.intrinsic.vengeful.diamond.chestplate", "Hollowed Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.vengeful.diamond.leggings", "Hollowed Leggings");
        translationBuilder.add("laissezfaire.intrinsic.vengeful.diamond.boots", "Hollowed Boots");

        translationBuilder.add("laissezfaire.intrinsic.vitality.1", " Absorb your kills'");
        translationBuilder.add("laissezfaire.intrinsic.vitality.2", " life force into");
        translationBuilder.add("laissezfaire.intrinsic.vitality.3", " absorption.");

        translationBuilder.add("laissezfaire.intrinsic.vitality.iron.helmet", "Hearty Helmet");
        translationBuilder.add("laissezfaire.intrinsic.vitality.iron.chestplate", "Hearty Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.vitality.iron.leggings", "Hearty Leggings");
        translationBuilder.add("laissezfaire.intrinsic.vitality.iron.boots", "Hearty Boots");

        translationBuilder.add("laissezfaire.intrinsic.vitality.diamond.helmet", "Vigor Helmet");
        translationBuilder.add("laissezfaire.intrinsic.vitality.diamond.chestplate", "Vigor Chestplate");
        translationBuilder.add("laissezfaire.intrinsic.vitality.diamond.leggings", "Vigor Leggings");
        translationBuilder.add("laissezfaire.intrinsic.vitality.diamond.boots", "Vigor Boots");




        translationBuilder.add("laissezfaire.laissezteam.current_team", "Current Team: ");
        translationBuilder.add("laissezfaire.laissezteam.noteam", "You are not in a team.");
        translationBuilder.add("laissezfaire.laissezteam.createdteam", "Team created.");
        translationBuilder.add("laissezfaire.laissezteam.hasteam", "You are already in a team.");
        translationBuilder.add("laissezfaire.laissezteam.invitedby", " has invited you to join their team.");
        translationBuilder.add("laissezfaire.laissezteam.accept", "Click to accept.");
        translationBuilder.add("laissezfaire.laissezteam.noperms", "You don't own this team.");
        translationBuilder.add("laissezfaire.laissezteam.invited", "Invite sent.");
        translationBuilder.add("laissezfaire.laissezteam.noinv", "You have no invites.");
        translationBuilder.add("laissezfaire.laissezteam.joined", " has joined the team.");
        translationBuilder.add("laissezfaire.laissezteam.ownerleave", "You own this team. Transfer ownership or disband instead.");
        translationBuilder.add("laissezfaire.laissezteam.left", " has left the team.");
        translationBuilder.add("laissezfaire.laissezteam.differentteam", "That player is not on your team.");
        translationBuilder.add("laissezfaire.laissezteam.transferredplayer", "Team ownership has been transferred to you.");
        translationBuilder.add("laissezfaire.laissezteam.transferred", "Ownership transferred.");
        translationBuilder.add("laissezfaire.laissezteam.disbanded", "Team disbanded.");
        translationBuilder.add("laissezfaire.laissezteam.kicked", "Player kicked.");
        translationBuilder.add("laissezfaire.laissezteam.kickedplayer", "You have been kicked.");
    }

    @Override
    public String getName() {
        return "Good English";
    }
}

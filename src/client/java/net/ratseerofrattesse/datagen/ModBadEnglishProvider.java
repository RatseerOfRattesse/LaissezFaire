package net.ratseerofrattesse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBadEnglishProvider extends FabricLanguageProvider {
    public ModBadEnglishProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
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

        translationBuilder.add("enchantment.laissezfaire.evaporate_intrinsic", "Evaporate Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.lichen_intrinsic", "Lichen Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.expose_intrinsic", "Expose Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.extract_intrinsic", "Extract Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.resolve_intrinsic", "Resolve Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.evil_intrinsic", "Evil Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.consume_intrinsic", "Consume Intrinsic");

        translationBuilder.add("enchantment.laissezfaire.descend_intrinsic", "Descend Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.banish_intrinsic", "Banish Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.heart_intrinsic", "Heart Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.sapping_intrinsic", "Sapping Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.quickdraw_intrinsic", "Quickdraw Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.grudge_intrinsic", "Grudge Intrinsic");
        translationBuilder.add("enchantment.laissezfaire.reflex_intrinsic", "Reflex Intrinsic");



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


        translationBuilder.add("laissezfaire.intrinsic.evaporate.1", " Remove fluids in a radius");
        translationBuilder.add("laissezfaire.intrinsic.evaporate.2", " around any block broken.");

        translationBuilder.add("laissezfaire.intrinsic.evaporate.iron.axe", "Aqueous Axe");
        translationBuilder.add("laissezfaire.intrinsic.evaporate.iron.hoe", "Aqueous Hoe");
        translationBuilder.add("laissezfaire.intrinsic.evaporate.iron.pickaxe", "Aqueous Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.evaporate.iron.shovel", "Aqueous Shovel");

        translationBuilder.add("laissezfaire.intrinsic.evaporate.diamond.axe", "Mirage Axe");
        translationBuilder.add("laissezfaire.intrinsic.evaporate.diamond.hoe", "Mirage Hoe");
        translationBuilder.add("laissezfaire.intrinsic.evaporate.diamond.pickaxe", "Mirage Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.evaporate.diamond.shovel", "Mirage Shovel");

        translationBuilder.add("laissezfaire.intrinsic.lichen.1", " Place a temporary light");
        translationBuilder.add("laissezfaire.intrinsic.lichen.2", " when you break a block.");

        translationBuilder.add("laissezfaire.intrinsic.lichen.iron.axe", "Glowing Axe");
        translationBuilder.add("laissezfaire.intrinsic.lichen.iron.hoe", "Glowing Hoe");
        translationBuilder.add("laissezfaire.intrinsic.lichen.iron.pickaxe", "Glowing Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.lichen.iron.shovel", "Glowing Shovel");

        translationBuilder.add("laissezfaire.intrinsic.lichen.diamond.axe", "Luminous Axe");
        translationBuilder.add("laissezfaire.intrinsic.lichen.diamond.hoe", "Luminous Hoe");
        translationBuilder.add("laissezfaire.intrinsic.lichen.diamond.pickaxe", "Luminous Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.lichen.diamond.shovel", "Luminous Shovel");

        translationBuilder.add("laissezfaire.intrinsic.expose.1", " Breaking a block glows");
        translationBuilder.add("laissezfaire.intrinsic.expose.2", " nearby non-teamed mobs.");

        translationBuilder.add("laissezfaire.intrinsic.expose.iron.axe", "Insightful Axe");
        translationBuilder.add("laissezfaire.intrinsic.expose.iron.hoe", "Insightful Hoe");
        translationBuilder.add("laissezfaire.intrinsic.expose.iron.pickaxe", "Insightful Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.expose.iron.shovel", "Insightful Shovel");

        translationBuilder.add("laissezfaire.intrinsic.expose.diamond.axe", "Panoptical Axe");
        translationBuilder.add("laissezfaire.intrinsic.expose.diamond.hoe", "Panoptical Hoe");
        translationBuilder.add("laissezfaire.intrinsic.expose.diamond.pickaxe", "Panoptical Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.expose.diamond.shovel", "Panoptical Shovel");

        translationBuilder.add("laissezfaire.intrinsic.extract.1", " Broken blocks may");
        translationBuilder.add("laissezfaire.intrinsic.extract.2", " drop experience.");

        translationBuilder.add("laissezfaire.intrinsic.extract.iron.axe", "Precise Axe");
        translationBuilder.add("laissezfaire.intrinsic.extract.iron.hoe", "Precise Hoe");
        translationBuilder.add("laissezfaire.intrinsic.extract.iron.pickaxe", "Precise Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.extract.iron.shovel", "Precise Shovel");

        translationBuilder.add("laissezfaire.intrinsic.extract.diamond.axe", "Surgical Axe");
        translationBuilder.add("laissezfaire.intrinsic.extract.diamond.hoe", "Surgical Hoe");
        translationBuilder.add("laissezfaire.intrinsic.extract.diamond.pickaxe", "Surgical Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.extract.diamond.shovel", "Surgical Shovel");

        translationBuilder.add("laissezfaire.intrinsic.resolve.1", " Mining speed increases");
        translationBuilder.add("laissezfaire.intrinsic.resolve.2", " with each block broken.");

        translationBuilder.add("laissezfaire.intrinsic.resolve.iron.axe", "Stubborn Axe");
        translationBuilder.add("laissezfaire.intrinsic.resolve.iron.hoe", "Stubborn Hoe");
        translationBuilder.add("laissezfaire.intrinsic.resolve.iron.pickaxe", "Stubborn Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.resolve.iron.shovel", "Stubborn Shovel");

        translationBuilder.add("laissezfaire.intrinsic.resolve.diamond.axe", "Determined Axe");
        translationBuilder.add("laissezfaire.intrinsic.resolve.diamond.hoe", "Determined Hoe");
        translationBuilder.add("laissezfaire.intrinsic.resolve.diamond.pickaxe", "Determined Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.resolve.diamond.shovel", "Determined Shovel");

        translationBuilder.add("laissezfaire.intrinsic.evil.1", " The tool becomes an");
        translationBuilder.add("laissezfaire.intrinsic.evil.2", " improvised weapon.");

        translationBuilder.add("laissezfaire.intrinsic.evil.iron.axe", "Terrible Axe");
        translationBuilder.add("laissezfaire.intrinsic.evil.iron.hoe", "Terrible Hoe");
        translationBuilder.add("laissezfaire.intrinsic.evil.iron.pickaxe", "Terrible Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.evil.iron.shovel", "Terrible Shovel");

        translationBuilder.add("laissezfaire.intrinsic.evil.diamond.axe", "Malevolent Axe");
        translationBuilder.add("laissezfaire.intrinsic.evil.diamond.hoe", "Malevolent Hoe");
        translationBuilder.add("laissezfaire.intrinsic.evil.diamond.pickaxe", "Malevolent Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.evil.diamond.shovel", "Malevolent Shovel");

        translationBuilder.add("laissezfaire.intrinsic.consume.1", " Take hunger from blocks");
        translationBuilder.add("laissezfaire.intrinsic.consume.2", " broken.");

        translationBuilder.add("laissezfaire.intrinsic.consume.iron.axe", "Hungry Axe");
        translationBuilder.add("laissezfaire.intrinsic.consume.iron.hoe", "Hungry Hoe");
        translationBuilder.add("laissezfaire.intrinsic.consume.iron.pickaxe", "Hungry Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.consume.iron.shovel", "Hungry Shovel");

        translationBuilder.add("laissezfaire.intrinsic.consume.diamond.axe", "Insatiable Axe");
        translationBuilder.add("laissezfaire.intrinsic.consume.diamond.hoe", "Insatiable Hoe");
        translationBuilder.add("laissezfaire.intrinsic.consume.diamond.pickaxe", "Insatiable Pickaxe");
        translationBuilder.add("laissezfaire.intrinsic.consume.diamond.shovel", "Insatiable Shovel");



        translationBuilder.add("laissezfaire.intrinsic.descend.1", " Hit entities are shoved");
        translationBuilder.add("laissezfaire.intrinsic.descend.2", " downwards into the ground.");

        translationBuilder.add("laissezfaire.intrinsic.descend.iron.axe", "Deep Axe");
        translationBuilder.add("laissezfaire.intrinsic.descend.iron.spear", "Deep Spear");
        translationBuilder.add("laissezfaire.intrinsic.descend.iron.sword", "Deep Sword");

        translationBuilder.add("laissezfaire.intrinsic.descend.diamond.axe", "Underworld Axe");
        translationBuilder.add("laissezfaire.intrinsic.descend.diamond.spear", "Underworld Spear");
        translationBuilder.add("laissezfaire.intrinsic.descend.diamond.sword", "Underworld Sword");

        translationBuilder.add("laissezfaire.intrinsic.banish.1", " Chance to delete undead,");
        translationBuilder.add("laissezfaire.intrinsic.banish.2", " leaving no drops or");
        translationBuilder.add("laissezfaire.intrinsic.banish.3", " experience.");

        translationBuilder.add("laissezfaire.intrinsic.banish.iron.axe", "Holy Axe");
        translationBuilder.add("laissezfaire.intrinsic.banish.iron.spear", "Holy Spear");
        translationBuilder.add("laissezfaire.intrinsic.banish.iron.sword", "Holy Sword");

        translationBuilder.add("laissezfaire.intrinsic.banish.diamond.axe", "Sanctified Axe");
        translationBuilder.add("laissezfaire.intrinsic.banish.diamond.spear", "Sanctified Spear");
        translationBuilder.add("laissezfaire.intrinsic.banish.diamond.sword", "Sanctified Sword");

        translationBuilder.add("laissezfaire.intrinsic.heart.1", " Hitting a teamed entity");
        translationBuilder.add("laissezfaire.intrinsic.heart.2", " heals both of you.");

        translationBuilder.add("laissezfaire.intrinsic.heart.iron.axe", "Loving Axe");
        translationBuilder.add("laissezfaire.intrinsic.heart.iron.spear", "Loving Spear");
        translationBuilder.add("laissezfaire.intrinsic.heart.iron.sword", "Loving Sword");

        translationBuilder.add("laissezfaire.intrinsic.heart.diamond.axe", "Affectionate Axe");
        translationBuilder.add("laissezfaire.intrinsic.heart.diamond.spear", "Affectionate Spear");
        translationBuilder.add("laissezfaire.intrinsic.heart.diamond.sword", "Affectionate Sword");

        translationBuilder.add("laissezfaire.intrinsic.sapping.1", " More experience drops");
        translationBuilder.add("laissezfaire.intrinsic.sapping.2", " from mobs.");

        translationBuilder.add("laissezfaire.intrinsic.sapping.iron.axe", "Dripping Axe");
        translationBuilder.add("laissezfaire.intrinsic.sapping.iron.spear", "Dripping Spear");
        translationBuilder.add("laissezfaire.intrinsic.sapping.iron.sword", "Dripping Sword");

        translationBuilder.add("laissezfaire.intrinsic.sapping.diamond.axe", "Funnelled Axe");
        translationBuilder.add("laissezfaire.intrinsic.sapping.diamond.spear", "Funnelled Spear");
        translationBuilder.add("laissezfaire.intrinsic.sapping.diamond.sword", "Funnelled Sword");

        translationBuilder.add("laissezfaire.intrinsic.quickdraw.1", " Base attack damage is");
        translationBuilder.add("laissezfaire.intrinsic.quickdraw.2", " lowered but attack speed");
        translationBuilder.add("laissezfaire.intrinsic.quickdraw.3", " increases with every");
        translationBuilder.add("laissezfaire.intrinsic.quickdraw.4", " subsequent hit.");

        translationBuilder.add("laissezfaire.intrinsic.quickdraw.iron.axe", "Swift Axe");
        translationBuilder.add("laissezfaire.intrinsic.quickdraw.iron.spear", "Swift Spear");
        translationBuilder.add("laissezfaire.intrinsic.quickdraw.iron.sword", "Swift Sword");

        translationBuilder.add("laissezfaire.intrinsic.quickdraw.diamond.axe", "Windflow Axe");
        translationBuilder.add("laissezfaire.intrinsic.quickdraw.diamond.spear", "Windflow Spear");
        translationBuilder.add("laissezfaire.intrinsic.quickdraw.diamond.sword", "Windflow Sword");

        translationBuilder.add("laissezfaire.intrinsic.grudge.1", " If you continue hitting");
        translationBuilder.add("laissezfaire.intrinsic.grudge.2", " the same entity, it");
        translationBuilder.add("laissezfaire.intrinsic.grudge.3", " takes extra damage.");

        translationBuilder.add("laissezfaire.intrinsic.grudge.iron.axe", "Memory Axe");
        translationBuilder.add("laissezfaire.intrinsic.grudge.iron.spear", "Memory Spear");
        translationBuilder.add("laissezfaire.intrinsic.grudge.iron.sword", "Memory Sword");

        translationBuilder.add("laissezfaire.intrinsic.grudge.diamond.axe", "Vengeance Axe");
        translationBuilder.add("laissezfaire.intrinsic.grudge.diamond.spear", "Vengeance Spear");
        translationBuilder.add("laissezfaire.intrinsic.grudge.diamond.sword", "Vengeance Sword");

        translationBuilder.add("laissezfaire.intrinsic.reflex.1", " Chance to dodge an attack");
        translationBuilder.add("laissezfaire.intrinsic.reflex.2", " and move backwards.");

        translationBuilder.add("laissezfaire.intrinsic.reflex.iron.axe", "Instinct Axe");
        translationBuilder.add("laissezfaire.intrinsic.reflex.iron.spear", "Instinct Spear");
        translationBuilder.add("laissezfaire.intrinsic.reflex.iron.sword", "Instinct Sword");

        translationBuilder.add("laissezfaire.intrinsic.reflex.diamond.axe", "Cerebrum Axe");
        translationBuilder.add("laissezfaire.intrinsic.reflex.diamond.spear", "Cerebrum Spear");
        translationBuilder.add("laissezfaire.intrinsic.reflex.diamond.sword", "Cerebrum Sword");



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
        return "Bad English";
    }
}

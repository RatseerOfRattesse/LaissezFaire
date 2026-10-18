package net.ratseerofrattesse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.world.item.enchantment.Enchantment;
import net.ratseerofrattesse.enchantment.ModEnchantments;

import java.util.concurrent.CompletableFuture;

public class ModEnchantmentTagProvider extends FabricTagsProvider<Enchantment> {
    public ModEnchantmentTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.ENCHANTMENT, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        builder(EnchantmentTags.CURSE)
                .add(ModEnchantments.SPARK_INTRINSIC)
                .add(ModEnchantments.DISPERSE_INTRINSIC)
                .add(ModEnchantments.RIPPLE_INTRINSIC)
                .add(ModEnchantments.ACCRUE_INTRINSIC)
                .add(ModEnchantments.PHANTOM_INTRINSIC)
                .add(ModEnchantments.VENGEFUL_INTRINSIC)
                .add(ModEnchantments.VITALITY_INTRINSIC)

                .add(ModEnchantments.EVAPORATE_INTRINSIC)
                .add(ModEnchantments.LICHEN_INTRINSIC)
                .add(ModEnchantments.EXPOSE_INTRINSIC)
                .add(ModEnchantments.EXTRACT_INTRINSIC)
                .add(ModEnchantments.RESOLVE_INTRINSIC)
                .add(ModEnchantments.EVIL_INTRINSIC)
                .add(ModEnchantments.CONSUME_INTRINSIC)

                .add(ModEnchantments.DESCEND_INTRINSIC)
                .add(ModEnchantments.BANISH_INTRINSIC)
                .add(ModEnchantments.HEART_INTRINSIC)
                .add(ModEnchantments.SAPPING_INTRINSIC)
                .add(ModEnchantments.QUICKDRAW_INTRINSIC)
                .add(ModEnchantments.GRUDGE_INTRINSIC)
                .add(ModEnchantments.REFLEX_INTRINSIC);

    }
}

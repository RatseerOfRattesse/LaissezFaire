package net.ratseerofrattesse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.ratseerofrattesse.LaissezFaire;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {

    public static final TagKey<Item> WEAPONSMITH_INTRINSIC_ENCHANTABLE = TagKey.create(Registries.ITEM, LaissezFaire.id("weaponsmith_intrinsic_enchantable"));

    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        builder(WEAPONSMITH_INTRINSIC_ENCHANTABLE)
                .addOptionalTag(ItemTags.MELEE_WEAPON_ENCHANTABLE)
                .addOptionalTag(ItemTags.AXES);
    }
}

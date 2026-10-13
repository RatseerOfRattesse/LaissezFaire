package net.ratseerofrattesse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.predicates.DataComponentMatchers;
import net.minecraft.advancements.predicates.EnchantmentPredicate;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.advancements.predicates.MinMaxBounds;
import net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate;
import net.minecraft.advancements.predicates.entity.EntityPredicate;
import net.minecraft.advancements.predicates.entity.PlayerPredicate;
import net.minecraft.advancements.triggers.PlayerHurtEntityTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.predicates.DataComponentPredicates;
import net.minecraft.core.component.predicates.EnchantmentsPredicate;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;
import net.ratseerofrattesse.LaissezFaire;
import net.ratseerofrattesse.enchantment.ModEnchantments;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(HolderLookup.Provider provider, Consumer<AdvancementHolder> consumer) {
        /*
        AdvancementHolder vengefulIntrinsic = Advancement.Builder.advancement()
                .addCriterion("vengeful_intrinsic", PlayerHurtEntityTrigger.TriggerInstance.playerHurtEntity(Optional.of(requireFullSet(provider, ModEnchantments.VENGEFUL_INTRINSIC))))
                .rewards(AdvancementRewards.Builder.function(Identifier.fromNamespaceAndPath(LaissezFaire.MOD_ID, "vengeful_intrinsic")))
                .save(consumer, LaissezFaire.id("vengeful_intrinsic"));

         */
    }

    private static EntityPredicate requireFullSet(HolderLookup.Provider provider, ResourceKey<Enchantment> enchantmentResourceKey) {
        return EntityPredicate.Builder.entity().equipment(EntityEquipmentPredicate.Builder.equipment()
                .head(ItemPredicate.Builder.item()
                        .withComponents(DataComponentMatchers.Builder.components()
                                .partial(DataComponentPredicates.ENCHANTMENTS,
                                        EnchantmentsPredicate.enchantments(List.of(new EnchantmentPredicate(
                                                provider.lookup(Registries.ENCHANTMENT).get().getOrThrow(enchantmentResourceKey),
                                                new MinMaxBounds.Ints(
                                                        MinMaxBounds.Bounds.any(),
                                                        MinMaxBounds.Bounds.any()
                                                )
                                        )))
                                ).build()
                        )
                )
                .chest(ItemPredicate.Builder.item()
                        .withComponents(DataComponentMatchers.Builder.components()
                                .partial(DataComponentPredicates.ENCHANTMENTS,
                                        EnchantmentsPredicate.enchantments(List.of(new EnchantmentPredicate(
                                                provider.lookup(Registries.ENCHANTMENT).get().getOrThrow(enchantmentResourceKey),
                                                new MinMaxBounds.Ints(
                                                        MinMaxBounds.Bounds.any(),
                                                        MinMaxBounds.Bounds.any()
                                                )
                                        )))
                                ).build()
                        )
                )
                .legs(ItemPredicate.Builder.item()
                        .withComponents(DataComponentMatchers.Builder.components()
                                .partial(DataComponentPredicates.ENCHANTMENTS,
                                        EnchantmentsPredicate.enchantments(List.of(new EnchantmentPredicate(
                                                provider.lookup(Registries.ENCHANTMENT).get().getOrThrow(enchantmentResourceKey),
                                                new MinMaxBounds.Ints(
                                                        MinMaxBounds.Bounds.any(),
                                                        MinMaxBounds.Bounds.any()
                                                )
                                        )))
                                ).build()
                        )
                )
                .feet(ItemPredicate.Builder.item()
                        .withComponents(DataComponentMatchers.Builder.components()
                                .partial(DataComponentPredicates.ENCHANTMENTS,
                                        EnchantmentsPredicate.enchantments(List.of(new EnchantmentPredicate(
                                                provider.lookup(Registries.ENCHANTMENT).get().getOrThrow(enchantmentResourceKey),
                                                new MinMaxBounds.Ints(
                                                        MinMaxBounds.Bounds.any(),
                                                        MinMaxBounds.Bounds.any()
                                                )
                                        )))
                                ).build()
                        )
                )
        ).build();
    }
}

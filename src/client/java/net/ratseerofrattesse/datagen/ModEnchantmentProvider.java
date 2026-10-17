package net.ratseerofrattesse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.advancements.predicates.*;
import net.minecraft.advancements.predicates.entity.*;
import net.minecraft.core.*;
import net.minecraft.core.component.predicates.DataComponentPredicates;
import net.minecraft.core.component.predicates.EnchantmentsPredicate;
import net.minecraft.core.particles.GeyserBaseParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.valueproviders.ConstantFloat;
import net.minecraft.util.valueproviders.FloatProvider;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.enchantment.*;
import net.minecraft.world.item.enchantment.effects.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.AllOfCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.phys.Vec3;
import net.ratseerofrattesse.LaissezFaire;
import net.ratseerofrattesse.enchantment.ModEnchantments;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ModEnchantmentProvider extends FabricDynamicRegistryProvider {
    public ModEnchantmentProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        entries.addAll(registries.lookupOrThrow(Registries.ENCHANTMENT));
    }

    @Override
    public String getName() {
        return "Enchantments";
    }

    private static void register(BootstrapContext<Enchantment> context, ResourceKey<Enchantment> key, Enchantment.Builder builder) {
        context.register(key, builder.build(key.identifier()));
    }

    public static void bootstrap(BootstrapContext<Enchantment> context) {
        register(context, ModEnchantments.SPARK_INTRINSIC,
            Enchantment.enchantment(
                    Enchantment.definition(
                            context.lookup(Registries.ITEM).getOrThrow(ItemTags.ARMOR_ENCHANTABLE),
                            1,
                            1,
                            Enchantment.dynamicCost(0, 0),
                            Enchantment.dynamicCost(0, 0),
                            0,
                            EquipmentSlotGroup.ARMOR
                    )
                )
                .withEffect(
                        EnchantmentEffectComponents.POST_ATTACK,
                        EnchantmentTarget.VICTIM,
                        EnchantmentTarget.VICTIM,
                        new RunFunction(Identifier.fromNamespaceAndPath(LaissezFaire.MOD_ID, "spark_intrinsic_owner")),
                        requireFullSet(context, ModEnchantments.SPARK_INTRINSIC)
                )
                .withEffect(
                        EnchantmentEffectComponents.POST_ATTACK,
                        EnchantmentTarget.VICTIM,
                        EnchantmentTarget.ATTACKER,
                        new RunFunction(Identifier.fromNamespaceAndPath(LaissezFaire.MOD_ID, "spark_intrinsic")),
                        requireFullSet(context, ModEnchantments.SPARK_INTRINSIC)
            )
        );
        register(context, ModEnchantments.DISPERSE_INTRINSIC,
                Enchantment.enchantment(
                                Enchantment.definition(
                                        context.lookup(Registries.ITEM).getOrThrow(ItemTags.ARMOR_ENCHANTABLE),
                                        1,
                                        1,
                                        Enchantment.dynamicCost(0, 0),
                                        Enchantment.dynamicCost(0, 0),
                                        0,
                                        EquipmentSlotGroup.ARMOR
                                )
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.ATTACKER,
                                new ApplyEntityImpulse(new Vec3(0, 1, -1), new Vec3(0, 0.1, 0.5), LevelBasedValue.constant(1)),
                                requireFullSet(context, ModEnchantments.DISPERSE_INTRINSIC)
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.VICTIM,
                                new ApplyEntityImpulse(new Vec3(0, 0, 1), new Vec3(0, 0, 0.5), LevelBasedValue.constant(1)),
                                requireFullSet(context, ModEnchantments.DISPERSE_INTRINSIC)
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.VICTIM,
                                new RunFunction(Identifier.fromNamespaceAndPath(LaissezFaire.MOD_ID, "disperse_intrinsic")),
                                requireFullSet(context, ModEnchantments.DISPERSE_INTRINSIC)
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.VICTIM,
                                new PlaySoundEffect(List.of(Holder.direct(SoundEvents.WITHER_SHOOT)), f(10), f(1)),
                                requireFullSet(context, ModEnchantments.DISPERSE_INTRINSIC)
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.ATTACKER,
                                applyMobEffect(MobEffects.BLINDNESS, 3, 3, 1, 1),
                                requireFullSet(context, ModEnchantments.DISPERSE_INTRINSIC)
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.VICTIM,
                                applyMobEffect(MobEffects.INVISIBILITY, 10, 10, 1, 1),
                                requireFullSet(context, ModEnchantments.DISPERSE_INTRINSIC)
                        )
        );
        register(context, ModEnchantments.RIPPLE_INTRINSIC,
                Enchantment.enchantment(
                                Enchantment.definition(
                                        context.lookup(Registries.ITEM).getOrThrow(ItemTags.ARMOR_ENCHANTABLE),
                                        1,
                                        1,
                                        Enchantment.dynamicCost(0, 0),
                                        Enchantment.dynamicCost(0, 0),
                                        0,
                                        EquipmentSlotGroup.ARMOR
                                )
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.VICTIM,
                                new RunFunction(Identifier.fromNamespaceAndPath(LaissezFaire.MOD_ID, "ripple_intrinsic_owner")),
                                requireFullSet(context, ModEnchantments.RIPPLE_INTRINSIC)
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.ATTACKER,
                                new RunFunction(Identifier.fromNamespaceAndPath(LaissezFaire.MOD_ID, "ripple_intrinsic")),
                                requireFullSet(context, ModEnchantments.RIPPLE_INTRINSIC)
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.ATTACKER,
                                new PlaySoundEffect(List.of(Holder.direct(SoundEvents.WARDEN_HEARTBEAT)), f(10), f(1)),
                                requireFullSet(context, ModEnchantments.RIPPLE_INTRINSIC)
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.ATTACKER,
                                new PlaySoundEffect(List.of(Holder.direct(SoundEvents.AMETHYST_BLOCK_RESONATE)), f(10), f(1)),
                                requireFullSet(context, ModEnchantments.RIPPLE_INTRINSIC)
                        )
        );
        register(context, ModEnchantments.ACCRUE_INTRINSIC,
                Enchantment.enchantment(
                                Enchantment.definition(
                                        context.lookup(Registries.ITEM).getOrThrow(ItemTags.ARMOR_ENCHANTABLE),
                                        1,
                                        1,
                                        Enchantment.dynamicCost(0, 0),
                                        Enchantment.dynamicCost(0, 0),
                                        0,
                                        EquipmentSlotGroup.ARMOR
                                )
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.VICTIM,
                                new RunFunction(Identifier.fromNamespaceAndPath(LaissezFaire.MOD_ID, "accrue_intrinsic_owner")),
                                requireFullSet(context, ModEnchantments.ACCRUE_INTRINSIC)
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.VICTIM,
                                applyMobEffect(MobEffects.SPEED, 5, 5, 2, 2),
                                requireFullSet(context, ModEnchantments.ACCRUE_INTRINSIC)
                        )
                        .withEffect(
                                EnchantmentEffectComponents.POST_ATTACK,
                                EnchantmentTarget.VICTIM,
                                EnchantmentTarget.ATTACKER,
                                new PlaySoundEffect(List.of(SoundEvents.SOUL_ESCAPE), f(10), f(1F)),
                                requireFullSet(context, ModEnchantments.ACCRUE_INTRINSIC)
                        )
        );

        register(context, ModEnchantments.PHANTOM_INTRINSIC,
                Enchantment.enchantment(
                                Enchantment.definition(
                                        context.lookup(Registries.ITEM).getOrThrow(ItemTags.ARMOR_ENCHANTABLE),
                                        1,
                                        1,
                                        Enchantment.dynamicCost(0, 0),
                                        Enchantment.dynamicCost(0, 0),
                                        0,
                                        EquipmentSlotGroup.ARMOR
                                )
                        )
                        .withEffect(
                                EnchantmentEffectComponents.LOCATION_CHANGED,
                                new AllOf.LocationBasedEffects(
                                        List.of(
                                                new ReplaceBlock(
                                                        new Vec3i(0, -1, 0),
                                                        Optional.of(BlockPredicate.matchesTag(BlockTags.AIR)),
                                                        BlockStateProvider.simple(Blocks.BARRIER),
                                                        Optional.of(GameEvent.BLOCK_PLACE)
                                                ),
                                                new SpawnParticlesEffect(
                                                        new GeyserBaseParticleOptions(
                                                                ParticleTypes.GEYSER_BASE,
                                                                1, 0.1F),
                                                        SpawnParticlesEffect.offsetFromEntityPosition(0),
                                                        SpawnParticlesEffect.offsetFromEntityPosition(-1),
                                                        SpawnParticlesEffect.fixedVelocity(f(0)),
                                                        SpawnParticlesEffect.fixedVelocity(f(0)),
                                                        f(1)
                                                )
                                        )
                                ),
                                AllOfCondition.allOf(
                                        LootItemEntityPropertyCondition.hasProperties(
                                                LootContext.EntityTarget.THIS,
                                                EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setSprinting(true))
                                        ),
                                        LootItemEntityPropertyCondition.hasProperties(
                                                LootContext.EntityTarget.THIS,
                                                EntityPredicate.Builder.entity().player(PlayerPredicate.Builder.player().setGameType(GameTypePredicate.SURVIVAL_LIKE).build())),
                                        requireFullSet(context, ModEnchantments.PHANTOM_INTRINSIC)
                                )
                        )
                        .withEffect(
                                EnchantmentEffectComponents.LOCATION_CHANGED,
                                new EnchantmentAttributeEffect(
                                        Identifier.fromNamespaceAndPath(LaissezFaire.MOD_ID, "phantom_intrinsic"), Attributes.JUMP_STRENGTH, LevelBasedValue.constant(-1), AttributeModifier.Operation.ADD_VALUE
                                ),
                                AllOfCondition.allOf(
                                        LootItemEntityPropertyCondition.hasProperties(
                                                LootContext.EntityTarget.THIS,
                                                EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setSprinting(true))
                                        ),
                                        LootItemEntityPropertyCondition.hasProperties(
                                                LootContext.EntityTarget.THIS,
                                                EntityPredicate.Builder.entity().player(PlayerPredicate.Builder.player().setGameType(GameTypePredicate.SURVIVAL_LIKE).build())),
                                        requireFullSet(context, ModEnchantments.PHANTOM_INTRINSIC)
                                )
                        )
                        .withEffect(
                                EnchantmentEffectComponents.TICK,
                                new ReplaceBlock(
                                        new Vec3i(0, -1, 0),
                                        Optional.of(BlockPredicate.matchesBlocks(Blocks.BARRIER)),
                                        BlockStateProvider.simple(Blocks.AIR),
                                        Optional.of(GameEvent.BLOCK_DESTROY)
                                ),
                                LootItemEntityPropertyCondition.hasProperties(
                                        LootContext.EntityTarget.THIS,
                                        EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setSprinting(false))
                                )
                        )
                        .withEffect(
                                EnchantmentEffectComponents.TICK,
                                new RunFunction(Identifier.fromNamespaceAndPath(LaissezFaire.MOD_ID, "phantom_intrinsic_clean"))
                        )
        );
        register(context, ModEnchantments.VENGEFUL_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ItemTags.ARMOR_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.ARMOR
                        )
                )
        );
        register(context, ModEnchantments.VITALITY_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ItemTags.ARMOR_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.ARMOR
                        )
                )
        );



        register(context, ModEnchantments.EVAPORATE_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ItemTags.MINING_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.LICHEN_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ItemTags.MINING_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.EXPOSE_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ItemTags.MINING_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.EXTRACT_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ItemTags.MINING_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.RESOLVE_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ItemTags.MINING_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.EVIL_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ItemTags.MINING_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.CONSUME_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ItemTags.MINING_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );




        register(context, ModEnchantments.DESCEND_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ModItemTagsProvider.WEAPONSMITH_INTRINSIC_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.BANISH_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ModItemTagsProvider.WEAPONSMITH_INTRINSIC_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.HEART_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ModItemTagsProvider.WEAPONSMITH_INTRINSIC_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.SAPPING_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ModItemTagsProvider.WEAPONSMITH_INTRINSIC_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.QUICKDRAW_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ModItemTagsProvider.WEAPONSMITH_INTRINSIC_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.GRUDGE_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ModItemTagsProvider.WEAPONSMITH_INTRINSIC_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
        register(context, ModEnchantments.REFLEX_INTRINSIC,
                Enchantment.enchantment(
                        Enchantment.definition(
                                context.lookup(Registries.ITEM).getOrThrow(ModItemTagsProvider.WEAPONSMITH_INTRINSIC_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.dynamicCost(0, 0),
                                Enchantment.dynamicCost(0, 0),
                                0,
                                EquipmentSlotGroup.MAINHAND
                        )
                )
        );
    }

    private static FloatProvider f(float value) {
        return ConstantFloat.of(value);
    }

    private static EnchantmentEntityEffect applyMobEffect(Holder<MobEffect> mobEffectHolder, float minDuration, float maxDuration, float minAmplifier, float maxAmplifier) {
        return new ApplyMobEffect(
                HolderSet.direct(mobEffectHolder),
                LevelBasedValue.constant(minDuration),
                LevelBasedValue.constant(maxDuration),
                LevelBasedValue.constant(minAmplifier),
                LevelBasedValue.constant(maxAmplifier)
        );
    }

    private static LootItemCondition.Builder requireFullSet(BootstrapContext<Enchantment> context, ResourceKey<Enchantment> enchantmentResourceKey) {
        return LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS,
                EntityPredicate.Builder.entity().equipment(EntityEquipmentPredicate.Builder.equipment()
                        .head(ItemPredicate.Builder.item()
                                .withComponents(DataComponentMatchers.Builder.components()
                                        .partial(DataComponentPredicates.ENCHANTMENTS,
                                                EnchantmentsPredicate.enchantments(List.of(new EnchantmentPredicate(
                                                        context.lookup(Registries.ENCHANTMENT).getOrThrow(enchantmentResourceKey),
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
                                                        context.lookup(Registries.ENCHANTMENT).getOrThrow(enchantmentResourceKey),
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
                                                        context.lookup(Registries.ENCHANTMENT).getOrThrow(enchantmentResourceKey),
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
                                                        context.lookup(Registries.ENCHANTMENT).getOrThrow(enchantmentResourceKey),
                                                        new MinMaxBounds.Ints(
                                                                MinMaxBounds.Bounds.any(),
                                                                MinMaxBounds.Bounds.any()
                                                        )
                                                )))
                                        ).build()
                                )
                        )
                )
        );
    }


}

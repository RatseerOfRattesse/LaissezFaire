package net.ratseerofrattesse.enchantment;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.enchantment.Enchantment;
import net.ratseerofrattesse.LaissezFaire;

public class ModEnchantments {

    public static final ResourceKey<Enchantment> SPARK_INTRINSIC = key("spark_intrinsic");
    public static final ResourceKey<Enchantment> DISPERSE_INTRINSIC = key("disperse_intrinsic");
    public static final ResourceKey<Enchantment> RIPPLE_INTRINSIC = key("ripple_intrinsic");
    public static final ResourceKey<Enchantment> ACCRUE_INTRINSIC = key("accrue_intrinsic");
    public static final ResourceKey<Enchantment> PHANTOM_INTRINSIC = key("phantom_intrinsic");
    public static final ResourceKey<Enchantment> VENGEFUL_INTRINSIC = key("vengeful_intrinsic");
    public static final ResourceKey<Enchantment> VITALITY_INTRINSIC = key("vitality_intrinsic");

    public static final ResourceKey<Enchantment> EVAPORATE_INTRINSIC = key("evaporate_intrinsic");
    public static final ResourceKey<Enchantment> LICHEN_INTRINSIC = key("lichen_intrinsic");
    public static final ResourceKey<Enchantment> EXPOSE_INTRINSIC = key("expose_intrinsic");
    public static final ResourceKey<Enchantment> EXTRACT_INTRINSIC = key("extract_intrinsic");
    public static final ResourceKey<Enchantment> RESOLVE_INTRINSIC = key("resolve_intrinsic");
    public static final ResourceKey<Enchantment> EVIL_INTRINSIC = key("evil_intrinsic");
    public static final ResourceKey<Enchantment> CONSUME_INTRINSIC = key("consume_intrinsic");

    public static final ResourceKey<Enchantment> DESCEND_INTRINSIC = key("descend_intrinsic");
    public static final ResourceKey<Enchantment> BANISH_INTRINSIC = key("banish_intrinsic");
    public static final ResourceKey<Enchantment> HEART_INTRINSIC = key("heart_intrinsic");
    public static final ResourceKey<Enchantment> SAPPING_INTRINSIC = key("sapping_intrinsic");
    public static final ResourceKey<Enchantment> QUICKDRAW_INTRINSIC = key("quickdraw_intrinsic");
    public static final ResourceKey<Enchantment> GRUDGE_INTRINSIC = key("grudge_intrinsic");
    public static final ResourceKey<Enchantment> REFLEX_INTRINSIC = key("reflex_intrinsic");


    private static ResourceKey<Enchantment> key(String path) {
        Identifier id = Identifier.fromNamespaceAndPath(LaissezFaire.MOD_ID, path);
        return ResourceKey.create(Registries.ENCHANTMENT, id);
    }

}

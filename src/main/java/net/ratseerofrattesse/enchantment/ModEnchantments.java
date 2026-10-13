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


    private static ResourceKey<Enchantment> key(String path) {
        Identifier id = Identifier.fromNamespaceAndPath(LaissezFaire.MOD_ID, path);
        return ResourceKey.create(Registries.ENCHANTMENT, id);
    }

}

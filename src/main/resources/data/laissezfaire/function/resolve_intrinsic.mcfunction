advancement revoke @s only laissezfaire:resolve_intrinsic
scoreboard players add @s resolveintrinsic 1
execute if score @s resolveintrinsic matches 5 run attribute @s minecraft:mining_efficiency modifier remove resolveenchant
execute if score @s resolveintrinsic matches 5 run attribute @s minecraft:mining_efficiency modifier add resolveenchant 10 add_multiplied_base
execute if score @s resolveintrinsic matches 11 run attribute @s minecraft:mining_efficiency modifier remove resolveenchant
execute if score @s resolveintrinsic matches 11 run attribute @s minecraft:mining_efficiency modifier add resolveenchant 20 add_multiplied_base
execute if score @s resolveintrinsic matches 24 run attribute @s minecraft:mining_efficiency modifier remove resolveenchant
execute if score @s resolveintrinsic matches 24 run attribute @s minecraft:mining_efficiency modifier add resolveenchant 30 add_multiplied_base
execute if score @s resolveintrinsic matches 55 run attribute @s minecraft:mining_efficiency modifier remove resolveenchant
execute if score @s resolveintrinsic matches 55 run attribute @s minecraft:mining_efficiency modifier add resolveenchant 40 add_multiplied_base
execute if score @s resolveintrinsic matches 132 run attribute @s minecraft:mining_efficiency modifier remove resolveenchant
execute if score @s resolveintrinsic matches 132 run attribute @s minecraft:mining_efficiency modifier add resolveenchant 50 add_multiplied_base
execute if score @s resolveintrinsic >= LaissezResolveCap resolveintrinsic run attribute @s minecraft:mining_efficiency modifier remove resolveenchant
execute if score @s resolveintrinsic >= LaissezResolveCap resolveintrinsic run scoreboard players reset @s resolveintrinsic
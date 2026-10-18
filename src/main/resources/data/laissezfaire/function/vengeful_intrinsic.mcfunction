advancement revoke @s only laissezfaire:vengeful_intrinsic
tag @s add vengefulOwner
execute as @e if score @s laissezteam = @p[tag=vengefulOwner] laissezteam run tag @s add vengefulTeam
damage @s 1 minecraft:magic
playsound minecraft:entity.allay.hurt player @a[distance=..16] ~ ~ ~ 100
particle minecraft:raid_omen ~ ~1 ~ 0.1 0.1 0.1 3 5 normal
particle minecraft:crimson_spore ~ ~ ~ 0.1 0.1 0.1 3 5 normal
particle minecraft:crimson_spore ~ ~2 ~ 0.1 0.1 0.1 3 5 normal
execute as @e[distance=..4,tag=!vengefulTeam] run tag @s add vengefulTarget
execute as @e[tag=vengefulTarget,distance=..4] run damage @s 0.5 minecraft:magic
execute as @e[tag=vengefulTarget,distance=..4] run playsound minecraft:entity.allay.hurt player @a[distance=..16] ~ ~ ~ 100
execute at @e[tag=vengefulTarget,distance=..4] run particle minecraft:raid_omen ~ ~1 ~ 0.1 0.1 0.1 3 5 normal
execute at @e[tag=vengefulTarget,distance=..4] run particle minecraft:crimson_spore ~ ~ ~ 0.1 0.1 0.1 3 5 normal
execute at @e[tag=vengefulTarget,distance=..4] run particle minecraft:crimson_spore ~ ~2 ~ 0.1 0.1 0.1 3 5 normal
execute as @e[tag=vengefulTeam] run tag @a remove vengefulTeam
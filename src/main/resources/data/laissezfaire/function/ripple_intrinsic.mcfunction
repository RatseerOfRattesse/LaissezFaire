playsound minecraft:block.amethyst_block.resonate ambient @s ~ ~ ~ 100 0.5
playsound minecraft:entity.warden.heartbeat
particle minecraft:sonic_boom ~ ~1 ~ 0 0 0 0.25 1
damage @s 3 minecraft:sonic_boom by @p[tag=rippleowner] from @p[tag=rippleowner]
execute as @e[distance=..8,tag=!rippleowner] at @s run function laissezfaire:ripple_intrinsic_secondary
tag @a remove rippleowner
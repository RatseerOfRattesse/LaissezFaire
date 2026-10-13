summon marker ~ ~ ~ {Tags:["spark"]}
spreadplayers ~ ~ 1 4 false @e[type=marker,tag=spark,limit=1,sort=nearest]
execute as @n[type=marker,tag=spark] run playsound minecraft:item.trident.return player @a[distance=..16] ~ ~ ~ 100 0.7
execute at @n[type=marker,tag=spark] run particle minecraft:electric_spark ~ ~ ~ 0.1 0.1 0.1 3 5 normal
execute at @n[type=marker,tag=spark] run particle minecraft:trial_spawner_detection ~ ~ ~ 0.1 0.1 0.1 3 5 normal
execute as @e[distance=..16,tag=!sparkowner] at @s run teleport @s ~ ~ ~ facing entity @n[type=minecraft:marker]
kill @n[type=minecraft:marker,tag=spark]
execute as @e[tag=sparkowner] run tag @a remove sparkowner
advancement revoke @s only laissezfaire:extract_intrinsic
execute store result score @s extractintrinsic run random value 0..3
execute if score @s extractintrinsic matches 0 run summon minecraft:marker ~ ~ ~ {Tags:["extractIntrinsic"]}
execute if score @s extractintrinsic matches 0 run summon minecraft:marker ~ ~ ~ {Tags:["extractIntrinsic"]}
execute if score @s extractintrinsic matches 0 run summon minecraft:marker ~ ~ ~ {Tags:["extractIntrinsic"]}
execute if score @s extractintrinsic matches 0 run spreadplayers ~ ~ 0 1 false @e[distance=..8,tag=extractIntrinsic,type=marker]
execute if score @s extractintrinsic matches 0 run execute at @e[distance=..8,tag=extractIntrinsic,type=marker] run summon minecraft:experience_orb ~ ~ ~ {Value:1}
kill @e[distance=..8,tag=extractIntrinsic,type=marker]
scoreboard players reset @s extractintrinsic
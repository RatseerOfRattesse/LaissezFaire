advancement revoke @s only laissezfaire:expose_intrinsic
tag @s add exposeowner
execute as @e if score @s laissezteam = @p[tag=exposeowner] laissezteam run tag @s add exposeowner
effect give @e[distance=..32,tag=!exposeowner] glowing 5
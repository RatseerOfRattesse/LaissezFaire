advancement revoke @s only laissezfaire:lichen_intrinsic
fill ~ ~ ~ ~ ~ ~ light replace air
summon marker ~ ~ ~ {Tags:[lichenIntrinsic]}
execute at @n[type=marker,tag=lichenIntrinsic] run schedule function laissezfaire:lichen_intrinsic_clean 5s append
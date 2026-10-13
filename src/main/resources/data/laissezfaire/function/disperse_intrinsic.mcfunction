summon marker ~ ~ ~ {Tags:["disperse"]}
summon marker ~ ~ ~ {Tags:["disperse"]}
summon marker ~ ~ ~ {Tags:["disperse"]}
summon marker ~ ~ ~ {Tags:["disperse"]}
summon marker ~ ~ ~ {Tags:["disperse"]}
spreadplayers ~ ~ 1 3 false @e[type=marker,tag=disperse,limit=5,sort=nearest]
execute at @e[type=marker,tag=disperse] run particle minecraft:campfire_cosy_smoke ~ ~1 ~ 0 0 0 0.25 12 normal
kill @e[type=minecraft:marker,tag=disperse]
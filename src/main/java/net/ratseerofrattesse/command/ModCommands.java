package net.ratseerofrattesse.command;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;

public class ModCommands {
    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(Commands.literal("laissezteam")
                    .executes(ModCommands::listTeam)
                    .then(Commands.literal("create").executes(ModCommands::createTeam))
                    .then(Commands.literal("invite")
                            .then(Commands.argument("invitee", EntityArgument.player())
                            .executes(ModCommands::inviteMember)))
                    .then(Commands.literal("accept").executes(ModCommands::acceptInvite))
                    .then(Commands.literal("leave").executes(ModCommands::leaveTeam))
                    .then(Commands.literal("kick")
                            .then(Commands.argument("kicked", EntityArgument.player())
                            .executes(ModCommands::kickMember)))
                    .then(Commands.literal("transfer")
                            .then(Commands.argument("newOwner", EntityArgument.player())
                            .executes(ModCommands::transferOwnership)))
                    .then(Commands.literal("disband").executes(ModCommands::disbandTeam))
            );
        });
    }

    private static int listTeam(CommandContext<CommandSourceStack> context) {
        sendCommand(context, "tag @s add laissezteamquery");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute as @a[type=player] if score @s laissezteam = @p[tag=laissezteamquery] laissezteam run tag @s add laissezteamquerymember");

        sendCommand(context, "execute if score @s laissezteam matches 1.. run tellraw @s [{\"fallback\":\"Current Team: \",\"translate\":\"laissezfaire.laissezteam.current_team\"},{\"bold\":true,\"color\":\"aqua\",\"selector\":\"@a[tag=laissezteamquerymember]\"}]");
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run tellraw @s {\"color\":\"red\",\"fallback\":\"You are not in a team.\",\"translate\":\"laissezfaire.laissezteam.noteam\"}");

        sendCommand(context, "tag @s remove laissezteamquery");
        sendCommand(context, "tag @a remove laissezteamquerymember");
        return 1;
    }

    //checks if you have a laissezteam objective
    //adds you to laissezteam objective under laissezteam + 1 (identifier)
    //adds you to owner objective under identifier
    private static int createTeam(CommandContext<CommandSourceStack> context) {
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run execute as @a run scoreboard players operation @s laissezcompare = @s laissezteam");
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run execute as @a run scoreboard players set #laissezhighest laissezcompare -2147483648");
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run execute as @a run scoreboard players operation #laissezhighest laissezcompare > @s laissezcompare");
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run scoreboard players add #laissezhighest laissezcompare 1");
        
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run tellraw @s {\"color\":\"green\",\"fallback\":\"Team created.\",\"translate\":\"laissezfaire.laissezteam.createdteam\"}");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run tellraw @s {\"color\":\"red\",\"fallback\":\"You are already in a team.\",\"translate\":\"laissezfaire.laissezteam.hasteam\"}");

        sendCommand(context, "execute unless score @s laissezteam matches 1.. run scoreboard players operation @s laissezowner = #laissezhighest laissezcompare");
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run scoreboard players operation @s laissezteam = #laissezhighest laissezcompare");

        sendCommand(context, "execute unless score @s laissezteam matches 1.. run execute as @a run scoreboard players set #laissezhighest laissezcompare -2147483648");
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run scoreboard players operation @s laissezcompare = @s laissezteam");
        return 1;
    }

    //checks if you have a laissezteam objective
    //checks if your laissezteam matches your owner objective
    //sends a prompt to another player to send an accept command
    //add target to laissezinv objective with team identifier
    private static int inviteMember(CommandContext<CommandSourceStack> context) throws CommandSyntaxException {
        String username = EntityArgument.getPlayer(context, "invitee").getDisplayName().getString();
        assert context.getSource().getEntity() != null;
        if (username.equals(context.getSource().getEntity().getDisplayName().getString())) {
            return 0;
        }

        sendCommand(context, "tag @s add laissezinviter");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute as @a[type=player] if score @s laissezteam = @p[tag=laissezinviter] laissezteam run tag @s add laissezinvitermember");

        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run tellraw @p[name=" + username + "] [{selector:\"@p[tag=laissezinviter]\",color:aqua,bold:true},{translate:\"laissezfaire.laissezteam.invitedby\",fallback:\" has invited you to join their team. \",color:green},{click_event:{action:run_command,command:\"laissezteam accept\"},translate:\"laissezfaire.laissezteam.accept\",fallback:\"Click to accept.\",color:yellow,underlined:true}]");

        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute as @p[name=" + username + "] run scoreboard players operation @s laissezinv = @p[tag=laissezinviter] laissezteam");

        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute unless score @s laissezteam = @s laissezowner run tellraw @s {\"color\":\"red\",\"fallback\":\"You don't own this team.\",\"translate\":\"laissezfaire.laissezteam.noperms\"}");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run tellraw @s {\"color\":\"green\",\"fallback\":\"Invite sent.\",\"translate\":\"laissezfaire.laissezteam.invited\"}");
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run tellraw @s {\"color\":\"red\",\"fallback\":\"You are not in a team.\",\"translate\":\"laissezfaire.laissezteam.noteam\"}");

        sendCommand(context, "tag @s remove laissezinviter");
        sendCommand(context, "tag @a remove laissezinvitermember");
        return 1;
    }

    //checks if you have a laissezteam objective
    //if false, adds you to laissezteam objective under laissezinv objective, then clears it
    //if true, says to leave.
    //checks if you have laissezinv
    private static int acceptInvite(CommandContext<CommandSourceStack> context) {
        sendCommand(context, "tag @s add laissezinvitee");
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run execute unless score @s laissezinv matches 1.. run tellraw @s {\"color\":\"red\",\"fallback\":\"You have no invites.\",\"translate\":\"laissezfaire.laissezteam.noinv\"}");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run tellraw @s {\"color\":\"red\",\"fallback\":\"You are already in a team.\",\"translate\":\"laissezfaire.laissezteam.hasteam\"}");

        sendCommand(context, "execute unless score @s laissezteam matches 1.. run execute if score @s laissezinv matches 1.. run scoreboard players operation @s laissezteam = @s laissezinv");
        sendCommand(context, "execute as @a[type=player] if score @s laissezteam = @p[tag=laissezinvitee] laissezteam run tellraw @s [{\"selector\":\"@p[tag=laissezinvitee]\",color:aqua,bold:true},{\"color\":\"green\",\"fallback\":\" has joined the team.\",\"translate\":\"laissezfaire.laissezteam.joined\"}]");

        sendCommand(context, "scoreboard players reset @s laissezinv");
        sendCommand(context, "tag @s remove laissezinvitee");
        return 1;
    }

    //checks if you have a laissezteam objective
    //checks if your team matches your owner objective
    //if true, says to transfer ownership/disband
    //if false, leave
    private static int leaveTeam(CommandContext<CommandSourceStack> context) {
        sendCommand(context, "tag @s add laissezleaver");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run tellraw @s {\"color\":\"red\",\"fallback\":\"You own this team. Transfer ownership or disband instead.\",\"translate\":\"laissezfaire.laissezteam.ownerleave\"}");

        sendCommand(context, "execute as @a[type=player] if score @s laissezteam = @p[tag=laissezleaver] laissezteam run tag @s add laissezleavermember");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute unless score @s laissezteam = @s laissezowner run execute as @a[tag=laissezleavermember] run tellraw @s [{selector:\"@p[tag=laissezleaver]\",color:aqua,bold:true},{translate:\"laissezfaire.laissezteam.left\",fallback:\" has left the team.\",color:red}]");

        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute unless score @s laissezteam = @s laissezowner run scoreboard players reset @s laissezteam");

        sendCommand(context, "tag @s remove laissezleaver");
        sendCommand(context, "tag @a remove laissezleavermember");
        return 1;
    }

    //checks if you have a laissezteam objective
    //checks if your team matches your owner objective
    //if true, equalizes owner values for you and target, then removes your owner value
    //if false, sends no perms
    private static int transferOwnership(CommandContext<CommandSourceStack> context) throws CommandSyntaxException {
        String username = EntityArgument.getPlayer(context, "newOwner").getDisplayName().getString();
        assert context.getSource().getEntity() != null;
        if (username.equals(context.getSource().getEntity().getDisplayName().getString())) {
            return 0;
        }

        sendCommand(context, "tag @s add laissezowner");

        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute unless score @s laissezteam = @s laissezowner run tellraw @s {\"color\":\"red\",\"fallback\":\"You don't own this team.\",\"translate\":\"laissezfaire.laissezteam.noperms\"}");
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run tellraw @s {\"color\":\"red\",\"fallback\":\"You are not in a team.\",\"translate\":\"laissezfaire.laissezteam.noteam\"}");

        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute if score @p[name=" + username + "] laissezteam = @s laissezteam run execute as @p[name=" + username + "] run scoreboard players operation @s laissezowner = @s laissezteam");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute unless score @p[name=" + username + "] laissezteam = @s laissezteam run tellraw @s {\"color\":\"red\",\"fallback\":\"That player is not on your team.\",\"translate\":\"laissezfaire.laissezteam.differentteam\"}");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute if score @p[name=" + username + "] laissezteam = @s laissezteam run execute as @p[name=" + username + "] run tellraw @s {\"color\":\"green\",\"fallback\":\"Team ownership has been transferred to you.\",\"translate\":\"laissezfaire.laissezteam.transferredplayer\"}");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute if score @p[name=" + username + "] laissezteam = @s laissezteam run tellraw @s {\"color\":\"green\",\"fallback\":\"Ownership transferred.\",\"translate\":\"laissezfaire.laissezteam.transferred\"}");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute if score @p[name=" + username + "] laissezteam = @s laissezteam run scoreboard players reset @s laissezowner");

        sendCommand(context, "tag @s remove laissezowner");
        return 1;
    }

    //checks if you have a laissezteam objective
    //checks if your team matches your owner objective
    //if true, removes your owner value, removes team values from all members, decrements all values by one
    //if false, sends no perms
    private static int disbandTeam(CommandContext<CommandSourceStack> context) {
        sendCommand(context, "tag @s add laissezdisbander");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute as @a[type=player] if score @s laissezteam = @p[tag=laissezdisbander] laissezteam run tag @s add laissezteamdisband");

        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute as @a[tag=laissezteamdisband] run tellraw @s {\"color\":\"green\",\"fallback\":\"Team disbanded.\",\"translate\":\"laissezfaire.laissezteam.disbanded\"}");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute unless score @s laissezteam = @s laissezowner run tellraw @s {\"color\":\"red\",\"fallback\":\"You don't own this team.\",\"translate\":\"laissezfaire.laissezteam.noperms\"}");
        sendCommand(context, "execute unless score @s laissezteam matches 1.. run tellraw @s {\"color\":\"red\",\"fallback\":\"You are not in a team.\",\"translate\":\"laissezfaire.laissezteam.noteam\"}");

        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run scoreboard players operation @s laisseztemp = @s laissezteam");

        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute as @a[tag=laissezteamdisband] run scoreboard players reset @s laissezteam");
        sendCommand(context, "execute if score @s laisseztemp matches 1.. run execute if score @s laisseztemp = @s laissezowner run scoreboard players reset @s laissezowner");

        sendCommand(context, "scoreboard players reset @s laisseztemp");
        sendCommand(context, "tag @s remove laissezdisbander");
        sendCommand(context, "tag @a remove laissezteamdisband");
        return 1;
    }

    //checks if you have a laissezteam objective
    //checks if your team matches your owner objective
    //if true, removes specified player's team value
    //if false, sends no perms
    private static int kickMember(CommandContext<CommandSourceStack> context) throws CommandSyntaxException {
        String username = EntityArgument.getPlayer(context, "kicked").getDisplayName().getString();
        assert context.getSource().getEntity() != null;
        if (username.equals(context.getSource().getEntity().getDisplayName().getString())) {
            return 0;
        }

        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute unless score @s laissezteam = @s laissezowner run tellraw @s {\"color\":\"red\",\"fallback\":\"You don't own this team.\",\"translate\":\"laissezfaire.laissezteam.noperms\"}");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute if score @p[name=" + username + "] laissezteam = @s laissezteam run tellraw @s {\"color\":\"green\",\"fallback\":\"Player kicked.\",\"translate\":\"laissezfaire.laissezteam.kicked\"}");


        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute unless score @p[name=" + username + "] laissezteam = @s laissezteam run tellraw @s {\"color\":\"red\",\"fallback\":\"That player is not on your team.\",\"translate\":\"laissezfaire.laissezteam.differentteam\"}");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute if score @p[name=" + username + "] laissezteam = @s laissezteam run execute as @p[name=" + username + "] run tellraw @s {\"color\":\"red\",\"fallback\":\"You have been kicked.\",\"translate\":\"laissezfaire.laissezteam.kickedplayer\"}");
        sendCommand(context, "execute if score @s laissezteam matches 1.. run execute if score @s laissezteam = @s laissezowner run execute if score @p[name=" + username + "] laissezteam = @s laissezteam run scoreboard players reset @p[name=" + username + "] laissezteam");

        sendCommand(context, "execute unless score @s laissezteam matches 1.. run tellraw @s {\"color\":\"red\",\"fallback\":\"You are not in a team.\",\"translate\":\"laissezfaire.laissezteam.noteam\"}");
        return 1;
    }

    public static void sendCommand(CommandContext<CommandSourceStack> context, String command) {
        context.getSource().getServer().getCommands().performPrefixedCommand(context.getSource(), command);
    }
}

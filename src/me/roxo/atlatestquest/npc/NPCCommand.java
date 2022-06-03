package me.roxo.atlatestquest.npc;

import me.roxo.atlatestquest.ATLATestQuest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NPCCommand implements CommandExecutor {
    private final ATLATestQuest plugin;

    public NPCCommand(ATLATestQuest plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {

            Player player = (Player) sender;

                if (!sender.isOp()) return false;
               // if(args.length == 0){NPC.createNPC(player, player.getName());return true;}
               // NPC.createNPC(player,args[0]);
                System.out.println(args[0]);
                //2. save the location

                player.sendMessage("NPC Created set!");
            return true;


            }
            return true;
        }

    }
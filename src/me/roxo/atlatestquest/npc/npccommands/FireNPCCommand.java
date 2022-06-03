package me.roxo.atlatestquest.npc.npccommands;


import me.roxo.atlatestquest.ATLATestQuest;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FireNPCCommand implements  CommandExecutor {

    private final ATLATestQuest plugin;

    public FireNPCCommand(ATLATestQuest plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){

            Player player = (Player) sender;

            Location location = player.getLocation();
            if(!sender.isOp())return true;
            //2. save the location
            plugin.getConfig().set("firenpclocation", location);
            plugin.saveConfig();
            player.sendMessage("Fire NPC Location set!");


        }
        return true;
    }




    //This will spawn you on the island when the timer of the lobby goes off and the max player have been reached. And it will make 4 team teleports.
}
package me.roxo.atlatestquest.commands;

import me.roxo.atlatestquest.ATLATestQuest;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class setlocation implements CommandExecutor {

    private final ATLATestQuest atlaTestQuest;


    public setlocation(ATLATestQuest atlaTestQuest) {
        this.atlaTestQuest = atlaTestQuest;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if(!(commandSender instanceof Player)){
            return false;
        }
        Location loc = ((Player) commandSender).getLocation();
        atlaTestQuest.getConfig().set("npcloc", loc);

        return false;
    }
}

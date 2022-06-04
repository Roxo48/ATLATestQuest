package me.roxo.atlatestquest.commands;

import me.roxo.atlatestquest.emun.Stages;
import me.roxo.atlatestquest.questmanager.QuestManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class StartQuestCommand implements CommandExecutor {

    private final QuestManager questManager;

    public StartQuestCommand(QuestManager questManager) {
        this.questManager = questManager;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if(!(commandSender instanceof Player)){
            return false;
        }
        questManager.setState(Stages.FIRST);


        return false;
    }
}

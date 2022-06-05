package me.roxo.atlatestquest;

import me.roxo.atlatestquest.commands.StartQuestCommand;
import me.roxo.atlatestquest.commands.setlocation;
import me.roxo.atlatestquest.listener.ShiftEvent;
import me.roxo.atlatestquest.npc.NPCCommand;
import me.roxo.atlatestquest.npc.npcevents.ClickNPC;
import me.roxo.atlatestquest.npc.npcevents.JoinNPC;
import me.roxo.atlatestquest.npc.npcevents.MovementListener;
import me.roxo.atlatestquest.questmanager.QuestManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ATLATestQuest extends JavaPlugin {



    public QuestManager getQuestManager() {
        return questManager;
    }

    private QuestManager questManager;



    @Override
    public void onEnable(){
        this.questManager = new QuestManager(this);
        getCommand("startquest").setExecutor(new StartQuestCommand(getQuestManager()));

        getCommand("createNPCATLA").setExecutor(new NPCCommand(this));
        getCommand("setLocation").setExecutor(new setlocation(this));
        getServer().getPluginManager().registerEvents(new MovementListener(),this);
        getServer().getPluginManager().registerEvents(new JoinNPC(this),this);
        getServer().getPluginManager().registerEvents(new ClickNPC(this),this);
        getServer().getPluginManager().registerEvents(new ShiftEvent(getQuestManager()),this);

    }


    @Override
    public void onDisable(){


    }





}

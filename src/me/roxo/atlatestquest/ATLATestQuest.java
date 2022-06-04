package me.roxo.atlatestquest;

import me.roxo.atlatestquest.npc.NPCCommand;
import me.roxo.atlatestquest.npc.npcevents.ClickNPC;
import me.roxo.atlatestquest.npc.npcevents.JoinNPC;
import me.roxo.atlatestquest.npc.npcevents.MovementListener;
import me.roxo.atlatestquest.questmanager.QuestManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ATLATestQuest extends JavaPlugin {

    private ATLATestQuest atlaTestQuest;

    public QuestManager getQuestManager() {
        return questManager;
    }

    private QuestManager questManager;

    public ATLATestQuest() {

    }

    @Override
    public void onEnable(){
        this.atlaTestQuest = new ATLATestQuest();
        this.questManager = new QuestManager(this);
        getCommand("createNPC").setExecutor(new NPCCommand(this));
        getServer().getPluginManager().registerEvents(new MovementListener(),this);
        getServer().getPluginManager().registerEvents(new JoinNPC(this),this);
        getServer().getPluginManager().registerEvents(new ClickNPC(this),this);

    }


    @Override
    public void onDisable(){


    }

    public ATLATestQuest getAtlaTestQuest(){
        return atlaTestQuest;
    }



}

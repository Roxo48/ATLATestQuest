package me.roxo.atlatestquest;

import org.bukkit.plugin.java.JavaPlugin;

public class ATLATestQuest extends JavaPlugin {

    private ATLATestQuest atlaTestQuest;

    public ATLATestQuest() {

    }

    @Override
    public void onEnable(){
        this.atlaTestQuest = new ATLATestQuest();

    }


    @Override
    public void onDisable(){


    }

    public ATLATestQuest getAtlaTestQuest(){
        return atlaTestQuest;
    }



}

package me.roxo.atlatestquest.questmanager;


import me.roxo.atlatestquest.ATLATestQuest;
import me.roxo.atlatestquest.emun.Stages;

public class QuestManager {

    private Stages stages;
    private ATLATestQuest plugin;

    public QuestManager(ATLATestQuest atlaTestQuest) {
        this.plugin = atlaTestQuest;

    }

    public void setState(Stages state){

        switch (state){

            case FIRST:



                break;
            case SECOND:



                break;
            case THIRD:



                break;
            case FOURTH:


                break;
            case FIFTH:



                break;
            case END:



                break;



        }

    }


    public ATLATestQuest getPlugin() {
        return plugin;
    }
}

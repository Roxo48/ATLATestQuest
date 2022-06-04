package me.roxo.atlatestquest.questmanager;


import me.roxo.atlatestquest.ATLATestQuest;
import me.roxo.atlatestquest.emun.Stages;
import me.roxo.atlatestquest.text.Text;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;

public class QuestManager {

    public boolean isSneakingTrue() {
        return sneakingTrue;
    }

    private boolean sneakingTrue;
    private Player player;
    private Stages stages;
    private ATLATestQuest plugin;

    public QuestManager(ATLATestQuest atlaTestQuest) {
        this.plugin = atlaTestQuest;

    }

    public void setState(Stages state){

        switch (state){

            case FIRST:
            //right click to start

            this.setState(Stages.TEXT);
                break;
            case TEXT:
            //start text
                //when finished text
                player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0);
                Text text = new Text(this);
                text.startText();
                this.setState(Stages.THIRD);

                break;
            case THIRD:
                //make a player normal
                player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(1);
                player.sendMessage(ChatColor.DARK_BLUE + "GO FIND THE ITEM");

                //put a



                break;
            case FOURTH:


                break;
            case FIFTH:



                break;
            case END:



                break;



        }

    }

    public Stages getStages() {
        return stages;
    }
    public void setPlayer(Player player){
        this.player = player;
    }


    public ATLATestQuest getPlugin() {
        return plugin;
    }

    public Player getPlayer() {
        return player;
    }

    public void setSneakingTrue(boolean b) {
        sneakingTrue = b;
    }
}

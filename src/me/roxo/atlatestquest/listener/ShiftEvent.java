package me.roxo.atlatestquest.listener;


import me.roxo.atlatestquest.emun.Stages;
import me.roxo.atlatestquest.questmanager.QuestManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class ShiftEvent implements Listener {
    private final QuestManager questManager;

    private boolean aBoolean;

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count = 1;
    }

    private int count ;

    public ShiftEvent(QuestManager questManager) {
        this.questManager = questManager;
        this.count = 1;
    }


    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e){
        boolean a = false;
        if(!(e instanceof Player)){
            return;
        }
        Player player = e.getPlayer();
        if(questManager.getStage() != Stages.TEXT){
            return;
        }
       // System.out.println("x8");

        if(e.isSneaking()){
            count++;
            a = true;
        }
       System.out.println("x6");

        if (count == 1 && a) {
            player.sendMessage(ChatColor.AQUA + "Hi " + ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.AQUA + "\n ... I have been waiting for you, I need your help. \n" +
                    "[" + ChatColor.GREEN + count + "/" + 3 + "]"
            );
            a = false;
        }else if (count == 2 && a) {
            player.sendMessage(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.AQUA + "\n ... I need you to retrieve an item, that is really special to me... \n" +
                    "[" + ChatColor.GREEN + count + "/" + 3 + "]"
            );
            a = false;
        }else if (count == 3 && a) {
            player.sendMessage(ChatColor.AQUA + "It is in " + ChatColor.GREEN + "the cave (to the right of me) bring it back to me!!. \n" +
                    "[" + ChatColor.GREEN + count + "/" + 3 + "]"
            );
            a = false;
            questManager.setSneakingTrue(true);
        }





    }
}

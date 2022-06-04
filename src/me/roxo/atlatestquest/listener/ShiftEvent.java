package me.roxo.atlatestquest.listener;


import me.roxo.atlatestquest.questmanager.QuestManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class ShiftEvent implements Listener {
    private final QuestManager questManager;

    public ShiftEvent(QuestManager questManager) {
        this.questManager = questManager;
    }


    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e){
        if(!(e.getPlayer() instanceof Player)){
            return;
        }
        Player player = e.getPlayer();
        if(player.isSneaking()){
            questManager.setSneakingTrue(true);
        }





    }
}

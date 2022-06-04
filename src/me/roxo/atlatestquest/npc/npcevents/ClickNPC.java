package me.roxo.atlatestquest.npc.npcevents;


import me.roxo.atlatestquest.ATLATestQuest;
import me.roxo.atlatestquest.emun.Stages;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ClickNPC implements Listener {


        private final ATLATestQuest plugin;
        public ClickNPC(ATLATestQuest plugin){
            this.plugin = plugin;



        }

    @EventHandler
    public void onClick(RightClickNPC e) {
        Player player = e.getPlayer();
        player.sendMessage("didi it work?????");
        if (e.getNpc().getName().equalsIgnoreCase("Anng")) {
            plugin.getQuestManager().setPlayer(player);
            plugin.getQuestManager().setState(Stages.FIRST);
        }
    }
}

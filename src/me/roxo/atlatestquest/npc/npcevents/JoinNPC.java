package me.roxo.atlatestquest.npc.npcevents;


import me.roxo.atlatestquest.ATLATestQuest;
import me.roxo.atlatestquest.npc.NPC;
import me.roxo.atlatestquest.npc.PacketReader;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinNPC implements Listener {
    private final ATLATestQuest plugin;

    public JoinNPC(ATLATestQuest plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        PacketReader reader = new PacketReader(event.getPlayer());
        reader.inject();
        if (NPC.getNPC() == null) {
            return;
        }
        if (NPC.getNPC().isEmpty()) {
            return;
        }
        System.out.println("k");
        NPC.addJoinPacket(event.getPlayer());


    }
    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        PacketReader reader = new PacketReader(e.getPlayer());
       reader.unInject();
    }
}

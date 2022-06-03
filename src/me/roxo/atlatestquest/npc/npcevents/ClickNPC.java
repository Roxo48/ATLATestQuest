package me.roxo.atlatestquest.npc.npcevents;

import me.roxo.spiritwars.SpiritWars;
import me.roxo.spiritwars.guis.VillagerGui;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ClickNPC implements Listener {

        private VillagerGui villagerGui;
        private final SpiritWars plugin;
        public ClickNPC(SpiritWars plugin){
            this.plugin = plugin;
            this.villagerGui = new VillagerGui(plugin);


        }

    @EventHandler
    public void onClick(RightClickNPC e) {
        Player player = e.getPlayer();
        player.sendMessage("didi it work?????");
        player.openInventory(villagerGui.inv);
        if (e.getNpc().getName().equalsIgnoreCase("Anng")) {
            //gui
            //player.sendMessage("didi it work?????");

        }
        if (e.getNpc().getName().equalsIgnoreCase("Anng")) {
            //gui


        }
        if (e.getNpc().getName().equalsIgnoreCase("Anng")) {

            //gui


        }
        if (e.getNpc().getName().equalsIgnoreCase("Anng")) {
            //gui


        }
/*
for(Player on : Bukkit.getOnlinePlayers()){
    PlayerConnection p = ((CraftPlayer) on).getHandle().b;
    p.sendPacket(new PacketPlayOutEntityDestroy(e.getNpc().getId()));
}
        NPC.getNPC().remove(e.getNpc().getId());
    }

 */
    }
}

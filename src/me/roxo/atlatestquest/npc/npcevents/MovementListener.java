package me.roxo.atlatestquest.npc.npcevents;


import me.roxo.atlatestquest.npc.NPC;
import net.minecraft.network.protocol.game.PacketPlayOutEntity;
import net.minecraft.network.protocol.game.PacketPlayOutEntityHeadRotation;
import net.minecraft.server.level.EntityPlayer;
import net.minecraft.server.network.PlayerConnection;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_17_R1.entity.CraftPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MovementListener implements Listener {


    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e){


        for(EntityPlayer npc : NPC.getNPC()){
            Location location = npc.getBukkitEntity().getLocation();
            location.setDirection(e.getPlayer().getLocation().subtract(location).toVector());
            float yaw = location.getYaw();
            float pitch = location.getPitch();

            PlayerConnection connection = ((CraftPlayer)e.getPlayer()).getHandle().b;

            connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) ((yaw%360)*256/360)));
            connection.sendPacket(new PacketPlayOutEntity.PacketPlayOutEntityLook(npc.getBukkitEntity().getEntityId(), (byte) ((yaw%360)*256/360), (byte) ((pitch%360)*256/360) , false));




        }

    }



}

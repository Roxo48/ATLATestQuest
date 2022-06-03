package me.roxo.atlatestquest.npc;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import me.roxo.atlatestquest.ATLATestQuest;
import me.roxo.atlatestquest.npc.npcevents.RightClickNPC;
import net.minecraft.network.protocol.game.PacketPlayInUseEntity;
import net.minecraft.server.level.EntityPlayer;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_17_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PacketReader {

    Channel channel;
    public static Map<Integer, EntityPlayer> channels = new HashMap<Integer, EntityPlayer>();
    private final Player player;
    private int count = 0;

    public PacketReader(Player player) {
        this.player = player;
    }


    public void inject() {
        System.out.println("l");
        CraftPlayer craftPlayer = (CraftPlayer) player;
        Channel channel = craftPlayer.getHandle().b.a.k;

        if (channel.pipeline().get("PacketInjector") != null) {
            return;
        }
            channel.pipeline().addAfter("decoder", "PacketInjector", new MessageToMessageDecoder<PacketPlayInUseEntity>() {


                @Override
                protected void decode(ChannelHandlerContext channelHandlerContext, PacketPlayInUseEntity packet, List<Object> arg) throws Exception {
                 arg.add(packet);
                 readPacket(packet);
                }


            });
    }

    public void unInject(){

        if(channel.pipeline().get("PacketInjector") != null){
            channel.pipeline().remove("PacketInjector");
        }
    }


    public void readPacket(PacketPlayInUseEntity packet){
        System.out.println("e");

        count++;
        int entityID = (int) getValue(packet, "a");
        if(count == 4) {
            count = 0;
            for (EntityPlayer npc : NPC.getNPC()) {
                if (npc.getId() == entityID) {
                    System.out.println("gdfszhiuop");
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            Bukkit.getPluginManager().callEvent(new RightClickNPC(player, npc));
                        }
                    }.runTask(ATLATestQuest.getPlugin(ATLATestQuest.class));
                }
            }
        }





    }

    private Object getValue(Object instance, String name){
        System.out.println("f");
        Object result = null;
        try{
            Field field = instance.getClass().getDeclaredField(name);
            field.setAccessible(true);
            result = field.get(instance);
            field.setAccessible(false);
        }catch (Exception e){
            e.printStackTrace();
        }


        return result;
    }
}

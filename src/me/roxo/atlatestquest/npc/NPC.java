package me.roxo.atlatestquest.npc;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import me.roxo.atlatestquest.ATLATestQuest;
import net.minecraft.network.PacketDataSerializer;
import net.minecraft.network.protocol.game.PacketPlayOutEntity;
import net.minecraft.network.protocol.game.PacketPlayOutEntityHeadRotation;
import net.minecraft.network.protocol.game.PacketPlayOutNamedEntitySpawn;
import net.minecraft.network.protocol.game.PacketPlayOutPlayerInfo;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.EntityPlayer;
import net.minecraft.server.level.WorldServer;
import net.minecraft.server.network.PlayerConnection;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_17_R1.CraftServer;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_17_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NPC {

    private static List<EntityPlayer> NPC = new ArrayList<EntityPlayer>();

    public static void createNPC( String skin,String signature, String locOfNpc, ATLATestQuest plugin){
       // EntityPlayer npc2 = ((CraftPlayer) player).getHandle();
        Location location = plugin.getConfig().getLocation(locOfNpc);
        MinecraftServer server = ((CraftServer) Bukkit.getServer()).getServer();
        WorldServer worldServer = ((CraftWorld)Bukkit.getWorld("world")).getHandle();
        GameProfile gameProfile = new GameProfile(UUID.randomUUID(), " " );
        //Property textures = (Property) npc2.getProfile().getProperties().get("textures").toArray()[0];
        //String[] a = getSkin(player, skin);


        System.out.println("a");
        gameProfile.getProperties().put("textures",new Property("textures",skin, signature));

        EntityPlayer npc = new EntityPlayer(server,worldServer,gameProfile);

        npc.setLocation(location.getX(),location.getY(),location.getZ(), location.getYaw(),location.getPitch());
        addNPCPacket(npc);

        NPC.add(npc);


    }
    private static String[] getSkin(Player player, String name) {

        try {
            HttpsURLConnection connection = (HttpsURLConnection) new URL(String.format("https://api.ashcon.app/mojang/v2/user/%s", name)).openConnection();

                ArrayList<String> lines = new ArrayList<>();
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                reader.lines().forEach(lines::add);

                String reply = String.join(" ", lines);
                int indexOfValue = reply.indexOf("\"value\": \"");
                int indexOfSignature = reply.indexOf("\"signature\": \"");
                String skin = reply.substring(indexOfValue + 10, reply.indexOf("\"", indexOfValue + 10));
                String signature = reply.substring(indexOfSignature + 14, reply.indexOf("\"", indexOfSignature + 14));
                return new String[]{skin, signature};




        } catch (Exception e) {
            EntityPlayer p = ((CraftPlayer) player).getHandle();
            GameProfile profile = p.getProfile();
            Property property = profile.getProperties().get("textures").iterator().next();
            String texture = property.getValue();
            String signature = property.getSignature();
            return new String[]{texture, signature};

        }


    }

    public  static void addNPCPacket(EntityPlayer npc){
        System.out.println("c");

        for(Player player : Bukkit.getOnlinePlayers()){

            PlayerConnection connection = ((CraftPlayer)player).getHandle().b;
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.a, npc));
            connection.sendPacket((new PacketPlayOutNamedEntitySpawn(npc)));
            connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.getBukkitYaw() * 256/360)));
            //connection.sendPacket(new PacketPlayOutEntity.PacketPlayOutRelEntityMoveLook(1,(short) 1, (short) 1, (short) 1,(byte) (npc.getHeadY() * 256/360),(byte) (npc.getHeadY() * 256/360),true));



        }
    }

    public  static void addJoinPacket(Player player){
        System.out.println("d");

        for(EntityPlayer npc : NPC){

            PlayerConnection connection = ((CraftPlayer)player).getHandle().b;
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.a, npc));
            connection.sendPacket((new PacketPlayOutNamedEntitySpawn(npc)));
            connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.getHeadY() * 256/360)));

            //connection.sendPacket(new PacketPlayOutEntityMetadata(npc.getId(), npc.getDataWatcher(), true));


        }
    }
    public  static List<EntityPlayer> getNPC(){return NPC;}
}





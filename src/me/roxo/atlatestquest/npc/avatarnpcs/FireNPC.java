package me.roxo.atlatestquest.npc.avatarnpcs;

import me.roxo.atlatestquest.ATLATestQuest;
import me.roxo.atlatestquest.npc.NPC;


public class FireNPC {
    private final ATLATestQuest plugin;

    public FireNPC(ATLATestQuest plugin) {
        this.plugin = plugin;
    }


    public void createEarthNPC(){
        String skin,signature,locOfNpc;
        skin = "ewogICJ0aW1lc3RhbXAiIDogMTU5NjE4NzQ1Njg1NSwKICAicHJvZmlsZUlkIiA6ICJjNTBhZmE4YWJlYjk0ZTQ1OTRiZjFiNDI1YTk4MGYwMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3Rab2duaSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hNWQxZGI2MzdiZjc1MGQ1YTYyZTRkYmNlZjUyZmY2ZjdhODNmNzA0ZDMxMzg0N2M2NGUwZmUyYTQ1YzIzYWMwIgogICAgfQogIH0KfQ==";
        signature = "akOKKRMp9X96WTTBYHzwCn3N+8XNwmmtS+VGXAbsbGmgbNPj99oWNwQXCVPrzWeXvl6aBNBGPCmL3HoFhDNoVmjgMOYIyqHmTObwTxwWu4+NHcLguLVnjpLND0EQA6kj8mgvfY/RgkrOdiDeMg3qEtgaecrizYpkewEufXNC+bEZaCMy/7j5soOEaCIK8SWsM/mowhyKtmDDuq+yP5uhNKSqi9myZqvdfXLxQO71u6C9ZKdMrcJJBUjV5q0Xh8wqSnbSq43P8vRnTJkKizgxKKLCerOJV6+plar3xal5spurh/nAFuzh31YKkKqzg99qOUzS7aKhuGXM558dwsSVkgibZqn5xi3FG1gVGH2t5yuA+ouF/D4FmDJuhzZVh59n4OUguibNZKskIuMY/wVEyqFJJCkmdPF4wKMRZ2bdK9sfT08WJDbAe8KivgxRjnwN/jldzkJjV8+pKWkJKgpzBQyK7q5qtwY9hgb9Dif3avrmrkBxXBkk24dUtF0NM5SXvMT8SsaTA6sVOfcQpFN/5TBSfD67J8K95/cf6OQVKmlcNQP+/zkgjuj4tvddcqfnKaADtDtJlhB0ifXZ7gQXYgOxCco8kMv2sYyROBAlzrN6j3NoHnoFH6QGZwlHm9EZqTD8bFQHuH/96m6pTYXvctkx8/Kjg4YOVdmNZmdkoqA=";
        locOfNpc = "firenpclocation";
        String name = "zoko";
        NPC.createNPC( skin, signature, locOfNpc, plugin);


    }



}

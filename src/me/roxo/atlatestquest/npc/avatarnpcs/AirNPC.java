package me.roxo.atlatestquest.npc.avatarnpcs;

import me.roxo.atlatestquest.ATLATestQuest;
import me.roxo.atlatestquest.npc.NPC;


public class AirNPC {
    private final ATLATestQuest plugin;

    public AirNPC(ATLATestQuest plugin) {
        this.plugin = plugin;
    }


    public void createWaterNPC(){
        String skin,signature,locOfNpc;
        skin = "ewogICJ0aW1lc3RhbXAiIDogMTYxMDYzMjgwNDEwNSwKICAicHJvZmlsZUlkIiA6ICJlZDUzZGQ4MTRmOWQ0YTNjYjRlYjY1MWRjYmE3N2U2NiIsCiAgInByb2ZpbGVOYW1lIiA6ICI0MTQxNDE0MWgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQ1YzI1NGRhMTQ4OTIxMDAxZGFkMGViYmQ4NDE4MDJlZDJlNmM2ZjlmYjA4ZGY5OWU4ZGEzZTRiMmE3NGU1NCIKICAgIH0KICB9Cn0=";
        signature = "h/d5Ih+PR+1BaOJO4zgjdvxDjkjf2hpFgU7FOTXvv768e9hDUEK/ipBMU8CmVSDjTVYt7O0sUxyasKKIiVL+zrR3nC8nY4HUfG2OcvW/ZVdqXzaR76vgWHgnDPVQsxKs1RBR+Z44rg85PTuXCd+dGEO0XZJpXSpWc4wlH5uALcTrReBOgpF57H2UxakBcY8RQplkBkmRZ3rKJvfj0b29xh5MobYWT/1r3eSM4fJ2eJHiMzbL27+5yOvhAIf2YPU4ostczRaiscTSviSkEWM4y8itE00MKLUMNlxkELBQwhRlEJgNUrJNCsvUYql7YdfEmQ2yd4aUwKwe9zT0XKgMogtHU2QxYvrJYjsX7k5Cl7ds70459uYVFuIREjP9/KYb5z54vcu3KwsAWHTKx0nYKcZ3xNa85lFHErUS14zhG7vjtwXoLaCTOzeKgIcmWbfOWw+7Ftc3cMk3EwBRNyJ8SHE3G6D6mdR9bSj/oFBhsTA4HvyQ0GGy6A6WRrNEMMbwcrnP68ZJrNvj05revfE2HFHG9CE9RimaTCrB+C8/+hC9SZnWodzBQrhuHx6hKJCsIXuLvrWA71XekDwh4QNSnNoq/cIk/sG7ikr83Cv0wlRUVA2PZn2whPe2Gy+o4hauOKOLRWId626ADtWmrrJQrR4awtyrqri9v0A4VJYlKSU=";
        locOfNpc = "npcloc";
        String name = "Anng";

        NPC.createNPC(  skin, signature,  locOfNpc, plugin);


    }



}


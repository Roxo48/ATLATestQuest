package me.roxo.atlatestquest.npc.avatarnpcs;

import me.roxo.atlatestquest.ATLATestQuest;
import me.roxo.atlatestquest.npc.NPC;

public class WaterNPC {

    private final ATLATestQuest plugin;

    public WaterNPC(ATLATestQuest plugin) {
        this.plugin = plugin;
    }


    public void createWaterNPC(){
        String skin,signature,locOfNpc;
        skin = "ewogICJ0aW1lc3RhbXAiIDogMTU5MzI3NzkxNjcyNSwKICAicHJvZmlsZUlkIiA6ICJmMjc0YzRkNjI1MDQ0ZTQxOGVmYmYwNmM3NWIyMDIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJIeXBpZ3NlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iOTgwNjAzMDJkODM0Yjk3YmRkNDhiYzQzMWEyZTYzOTRkMjkyMzNlNTU3OTc0ZDBmYTg1YWM5NGRmMzM0ODgiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
        signature = "wik53xQEmA1EQYxIAab/a2ra/A0cFxqye56eEiU5LxHPzBGMK922687w2SmGKvhTmASkTDRC+dOPyDR3YM1PnkXF89goh5//9/lsBbAunl2/kyp2EYfIB/61yuC4G8uHfKdVlybSgjzyJfI9D7e7hq0bXPXFSBq30Tmb182nKz8atgr/aFZytNJS7mbjBtQFbsCSk+an3hWGLDbgeq1YeePyc+OPWqpZTH0/4GaEeSADhac5iKw+LcfjbFSWnWYuPfOVHfiMtuks4b0lat/BLY+hnoZ/V2XhLeshsNhLBZYVmiwU0WNDO7ebfAWyZF2EsPnODqKtjy6DngoX2NAitbtvZv46rS2zmBLRffKE1zcqRD+2RZ4FkoGDUmBe5JyjKGyCdth6j84HeYfC/YzUGQdBhxT8HZmRkFhiz21HaSlpBQvlXE94Y88K05aYHzLztNarrpH3T/jBKgLhTRH4QQ7rvHPhqWhe551zRSUpnIwGG+6jVvzr+uOiKYjwG9HoI0iQel2MF23vIJb+WT0qGp9maArJeR2lfuu3VwtzI7HXkLwuUZBG7ar2uXMQlA1Rucy8mZmUbxde5IQpnIl/E3fIkn+42CySyrrHgaN4ATBg9CMdc5OEUvGlbxx7hALJUgRKiUcmVnSw1AAxD/9+xQGfKGj+6bh0hqAwzcbveT8=";
        locOfNpc = "waternpclocation";
        String name = "waterperson";
        NPC.createNPC(  skin, signature,  locOfNpc, plugin);


    }



}


package me.roxo.atlatestquest.npc.avatarnpcs;

import me.roxo.atlatestquest.ATLATestQuest;
import me.roxo.atlatestquest.npc.NPC;


public class EarthNPC {
    private final ATLATestQuest plugin;

    public EarthNPC(ATLATestQuest plugin) {
        this.plugin = plugin;
    }

    public void createEarthNPC(){
        String skin,signature,locOfNpc;
        skin = "ewogICJ0aW1lc3RhbXAiIDogMTYxMzUxNzA1MjcwOSwKICAicHJvZmlsZUlkIiA6ICIyM2YxYTU5ZjQ2OWI0M2RkYmRiNTM3YmZlYzEwNDcxZiIsCiAgInByb2ZpbGVOYW1lIiA6ICIyODA3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NjY2JmMDU0OGU4OWM4ODZjMmI4YTcxMmFjMGU4OTUyMDhjMTU2NjBjNzMxYmUyNWVlNmZlYThiYjNlMWM1YTMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
        signature = "lRBhM0GoWjUDmOWvY8S6yiRaf66axFjOn8V0KX/IC0w6MG9T0RB1rikyFLj2CEBNPb3mTb5+DsE0cDJrfDJR+ef+VztcwKd6p77uoGNT+JG7OKTCIoGRV34V5gGFCrHJzdLQ65KbfFXiQI/OaqjGaw58PAsxTITkA+VtHGbpxR68dGcIbTS/9ZxzA3imBafaPwCeuJw7Xzpl9gFSubQO3v4IK9O0vzW1gdyB2hnudGZidzPZFho9UueehPehtDJOKdKljmVikY4f4KB25B3ZW7blSXoIVrMJioWhCC4vcvsUYX77ki/U3zjUXbpozYGv6a/EY27z8prFpdVAcGQ/NTySbMgNMm6dIQANoFgwDw009PmXbJh4GnJIsx4gNMHTvdfDGFVjkEo9K0dCWpGkX/RwTSPYbpgvpy4q0wJ0LDi5IS0gKzSWD4z9gVjYW5EYOrl/zQAfdZr6W0SWek6n4Zo9URqlaHb2Bp4JaqsYpH9rqb3XEXtcwC05nLtt2du+engcqCSWmTz3n7xn3Og2R4MDNdyzJyAQ3BDb+DEfLuwU5/ChqwC2OoeR7/2lA5H7yEl5WIckvwJxOo0CAlD/BNcooHpSok3Qu0vxKtnqBUAY5ZXGjeWYVAliEWWu6Om+vC/duTDVrfOWMzQBkDOgbe3CA1ZRWlVrM259G1YbIDc=";
        locOfNpc = "earthnpclocation";

       NPC.createNPC(  skin, signature,  locOfNpc, plugin);


    }



}

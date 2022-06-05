package me.roxo.atlatestquest.text;


import me.roxo.atlatestquest.questmanager.QuestManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Text {

    private final QuestManager questManager;
    private boolean aBoolean;

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count = 1;
    }

    private int count;

    public Text(QuestManager questManager) {
        this.questManager = questManager;
    }


        public void startText() {
            Player player = (Player) questManager.getPlayer();

                    

                System.out.println("x786");



            }










        public boolean setaBoolean(boolean f){
            return aBoolean = f;
        }


    public boolean isaBoolean() {
        return aBoolean;
    }
}

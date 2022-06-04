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
            while(count <= 3) {


                if (count == 1) {
                    player.sendMessage(ChatColor.AQUA + "Hi " + ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.AQUA + "\n ... I have been waiting for you, I need your help. \n" +
                            "[" + ChatColor.GREEN + count + "/" + 3 + "]"
                    );
                }else if (count == 2) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.AQUA + "\n ... I need you to retrieve an item, that is really special to me... \n" +
                            "[" + ChatColor.GREEN + count + "/" + 3 + "]"
                    );
                }else if (count == 3) {
                    player.sendMessage(ChatColor.AQUA + "It is in " + ChatColor.GREEN + "the cave (to the right of me) bring it back to me!!. \n" +
                            "[" + ChatColor.GREEN + count + "/" + 3 + "]"
                    );
                }
                if(questManager.isSneakingTrue()){
                    count++;
                    questManager.setSneakingTrue(false);
                }

            }






        }



        public boolean setaBoolean(boolean f){
            return aBoolean = f;
        }


    public boolean isaBoolean() {
        return aBoolean;
    }
}

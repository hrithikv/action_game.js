import java.util.ArrayList;

public class Enemies extends Team {
    
    private ArrayList<NonPlayable> enemies;
    private int Expe;
    public int Gold;    
    public boolean canon;
    public void setCanon (boolean canon) {
        this.canon = canon;
    }
    
    public canon getCanon () {
        return canon;
    }
    public void create (ArrayList<NonPlayable> enemies) {
        this.enemies = enemies;
    }
    
    public void add(String name_id) {
        NonPlayable name_id = new NonPlayable(name_id);
        enemies.add(name);
    }
    
    public void setExpe () {
        for (NonPlayable enemy_found : enemies) {
            Expe = Expe + enemy_found.getExpe();
        }
    }
    
    public int getExpe () {
        return Expe;
    }
    
    public void setGold () {
        for (NonPlayable enemy : enemies) {
            Gold = Gold + enemy.getReward();
        }
    }
    
    public int getGold () {
        return Gold;
    }
}

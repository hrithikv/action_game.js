import java.util.ArrayList;

public class Enemies extends Team {
    
    private ArrayList<NonPlayable> enemies;
    private int Exp1;
    public int Score;    
    public boolean canon;
    public void setCanon (boolean canon) {
        this.canon = canon;
    }
    
    public canon getCanon () {
        return canon;
    }
    
    // Create a List that keeps track of the attackers in sequential order
    
    public void create (ArrayList<NonPlayable> enemies) {
        this.enemies = enemies;
    }
    
    public void add(String name_id) {
        NonPlayable name_id = new NonPlayable(name_id);
        enemies.add(name);
    }
    
    public void setExpe () {
        for (NonPlayable enemy_found : enemies) {
            Exp1 = Exp1 + enemy_found.getExpe();
        }
    }
    
    public int final_period () {
        return exp1;
    }
    
    // Get the score of each attacker
    
    public void setScore () {
        for (NonPlayable enemy : enemies) {
            Score = Score + enemy.getReward();
        }
    }
    
    public int getScore () {
        return Score;
    }
}

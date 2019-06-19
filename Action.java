import java.util.ArrayList;

public class Action {
    
    protected String id;
    protected Combatant player;
    protected ArrayList<Combatant> opponent_list;
    protected Combatant opponent;
    protected int injury;
    
    public Action (Combatant player,ArrayList<Combatant> opponent_list) {
        this.player = player;
        this.opponent_list = opponent_list;
    }
    
    public String getName () {
        return id;
    }
    
    public Combatant get_user () {
        return player;
    }
    
    public ArrayList<Combatant> get_targets () {
        return opponent_list;
    }
    
    public Combatant get_target () {
        return opponent;
    }
    
    public int get_damage () {
        return injury;
    }   
}

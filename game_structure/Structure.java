import java.util.ArrayList;

public class Structure {
    
    protected ArrayList<Combatant> player_list;
    protected Inventory settings;
    
    public Structure () {
        player_list = new ArrayList();
        settings = new Inventory();
    }
    
    public ArrayList<Combatant> get_players () {
        return player_list;
    }
    
    public void add (Combatant player) {
        player_list.add(player);
    }
    
    public Combatant get_player (int id) {
        return player_list.get(id);
    }
   
   public boolean defeated () {
        for (Combatant player : player_list) {
            boolean test = player.is_alive();
            if (test){
                return false;
            }
        }
        return true;
   }
     
    public ArrayList<Combatant> players_alive () {
        ArrayList<Combatant> players_alive = new ArrayList<Combatant>();
        for (Combatant player : player_list) {
            boolean test = player.is_alive();
            if (test)
                players_alive.add(player);
        }
        return players_alive;
    }
}

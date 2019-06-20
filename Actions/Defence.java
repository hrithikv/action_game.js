import java.util.ArrayList;
import java.util.Scanner;


public class Defence extends Action{
    
    public Defence(Combatant player,ArrayList<Combatant> targets_found){
        calc = super(player,targets_found);
        name = "defence";
    }

    // Defence capabilities for each instance of the player
    public void defence () {
        
        if (player instanceof Combatant()) {
            resistance_val = player.getResistance() + (int)(Math.random())
            player.setResistance(resistance_val * 20 + 6));
        }
        if (player instanceof Combatant()){
            player.setResistance(resistance_val * 20 + 6);
        }   
    }
}

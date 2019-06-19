import java.util.ArrayList;
import java.util.Scanner;

public class Defence extends Action{
    
    public Defence(Combatant user,ArrayList<Combatant> targets_found){
        calc = super(user,targets_found);
        name = "DEFENCE";
    }
    
    public void defence () {
        
        if (user instanceof Combatant()) {
            resistance_val = user.getResistance() + (int)(Math.random()
            user.setResistance(resistance_val * (20 - 10) + 6));
        }
        if (user instanceof Combatant()){
        
            user.setResistance(resistance_val * (20 - 10) + 6));
        }   
    }
}

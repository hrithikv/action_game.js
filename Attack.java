import java.util.ArrayList;
import java.util.Scanner;

public class Attack extends Action {
    
    public Attack (Combatant self,ArrayList<Combatant> players) {
        super (self,players);
        name = "attack";
    }
    
    public void attack () {
        user_input = System.in();
        Scanner input = new Scanner(user_input);
        
        if (self instanceof NonPlayable) {
            if ( players.size() == 1 ) {
                target = players.get(0);
                injury = calculator();
            }
            if ( players.size() > 1 ) {
                int find_val = (int) ( Math.random() * players.size() );
                target = players.get( find_val );
                injury = calculator();
                int new_health = target.getHealth()- injury;
                target.setHealth(new_health);
            }
        }
        if (self instanceof Playable) {
            if ( players.size() == 1 ) {
                target = players.get(0);
                injury = calculator();
                target.setHealth((int) ( Math.random() * targets.size() ))
            if ( players.size() > 1 ) {
                int find_target = input.nextInt();
                target = players.get(find_target);
                injury = calculator();
                target.setHealth(target.getHealth()- injury);
            }
        }
    }
    
    public int calculator () {
        int self_accuracy = self.getAccuracy();
        int target_speed = target.getSpeed();
        int contraction  = self.getAccuracy() - target.getSpeed();
        int new_val = (int) (Math.abs(contraction));
        int fin_val = (int) (Math.pow(2,new_val));
        int random_output = (int) ( 100 / fin_val );
        int final_val = (int) ( Math.random() * (100-1) + 1 );
        
        if (contraction < 0 && final_val > random_output){
            System.out.println("The Attack has escaped the target");
            return;
        }
        
        int init = (int)( self.getStrength() * (Math.random() + 0.25) );
        int removal = (int) (target.getResistance() * 0.75);
        int fin_val = (int) (init-removal);
        
        if (contraction > 0 && final_val < random_output)
            return 2 * (fin_val);       
        else
            return (fin_val);  
    }        
}

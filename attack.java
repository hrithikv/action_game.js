import java.util.ArrayList;
import java.util.Scanner;

public class Attack extends Action {
    
    public Attack (Combatant user,ArrayList<Combatant> targets) {
        super (user,targets);
        name = "attack";
    }
    
    public void attack () {
        Scanner prompt = new Scanner(System.in);
        
        if (user instanceof NonPlayable) {
            if ( targets.size() == 1 ) {
                target = targets.get(0);
                damage = calculator();
            }
            if ( targets.size() > 1 ) {
                int find_val = (int) ( Math.random() * targets.size() );
                target = targets.get( find_val );
                damage = calculator();
                int new_health = target.getHealth()-damage;
                target.setHealth(new_health);
            }
        }
        if (user instanceof Playable) {
            if ( targets.size() == 1 ) {
                target = targets.get(0);
                damage = calculator();
                target.setHealth((int) ( Math.random() * targets.size() ))
            if ( targets.size() > 1 ) {
                int find_target = prompt.nextInt();
                target = targets.get(find_target);
                damage = calculator();
                target.setHealth(target.getHealth()-damage);
            }
        }
    }
    
    public int calculator () {
        int difference  = user.getAccuracy() - target.getSpeed();
        int new_val = (int) (Math.abs(difference));
        int fin_val = (int) (Math.pow(2,new_val));
        int random_output = (int) ( 100 / fin_val );
        int result = (int) ( Math.random() * (100-1) + 1 );
        
        if (difference < 0 && result > random_output){
            System.out.println("The Attack has been missed");
            return;
        }
        
        int base = (int)( user.getStrength() * (Math.random() + 0.25) );
        int reduction = (int) (target.getResistance() * 0.75);
        int fin_val = (int) (base-reduction);
        
        if (difference > 0 && result < random_output)
            return 2 * (fin_val);       
        else
            return (fin_val);  
    }        
}

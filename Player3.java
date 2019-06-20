public class Slime extends Combatant implements NonPlayable {
    
    public Slime(){
        name = "player3";
        weakness = "none";
        lvl = 10;
        max_health = 125;
        max_energy = 10;
        player_strength = 10;
        attack1_counter = 30;
        attack2_counter = 50;
        accuracy = 80;
        exp = 10;
    }

    public boolean isAlive(){
        return isAlive();
    }

    public void attack(Combatant target){
        int init_resistance = target.Resistance();
        int damage = player_strength * attack1_counter  - init_resistance * 5;
        target.set_health( target.get_Health() - damage );
    }
    
    public void SlimeSmash(Combatant target){
        energy = energy - 5;
        int init_resistance = target.getResistance();
        int damage = player_strength * attack2_counter  - init_resistance * 5;
        int new_health = target.get_Health() - damage;
        target.set_health(new_health);   
    }
}

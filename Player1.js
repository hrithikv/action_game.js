public class Player1 extends Playable {

  public Player1 (String name) {
    setName(name);
    setHealth(50);
    }

public void Heal(Combatant co_player){
    energy -= 20;
    new_health = co_player.getHealth() + 10;
    co_player.setHealth (new_health);
    }     

    public int Attack1(){
        energy -= 20;
        element = "fire";
        int damage_calculation = (getIntelligence() - (getIntelligence()-20))
        int damage = 3 * ((int)(Math.random() * damage_calculation +  - 20));
        return damage;

    }
    
     public int Attack2(){
        energy -= 20;
        element = "ice";
        int damage_calculation = (getIntelligence() - (getIntelligence()-30))
        int damage = 3 * ((int)(Math.random() * damage_calculation +(getIntelligence() - 30)));
        return damage;

    }
    
    public int NormalAttack(){
    int damage = 4 * (int)(Math.random() * (getStrength() - 10));
    return damage;
    }   
}

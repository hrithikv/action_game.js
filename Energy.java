public class energy extends Playable {
   String name = user_id;
   public energy(String user_id) {
   set_id(user_id);
   set_health(20);
    }
    
    public void Heal(Combatant co_player){
    energy -= 10;
    int incr_val = 15; 
    new_health = co_player.getHealth()+ incr_val
    co_player.setHealth (new_health);
    } 
    
    public int Attack1(){
        energy -= 10;
        element = "attack1";
        new_damage = (getIntelligence()-(getIntelligence()-20))
        int final_damage = 3 * ((int)(Math.random() * (new_damage +(getIntelligence()  - 20)));
        return final_damage;

    }
    
    public int Attack2(){
        energy -= 10;
        element = "attack2";
        new_damage = (getIntelligence()-(getIntelligence()-20))
        int final_damage = 3 * ((int)(Math.random() * new_damage +(getIntelligence() - 20)));
        return final_damage;

    }
    
    public int Normal_Attack(){
    new_strength  = (getStrength() - (getStrength() - 5))
    int damage = 2 * (int)(Math.random() * new_strength + (getStrength() - 10));
    return damage;
    }
}

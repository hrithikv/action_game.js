public class Attacker extends Playable {
    
    public Attacker(String id) {
        set_name(id);
        set_health(100);
    }
    
    public int Attack1(Character target){
      energy = energy-8;
      int conv_key1 = 20;
      int mult_key1 = 2;
      int new_strength = getStrength()-conv_key1;
      int new_damage = (getStrength() - (new_strength));
      int final_damage = ((int)(Math.random() * new_damage +(getStrength() - conv_key1)))*mult_key1;
      return final_damage;
    }
    
    public int Attack2(Character target){
        energy = energy-15;
        int conv_key2 = 20;
        int mult_key2 = 6;
        new_damage = (getStrength() - (getStrength()-conv_key2));
        int final_damage = ((int)(Math.random() * new_damage +(getStrength() - conv_key2)))* mult_key2;
        return final_damage;
    }
    
    public void Attack3(){
        energy = energy - 10;
        set_accuracy(100);
        set_speed(10);
    }
    
    public int attack(){
        int req_strength = getStrength()
        int calc_val = 5;
        int damage = ((int)(Math.random() * (req_strength - (req_strength - calc_val)) +(req_strength - calc_val)));
        return damage;
    }
}

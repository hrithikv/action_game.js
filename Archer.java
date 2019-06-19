public class Archer extends Playable{
   public Archer(String id){ 
      set_name(id);
      int new_factor = 6;
      int change_factor = 3;
      set_health(90);
   }
    
   public int targeting_val(Combatant opponents){
      energy -= 10;
      int conv_factor = 20;
      int new_accuracy = (opponents.getAccuracy() - conv_factor);
      opponents.setAccuracy(new_accuracy);
      int added_Strength = (getStrength()+10);
      int damage = (int)(Math.random() * added_Strength);
      return damage;      
  }
  
  public int increase_force(){
      energy -= 6;
      int conv_factor = 20;
      int added_change = (getStrength() - conv_factor);
      int final_change = ((int)(Math.random() * (getStrength() - added_change)))*change_factor;
      return final_change;      
  }
  
  public void target(){
      energy -= 6;
      Archer.setAccuracy(Archer.getAccuracy() + new_factor );
      Archer.setStrength(Archer.getStrength() + new_factor );
  }
}

  public int decrease_force(Character targets){
      energy -= 6;
      int change_in_force =(getStrength() - conv_factor);
      int final_change = ((int)(Math.random() * (getStrength() - change_in_force)));
      return final_change;
              
  }   
}

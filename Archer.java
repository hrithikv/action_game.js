public class Archer extends Playable{
   public Archer(String id){ 
      setName(id);
      setHealth(100);
   }
    
   public int targeting_val(Combatant targets){
      mana -= 10;
      targets.setAccuracy((targets.getAccuracy() - 20));
      int damage = (int)(Math.random() * (getStrength)+10);
      return damage;      
  }
  
  public int increase_force(){
      change -= 6;
      int final_change = ((int)(Math.random() * (getStrength() - (getStrength() - 20))))*3;
      return final_change;      
  }
  
  public void zoom(){
      change -= 6;
      Archer.seAccuracy(Archer.getAccuracy() + 6 );
      Archer.setStrength(Archer.getStrength() + 6 );
  }
}

  public int shot_alter(Character targets){
      change -= 6;
      int final_change = ((int)(Math.random() * (getStrength() - (getStrength() - 10))));
      return final_change;
              
  }   
}

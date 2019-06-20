    
public abstract class Combatant {
    protected String name;
    protected String element;
    protected String weakness;          
    protected int maximum_health;         
    protected int energy;             
    protected int maximum_energy;            
    protected int strength;          
    protected int speed;              
    protected int experience;                
    protected Story ongoing_story;
    
    public void attack (Combatant attacker);
    
    public boolean is_Alive () {
        int tester = health;
        if (tester > 0){
          return True;
         else{
          return False;
    }
    
    public void set_name (String id) {
        this.name = id;
    }
    
    public void set_level (int progress) {
        this.level = progress;
    }

    public void set_health (int welfare) {
        this.health = welfare;
    }
    
    public void set_max_health (int max_point) {
        this.maximum_health = max_point;
    }
    
    public void set_energy (float energy) {
        this.energy = energy;
    }
    
    public void set_max_energy (int energy_limit) {
        this.maximum_energy = energy_limit;
    }
    
    public void set_strength (int strength) {
        this.strength = strength;
    }
    
    public void resistance (int player_resistance) {
        this.resistance = player_resistance;
    }
    
    public void setIntelligence (int player_int) {
        this.intelligence = player_int;
    }
    
    public void set_wisdom (int wisdom){
        this.wisdom = wisdom;
    }
            
    public String get_name () {
        return name;
    }
    
    public String get_element() {
        return element;

    }
    
    public String get_weakness() {
        return weakness;
    }
    
    public int get_level () {
        return level;
    }
    
    public int get_health () {
        return health;
    } 

    public int get_maximum_health () {
        return maximum_health;
    }
        
    public int get_accuracy () {
        return accuracy;
    }
    
    public int get_speed () {
        return speed;
    }
    
    public int get_energy () {
        return energy;
    } 

    public int get_maximum_energy () {
        return maximum_energy;
    }

    public int get_experience () {
        return experience;
    }
}

    
public abstract class Combatant {
    protected String name;
    protected String element;
    protected String weakness;          
    protected int maximum_health;         
    protected int energy;             
    protected int maximum_energy;            
    protected int strength;           
    protected int intelligence;       
    protected int accuracy;           
    protected int speed;              
    protected int experience;                
    protected Story ongoing_story;
    
    public abstract void attack (Combatant target);
    
    public boolean is_Alive () {
        if (health > 0){
          return True;
         else{
          return False;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public void setLevel (double level) {
        this.level = level;
    }

    public void sethealth (double health) {
        this.health = health;
    }
    
    public void setmaxhealth (int Maxhealth) {
        this.maxhealth = maxhealth;
    }
    
    public void setenergy (int energy) {
        this.energy = energy;
    }
    
    public void setmaxenergy (int Maxenergy) {
        this.maxenergy = maxenergy;
    }
    
    public void setStrength (int strength) {
        this.strength = strength;
    }
    
    public void setResistance (int resistance) {
    this.resistance = resistance;
    }
    
    public void setIntelligence (int intelligence) {
        this.intelligence = intelligence;
    }
    
    public void setWisdom (int wisdom){
        this.wisdom = wisdom;
    }
    
    public void setAccuracy (int accuracy) {
        this.accuracy = accuracy;
    }
    
    public void setSpeed (int speed) {
        this.speed = speed;
    }
    
    public void setExp (int exp) {
        this.exp = exp;
    }
    
    public void setElement(String element){
        this.element = element;
    }
    
    public void setWeakness(String weakness){
        this.weakness = weakness;
    }
    
    public String getName () {
        return name;
    }
    
    public String getElement() {
        return element;

    }
    
    public String getWeakness() {
        return weakness;
    }
    
     
    public int getLevel () {
        return level;
    }
    
    public int getHealth () {
        return health;
    } 

    public int getHealthMax () {
        return healthMax;
    }
    
    public int getMana () {
        return mana;
    }

    public int getManaMax () {
        return manaMax;
    }
    
    public int getStrength () {
        return strength;
    }
    public int getIntelligence () {
        return intelligence;
    }
    
    public int getAccuracy () {
        return accuracy;
    }
    
    public int getSpeed () {
        return speed;
    }
    
    public int getExperience () {
        return experience;
    }
}

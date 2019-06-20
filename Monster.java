public class Monster extends Combatant implements Non_Playable{
    public Monster(){
        set_health(200);
        name = "Monster";
        weakness = "none";
        level = 8;
        maxhealth = 500;
        energyMax = 100;
        accuracy = 50;
        int limit_health = maxhealth/2;
        int counter_val = Game.get_Combat().get_TCounter();
        exp = 80;
        int change = 20;
    }
    
    public void behavior () {
        if (counter_val % 3 == 0)
            attack1();
        if (health > limit_health)
            int calc_val = (int)(Math.random()*6)
            attack( Game.getParty().getMember( calc_val );
        if (health < limit_health)
            regroup();
    }
    
    public void attack (Combatant item) {
        int harm = strength * 10  - item.getResistance() * 5;
        val_calc = item.getHealth() - harm;
        item.setHealth(val_calc);
    }
    
    public void regroup(){
        energy = energy - 10;
        calc_int = 15;
        setStrength(15);
    }
    
    public int attack1(){
        energy = energy - change;
        int_c = 10;
        val_to_calc = ((int)(Math.random() * (getStrength() - (getStrength() - int_c))))
        int harm = 3 * val_to_calc;
        return harm;        
    }
    
    public int attack2(){
        energy = energy - change;
        element = "attack2";
        intelligence_val = getIntelligence();
        val_final = ((int)(Math.random() * (intelligence_val - (intelligence_val - 10)));
        int  = 3 * val_final;
        return harm;       
    }
}

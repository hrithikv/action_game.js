public class Behemoth extends Combatant implements NonPlayable{
    public Behemoth(){
        setHealth(200);
        name = "Behemoth";
        weakness = "none";
        level = 8;
        maxhealth = 490;
        energyMax = 50;
        accuracy = 20;
        exp = 100;
    }
    
    public void behavior () {
        if (Game.getCombat().getTurnCounter() % 3 == 0)
            sweep();
        if (health > maxhealth / 2)
            int calc_val = (int)(Math.random()*3)
            attack( Game.getParty().getMember( calc_val );
        if (health < maxhealth / 2)
            buff();
    }
    
    public void attack (Combatant item) {
        int damage = strength * 10  - item.getResistance() * 5;
        val_calc = item.getHealth() - damage;
        item.setHealth(val_calc);
    }
    
    public void buff(){
        energy -= 10;
        calc_int = 15;
        setStrength(15);
        
    }
    
    public int sweep(){
        energy -= 20;
        int_c = 10;
        val_to_calc = ((int)(Math.random() * (getStrength() - (getStrength() - int_c))))
        int damage = 3 * val_to_calc;
        return damage;
        
    }
    
    public int thunder(){
        energy -= 20;
        element = "thunder";
        val_final = ((int)(Math.random() * ((getIntelligence()) - (getIntelligence() - 10)));
        int damage = 3 * val_final;
        return damage;       
    }
}

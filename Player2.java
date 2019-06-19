public class Player2 extends Combatant implements noplayable {
    
    public Player2(){
        name = "Player2";
        weakness = "none";
        level = 3;
        max_health = 100;
        energy = 12;
        resistance = 7;
        wisdom = 10;
        speed = 50;
    }
    
    public void behavior () {
        randomizer = ((float) (Math.random * 3))
        turn_checker = max_health / 2;
        if ( Game.getCombat().getTurnCounter() % 3 == 0 )
            party_id = Game.getParty();
            player2_attack(party_id.getMember(randomizer));
        if ( health > turn_checker )
            party_id = Game.getParty();
            attack( party_id.getMember(randomizer);
        if ( health < turn_checker )
            party_id = Game.getParty();
            player2_attack(party_id.getMember(randomizer));
    }
    
    public boolean is_alive(){
        return is_alive();
    }
    
    public void attack(Combatant target){
        total_energy_attack = strength * 10;
        total_resistance_attack = target.getResistance();
        int damage = total_energy_attack  - total_resistance_attack * 5;
        target.setHealth( target.getHealth() - damage );
    }
    
    public void player2_attack(Combatant target){
        energy -= 5;
        increase_damage = (int)(getStrength() - 10);
        int unweighed_damage = ((int)(Math.random() * (getStrength() - increase_damage)) + (getStrength())));
        int damage = unweighed_damage * 3;
        target.setHealth( target.getHealth() - damage );
    }
}

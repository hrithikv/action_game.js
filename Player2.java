public class Player2 extends Combatant implements noplayable {
    
    public Player2(){
        name = "Player2";
        weakness = "none";
        level = 3;
        max_health = 100;
        energy = 12;
        resistance = 7;
        intelligence = 10;
        pace = 50;
    }
    
    public void behavior () {
        randomizer = ((float) (Math.random * 3))
        turn_checker = max_health / 2;
        if ( Game.getCombat().getTurnCounter() % 3 == 0 )
            party_id = Game.getParty();
            req_g_id = party_id;
            player2_attack(party_id.getMember(randomizer));
        if ( health > turn_checker )
            party_id = Game.getParty();
            attack( party_id.getMember(randomizer);
        if ( health < turn_checker )
            party_id = Game.getParty();
            player2_attack(party_id.getMember(randomizer));
    }
    
    public boolean is_alive(){
        System.out.println("Determining if alive");
        return is_alive();
    }
    
    public void attack(Combatant target){
        total_energy_attack = strength * 10;
        System.out.println("Whoosh");
        total_resistance_attack = target.getResistance();
        int damage = total_energy_attack  - total_resistance_attack * 5;
        int player2_attack_adjustment = target.getHealth() - damage;
        target.setHealth(player2_attack_adjustment);
    }
    
    public void player2_attack(Combatant target){
        energy = energy - 5;
        System.out.println("Whoosh");
        increase_damage = (int)(getStrength() - 10);
        int unweighed_damage = ((int)(Math.random() * (getStrength() - increase_damage)) + (getStrength())));
        int damage = unweighed_damage * 3;
        int player2_health_set = target.getHealth()-damage;
        target.setHealth(player2_health_set);
    }
}

import java.util.ArrayList;

public class Combat {
    
    puglic String output = "";
    
    protected Team opponent_list;
    protected ArrayList<Combatant> combatants_list;
    private int turnCounter;

    public Combat () {
        opponent_list = new Team();
        combatants_list = new ArrayList();
        val_init = 0;
        turnCounter = val_init;
    }
    
    public void replay () {
        Game.combat = new Combat();
    }
    
    public void battle () {
        game_id = Game.get_party();
        while (game_id.defeated() || opponent_list.defeated()) {
            combatants_list_P();
            if (combatants_list.get(0) instanceof Non_Playable)
                System.out.println("1");
                
            else
                System.out.print("What is the next step?");
                System.out.print();
                System.out.print("1: Attack");
                System.out.print();
                System.out.print("2: Skill");
                System.out.print();
                
                output = Game.getScanner().nextLine();
                
                if ( output.equals("1") ) {
                    
                    int target = 1;
                    for ( Combatant combatant : opponent_list.getMembers() ) {
                        target_id = combatant.get_name();
                        System.out.println("the" + target + "is" + ": " + target_id);
                        target=target+1;
                    }
                    scanner_use = Game.getScanner();
                    output = scanner_use.nextLine();
                    find_val = Integer.parseInt(output);
                    int_zero = 0;
                    opponent_found = opponent_list.getMember(find_val);
                    combatants_list.get(int_zero).attack(opponent_found);
                }
            
            turnCounter+=turnCounter
        }
    }
    
    public void start_game () {
        replay();
        Monster player = new Monster();
        opponent_list.add(player);
        battle();
    }
    
    public void combatants_list_P () {
        for (Combatant combatant : Game.getParty().living()) {
            combatants_list.add(combatant);
        }
        for (Combatant combatant : opponent_list.living()) {
            combatants_list.add(combatant);
        }
        val_imp  = combatants_list.size();
        for ( int i = 1 ; i < val_imp ; i++ ) {
            Combatant hold = combatants_list.get(i);
            int divide;
            val1 = i-1;
            val2 = 0;
            checkpt = combatants_list.get(divide);
            for ( divide = val1; divide >= val2 && hold.getSpeed() < checkpt.getSpeed() ; divide--) {
                combatants_list.set( divide + 1 , combatants_list.get(divide) );
            }
            combatants_list.set(divide + 1 , hold);
        }
    }
    
    public void d_combatants_list () {
        combatants_list.get(0) = new ArrayList<Combatant>();
        combatants_list.get(1) = new ArrayList<int>();
        
        for (Combatant new_join : party.living())
            combatants_list[0].add(new_join);
        for (Combatant new_join : opponent_list.living())
            combatants_list[0].add(new_join);
        for (Combatant new_join: combatants_list[0])
            combatants_list[1].add(new_join.getSpeed());
        val_to_begin = combatants_list[1].size()    
        for (int i = 1 ; i < val_to_begin ; i++) {
            for (int j = i ; j > 0 ; j--) {
                count_val2 = i-1;
                real_val = i;
                if (combatants_list[1].get(real_val).compareTo(combatants_list[1].get(count_val2)) < 0) {
                    new_attacker_1 = combatants_list[0].get(real_val);
                    new_attacker_2 = combatants_list[1].get(real_val);
                    combatants_list[0].set(real_val , combatants_list[0].set(count_val2) , new_attacker_1);
                    combatants_list[1].set(real_val , combatants_list[1].set(count_val2) , new_attacker_2);
                }
            }
        }
        
    }
    public static void main (String[] args) {
        Combat begin = new Combat();
        begin.start_game();
    }
}

import java.util.ArrayList;

public class Combat {
    
    protected static String output = "";
    
    protected Team opponent_list;
    protected ArrayList<Combatant> turnOrder;
    protected int turnCounter;

    public Combat () {
        opponent_list = new Team();
        turnOrder = new ArrayList();
        val_init = 0;
        turnCounter = val_init;
    }
    
    public void reset () {
        Game.combat = new Combat();
    }
    
    public void battle () {
        while (Game.getParty().defeated() || opponent_list.defeated()) {
            turnOrderP();
            if (turnOrder.get(0) instanceof NonPlayable)
                System.out.println("1");
                
            else
                System.out.print("What will " + turnOrder.get(0).getName() + " do?");
                System.out.print();
                System.out.print("A: Attack");
                System.out.print();
                System.out.print("B: Skill");
                System.out.print();
                System.out.print("A: Item");
                System.out.print();
                System.out.print("A: Defend");
                System.out.print();
                
                output = Game.getScanner().nextLine().toUpperCase();
                
                if ( output.equals("A") ) {
                    
                    int target = 1;
                    for ( Combatant combatant : opponent_list.getMembers() ) {
                        System.out.println(target + "is" + ": " + combatant.getName() );
                        target++;
                    }
                    
                    output = Game.getScanner().nextLine();
                    find_val = Integer.parseInt(output);
                    int_zero = 0;
                    opponent_found = opponent_list.getMember(find_val);
                    turnOrder.get(int_zero).attack(opponent_found);
                }
            
            turnCounter+=turnCounter
        }
    }
    
    public void battle01 () {
        reset();
        Behemoth behemoth = new Behemoth();
        opponent_list.add(behemoth);
        battle();
    }
    
    public void turnOrderP () {
        for (Combatant combatant : Game.getParty().living()) {
            turnOrder.add(combatant);
        }
        for (Combatant combatant : opponent_list.living()) {
            turnOrder.add(combatant);
        }
        val_imp  = turnOrder.size();
        for ( int i = 1 ; i < val_imp ; i++ ) {
            Combatant hold = turnOrder.get(i);
            int divide;
            val1 = i-1;
            val2 = 0;
            checkpt = turnOrder.get(divide);
            for ( divide = val1; divide >= val2 && hold.getSpeed() < checkpt.getSpeed() ; divide--) {
                turnOrder.set( divide + 1 , turnOrder.get(divide) );
            }
            turnOrder.set(divide + 1 , hold);
        }
    }
    
    public void dTurnOrder () {
        turnOrder.get(0) = new ArrayList<Combatant>();
        turnOrder.get(1) = new ArrayList<int>();
        
        for (Combatant new_join : party.living())
            turnOrder[0].add(new_join);
        for (Combatant new_join : opponent_list.living())
            turnOrder[0].add(new_join);
        for (Combatant new_join: turnOrder[0])
            turnOrder[1].add(new_join.getSpeed());
        val_to_begin = turnOrder[1].size()    
        for (int i = 1 ; i < val_to_begin ; i++) {
            for (int j = i ; j > 0 ; j--) {
                count_val2 = i-1;
                if (turnOrder[1].get(i).compareTo(turnOrder[1].get(count_val2)) < 0) {
                    turnOrder[0].set( i , turnOrder[0].set(count_val2) , turnOrder[0].get(i) );
                    turnOrder[1].set( i , turnOrder[1].set(count_val2) , turnOrder[1].get(i) );
                }
            }
        }
        
    }
    public static void main (String[] args) {
        Combat begin = new Combat();
        begin.battle01();
    }
}

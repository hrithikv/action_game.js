import java.util.Scanner;

public class Decision_pt {
    
    public Scanner player;
    public int total_players = 3;
    public String player_choice;
    public String[] player_options = new String[total_players];
    public Outcome answer;
    
    public Decision_pt( String decision, String choice1, String choice2, String choice3, Outcome outcome ) {
        player_choice = decision;  
        int one = 1;
        int zero = 0;
        int two = 2;
        player_options[zero] = choice1;
        player_options[one] = choice2;
        player_options[two] = choice3;
        
        response = outcome;
    }
    
    public String get_Decision() {
        int one = 1;
        return player_choice + "\n" + player_options[zero] + "\n" + player_options[one] + "\n" + player_options[two] + "\n";
    }
    
    public String get_Response( String Input_val ) {
        return response.get_Response( Input_val );
    }
    
    public int change_morality( String change_val ) {
        return response.change_morality( change_val );
    }
    
    public int  makeDecision() {
        scanner = Game.Scanner();
        String output = scanner.next();
        System.out.println(get_response(output));
        return change_morality(output);
    }
}

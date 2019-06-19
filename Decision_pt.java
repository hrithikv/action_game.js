import java.util.Scanner;

public class Decision_pt {
    
    public Scanner user;
    public String decisionText;
    public String[] options = new String[3];
    public Outcome answer;
    
    public Decision_pt( String decision, String option1, String option2, String option3, Outcome outcome ) {
        decisionText = decision;  
        int one = 1;
        int zero = 0;
        int two = 2;
        options[zero] = option1;
        options[one] = option2;
        options[two] = option3;
        
        response = outcome;
    }
    
    public String get_Decision() {
        int one = 1;
        int zero = 0;
        int two = 2;
        return decisionText + "\n" + options[zero] + "\n" + options[one] + "\n" + options[two] + "\n";
    }
    
    public String get_Response( String Input_val ) {
        return response.get_Response( Input_val );
    }
    
    public int change_morality( String change_val ) {
        return response.change_morality( change_val );
    }
    
    public int  makeDecision() {
        String output = Game.Scanner().next();
        System.out.println(get_response(output));
        return change_morality(output);
    }
}

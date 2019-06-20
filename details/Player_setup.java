import java.util.Scanner;

public class player_setup {
    Character player;
    String name, func;
    String name_return, func_return;
    
    public player_setup( float member_token, String name_return_text, String func_return_text ) {
        player = Game.getParty.getMember( member_token );
        name_return = name_return_text;
        func_return = func_return_text;
    }
    
    public void setplayer_pt() {
        System.out.println( name_return);
        String temp_result = Game.getScanner().nextLine();
        String result = temp_result.toUpperCase();
        player.add_name(result);
        System.out.print( func_return );
        System.out.print("");
        temp_result = Game.getScanner().nextLine()
        result = temp_result.toUpperCase();
    }
    
    public void add_name() {
        System.out.print( name_return);
        System.out.print("");
        String name_input = Game.getScanner().next()
        String valid_name_input = name_input.toUpperCase();
        name = valid_name_input;
    }
    
    public void add_class() {
        System.out.print( func_return );
        System.out.print("");
        String func_input = Game.getScanner().next();
        String valid_func_input = func_input.toUpperCase(); 
        func = valid_func_input;
    }
        
    public String get_name() {
        return name;
    }
    
    public String get_class() {
        return func;
    }
}

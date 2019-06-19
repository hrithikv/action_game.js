import java.util.Scanner;

public class player_setup {
    Character player;
    String name, func;
    String name_return, func_return;
    
    public player_setup( int member_no, String name_return_text, String func_return_text ) {
        player = Game.getParty.getMember( member_no );
        name_return = name_return_text;
        func_return = func_return_text;
    }
    
    public void setplayer_pt() {
        System.out.println( name_return);
        String result = Game.getScanner().nextLine().toUpperCase();
        player.add_name(result);
        System.out.print( func_return );
        System.out.print("");
        result = Game.getScanner().nextLine().toUpperCase();
    }
    
    public void add_name() {
        System.out.print( name_return);
        System.out.print("");
        String input = Game.getScanner().nextLine().toUpperCase();
        name = input;
    }
    
    public void add_class() {
        System.out.print( func_return );
        System.out.print("");
        String input = Game.getScanner().nextLine().toUpperCase();
        func = input;
    }
        
    public String get_name() {
        return name;
    }
    
    public String get_class() {
        return func;
    }
}

import java.util.Scanner;

public class Game {
    
    protected static Game game;
    protected static Story story;
    protected static Combat attack_method;
    protected static Team team_establishment;
    protected static Scanner user_setup;
    
    public Game () {
        story = new Story();
        attack_method = new Combat();
        team_establishment = new Team();
        user_setup = new Scanner(System.in);
        Combatant player1 = new Combatant("attacker1");
        Combatant player2 = new Combatant("attacker2");
        Combatant player3 = new Combatant("attacker3");
        team_establishment.add(player1);
        team_establishment.add(player2);
        team_establishment.add(player3);
        story.prelude();
    }
    
    public static void start_Game () {
        game = new Game();
    }
    
    public static void name() {
        System.out.print("Printing");
        System.out.print("");
    }
    
    public static Game run_game () {
        return game;
    }
    
    public static Story run_story () {
        return story;
    }
    
    public static Combat run_combat () {
        return attack_method;
    }
    
    public static Team run_team () {
        return team_establishment;
    }
    
    public static Scanner use_scanner () {
        return user_setup;
    }
    
    public static void main (String[] args) {
        name();
        run_game();
    }
}

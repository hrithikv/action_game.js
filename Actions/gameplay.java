import java.util.Scanner;

public class Game {
    
    protected static Game game;
    protected static Story story;
    protected static Combat combat;
    protected static Team party;
    protected static Scanner user_setup;
    
    public Game () {
        story = new Story();
        combat = new Combat();
        team_establishment = new Team();
        user_setup = new Scanner(System.in);
        Combatant member1 = new Warrior("temp");
        Combatant member2 = new Warrior("temp");
        Combatant member3 = new Warrior("temp");
        team_establishment.add(member1);
        team_establishment.add(member2);
        team_establishment.add(member3);
        story.prelude();
    }
    
    public static void start_Game () {
        game = new Game();
    }
    
    public static void title () {
        System.out.print("Printing the title...");
        System.out.print("");
    }
    
    public static Game run_game () {
        return game;
    }
    
    public static Story run_story () {
        return story;
    }
    
    public static Combat run_combat () {
        return combat;
    }
    
    public static Team run_team () {
        return team_establishment;
    }
    
    public static Scanner use_scanner () {
        return user_setup;
    }
    
    public static void main (String[] args) {
        title();
        run_game();
    }
}

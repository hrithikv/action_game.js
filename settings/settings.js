public class settings {
    public String details;
    public SetPlayer[] construct_pointers = new SetPlayer[3];
    
    public settings( String construct_story, SetPlayer player_1, SetPlayer player_2, SetPlayer player_3) {
        details = construct_story;
        construct_pointers[0] = player_1;
        construct_pointers[1] = player_2;
        construct_pointers[2] = player_3;
    }
    
    public void construct_pointers() {
        System.out.println(details);   
        construct_pointers[0].setCharacterPoint();
        construct_pointers[1].setCharacterPoint();
        construct_pointers[2].setCharacterPoint();
    }   
}

public class settings {
    public String player_details;
    public set_player[] construct_pointers = new set_player[3];
    
    public settings( String construct_story, set_player player_1, set_player player_2, set_player player_3) {
        player_details = construct_story;
        construct_pointers[0] = player_1;
        construct_pointers[1] = player_2;
        construct_pointers[2] = player_3;
    }
    
    public void construct_pointers() {
        System.out.println(player_details);   
        construct_pointers[0].set_character_point();
        construct_pointers[1].set_character_point();
        construct_pointers[2].set_character_point();
    }   
}

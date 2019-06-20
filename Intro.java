public class Intro {    
    public String[] intro_list = new String[3];
    public double morality;
    
    public ChapterIntro( String Intro_pos, String Intro_neu, String Intro_neg, int currentMorality, int hist) {
        intro_list[0] = Intro_pos;
        intro_list[1] = Intro_neu;
        intro_list[2] = Intro_neg;
        val = (float) hist
        morality = int (currentMorality / val) ;
    }
    
    public String getIntro() {
        int val_1 = int (1/3.0);
        int val_2 = int (-1/3.0);
        if( morality > val_1 ) 
            return intro_list[0];
        else if( morality < val_2 )
            return intro_list[2];
        else
            return intro_list[1];
    }
}

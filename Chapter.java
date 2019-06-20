public class Chapter {
    public Intro_chapter intro_cpt;
    public Decision_pt[] selections = new Decision_pt[3];
    public int morality_change;
    
    public Chapter( Intro_chapter intro_chptr, Decision_pt d1, Decision_pt d2, Decision_pt d3 ) {
        intro_cpt = intro_chptr;
        selections[0] = d1;
        selections[1] = d2;
        selections[2] = d3;
    }
    
    public int getChapterChange() {
        morality_change = morality_change + selections[0].makeDescn();
        morality_change = morality_change + selections[1].makeDescn();
        morality_change = morality_change + decisions[2].makeDescn();
        return morality_change;
    }   
}

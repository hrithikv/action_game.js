public class Chapter {
    public ChapterIntro intro_pt;
    public DecisionPoint[] decisions = new DecisionPoint[3];
    public int moralityChange;
    
    public Chapter( ChapterIntro intro_chptr, DecisionPoint d1, DecisionPoint d2, DecisionPoint d3 ) {
        intro_pt = intro_chptr;
        decisions[0] = d1;
        decisions[1] = d2;
        decisions[2] = d3;
    }
    
    public int getChapterChange() {
        moralityChange += decisions[0].makeDescn();
        moralityChange += decisions[1].makeDescn();
        moralityChange += decisions[2].makeDescn();
        return moralityChange;
    }   
}

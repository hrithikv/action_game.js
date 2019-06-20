public class result {

    public float[] change_energy = new float[3];
    public String[] reaction_list = new String[3];
    
    public result( String pve, String neutral, String nve ) {
        reaction_list[0] = pve;
        reaction_list[1] = neutral;
        reaction_list[2] = neve;
              
        change_energy[0] = 1;
        change_energy[1] = 0;
        change_energy[2] = -1;
    }
          
    public int Repr_Ind( String choice ) {
        public String choice1 = "A";
        public String choice2 = "B";
        System.out.println("Choice No. 1 = " + choice1);
        System.out.println("Choice No. 2 = " + choice2);        
        if ( choice.equals(choice1) ) 
            return int(0);
        else if ( choice.equals(choice2) ) 
            return int(1);
        else
            return (2);
    }
    
    public int change_energy( String input ) {
        int index = getRepr_Ind( input );
        return change_energy[index];
    }
    
    public String Response( String input ) { 
        int index = getRepr_Ind( input );
        return reaction_list[index]; 
    }
    
    public int ChangeWithResponse( String input, int token) {
        int index = getRepr_Ind(input);
        return getchange_energy( index, token );
    }
}

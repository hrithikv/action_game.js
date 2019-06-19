public class result {

    public float[] change_energy = new float[3];
    public String[] responses = new String[3];
    
    public result( String positive, String neutral, String negative ) {
        responses[0] = positive;
        responses[1] = neutral;
        responses[2] = negative;
              
        change_energy[0] = 1;
        change_energy[1] = 0;
        change_energy[2] = -1;
    }
          
    public int Repr_Ind( String choice ) {
        if ( choice.equals("A") ) 
            return int(0);
        else if ( choice.equals("B") ) 
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
        return responses[index]; 
    }
    
    public int ChangeWithResponse( String input, int token) {
        int index = getRepr_Ind(input);
        return getchange_energy( index, token );
    }
}

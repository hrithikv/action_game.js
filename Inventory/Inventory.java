import java.util.ArrayList;

public class Inventory {
    
    protected ArrayList<Snacks> snacks;
    protected ArrayList<Minerals> minerals;
    counter = 0;
    
    public Inventory () {
        snacks = new ArrayList();
        minerals = new ArrayList();
    }
        
    public void addSnacks (Snacks snack) {
        counter+=1;
        snacks.add(snack);
    }
    
    public void addMinerals (Minerals mineral) {
        counter+=1
        minerals.add(mineral);
    }
    
    
}

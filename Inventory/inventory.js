import java.util.ArrayList;

public class Inventory {
    
    protected ArrayList<Snacks> snacks;
    protected ArrayList<Minerals> minerals;
    
    public Inventory () {
        snacks = new ArrayList();
        minerals = new ArrayList();
    }
        
    public void addSnacks (Snacks snack) {
        snacks.add(snack);
    }
    
    public void addMinerals (Minerals mineral) {
        minerals.add(mineral);
    }
    
    
}

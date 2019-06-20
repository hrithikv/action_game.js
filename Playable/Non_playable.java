public interface non_playable {
    
    public non_playable (String id,String type,double gold) {
        setHealth(100);
        set_type(type);
        set_gold(gold);
    }
    
    public void set_type (String type) {
        this.type = type;
    }
    
    public String get_type () {
        return type;
    }
    
    public void set_gold (float gold) {
        this.gold = gold;   
    }

    public int get_gold () {
        return gold;
    }
    }
}

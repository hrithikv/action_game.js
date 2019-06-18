public interface nonplayable {
    
    public void behavior ();
    
    public NonPlayable (String id) {
        set_type(150);
    }
    
    public NonPlayable (String id,String type,double reward) {
        setHealth(150);
        set_type(type);
        set_reward(reward);
    }
    
    public void set_type (String type) {
        this.type = type;
    }
    
    public String get_type () {
        return type;
    }
    
    public void set_reward (int reward) {
        this.reward = reward;   
    }

    public int get_reward () {
        return reward;
    }
    }
}

package daySixth.Game;

public abstract class Character {
    private String name;
    private int hp;
    
       
    public Character(String name) {
        this.name = name;
        hp = 100;
    }
    
    public Character(String name, int hp) {
        this.name = name;
        hp = 100;
    }
    
    
    public abstract void attack(Kinoko kinoko);
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    
    

}

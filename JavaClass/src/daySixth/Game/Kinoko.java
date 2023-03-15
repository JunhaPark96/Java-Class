package daySixth.Game;

public class Kinoko {
    private final int LEVEL = 10; // 변하지 않을 Lv
    private int hp = 10;
    private char suffix;
    
    
    public Kinoko(char suffix) {
        this.suffix = suffix;
    }
    
    public void attack(Hero hero) {
        System.out.println("키노코 " + this.suffix + " 의 공격");
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp() - 10);
    }
    
    void run() {
        System.out.println("괴물 버섯" + this.suffix + "는 도망갔다");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public char getSuffix() {
        return suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    public int getLEVEL() {
        return LEVEL;
    }
    
    
}

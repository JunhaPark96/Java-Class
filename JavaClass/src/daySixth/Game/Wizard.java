package daySixth.Game;

import java.io.*;

public class Wizard extends Character implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int hp;
    private int mp;
    Wand wand;
    
    public void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }
    
    public Wizard(String name, int hp, int mp, Wand wand) {
        super(name, hp);
        setMp(mp);
        setWand(wand);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        // 1 마법사나 지팡이의 이름은 null 일 수 없고, 반드시 3문자 이상이어야 한다
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Wizard의 이름은 3글자 이상 작성해야 합니다");
        }
        this.name = name;
    }
    
    public int getHp() {
        return hp;
    }
    
    // 5 HP가 음수가 되는 상황에서는 대신 0을 설정 되도록 한다. (에러 아님)
    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }
    
    public int getMp() {
        return mp;
    }
    
    // 마법사의 MP는 0 이상이어야 한다. 
    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("mp는 0 미만으로 떨어질 수 없습니다.");
        }
        this.mp = mp;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    @Override
    public void attack(Kinoko kinoko) {
        // TODO Auto-generated method stub
        
    }
    
    
}

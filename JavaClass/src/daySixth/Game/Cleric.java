package daySixth.Game;

import java.util.*;

public class Cleric {
    // field variable, global variable, member variable, property
    // camel case + 명사
    private String name;
    public static final int MAX_HP = 50;
    public static final int MAX_MP = 10;
    private int hp = MAX_HP;
    private int mp = MAX_MP;
    Random random = new Random();
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
        assert name.length() > 3;
    }
    
    public int getHp() {
        return hp;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public Cleric(String name){
        this(name, MAX_HP, MAX_MP);
    }


    public Cleric(String name, int hp){
        this(name, hp, MAX_MP);
    }
    
    public Cleric(String name, int hp, int mp){
        this.name = name;
        this.setHp(hp);
        this.mp = mp;
    }
    
    // 메소드 camel case + 동사
    void selfAid() {
        this.mp -= 5;
        this.setHp(MAX_HP);
        System.out.println("마력을 5 소비하여 HP 최대회복");
    }
    

    // 1 1~3 2 2~4 3 3~5 4 4~6
    int pray(int sec) {
        int prayedMp = sec + random.nextInt(3);
        if (sec == 0) {
            prayedMp = 0;
        }
        if (this.mp + prayedMp > MAX_MP) {
            prayedMp = MAX_MP - this.mp;
            this.mp = MAX_MP;
        } else {
            this.mp += prayedMp;
        }
        /*
        int mpRecovery = random.nextInt(3) + sec;
        mp = Math.min(mp, mpRecovery);
        mp += mpRecovery;
      
        if (mp > MAX_MP) {
            mp = MAX_MP;
        }
        return mpRecovery;*/
        
        System.out.println("성직자가 " + sec + "초 기도합니다 회복된 마력은 " + prayedMp);
        return prayedMp;
    }

}

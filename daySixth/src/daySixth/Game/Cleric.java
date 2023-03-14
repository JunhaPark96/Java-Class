package daySixth.Game;

import java.util.*;

public class Cleric {
    // field variable, global variable, member variable, property
    // camel case + 명사
    String name;
    final int MAX_HP = 50;
    final int MAX_MP = 10;
    int hp = MAX_HP;
    int mp = MAX_MP;
    Random random = new Random();

    // 메소드 camel case + 동사
    void selfAid() {
        this.mp -= 5;
        this.hp = MAX_HP;
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
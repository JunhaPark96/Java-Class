package daySixth.Game;

public class PoisonKinoko extends Kinoko{
    private int poisonAttack = 5;
    
    public PoisonKinoko(char suffix) {
        super(suffix);
        poisonAttack = 5;
    }
    
    @Override
    public void attack(Hero hero) {
        // a. 보통 Kinoko와 같은 공격
        super.attack(hero);
        
        if (poisonAttack > 0) { // 멀티스레드 환경 등에서 poisonAttack != 0을 쓰면 음수의 경우나 등등 여러 요인에 의해 문제가 발생할 수 있다
            this.poisonAttack -= 1;
            System.out.println("추가로, 독 포자를 살포했다!");
            hero.setHp(hero.getHp() / 5);
            System.out.println(hero.getHp() + "포인트의 데미지");
        } else {
            System.out.println("독이 다 떨어짐");
        }
        
    }
    
}

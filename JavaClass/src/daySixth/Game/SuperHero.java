package daySixth.Game;

public class SuperHero extends Hero{
    private boolean flying;
    
    
    public SuperHero() {
        System.out.println("슈퍼히어로 생성자");
    }
    
    public void fly() {
        flying = true;
        System.out.println("난다");
    }
    
    public void land() {
        flying = false;
        System.out.println("착지");
    }
    
    
    @Override
    public void run() {
        System.out.println("퇴각했다");
    }
    
    @Override
    void attack(Kinoko kinoko) {
        // TODO Auto-generated method stub
        super.attack(kinoko);
        if (this.flying) {
            System.out.println(this.getName() + "의 공격");
            System.out.println(kinoko + "에게 5의 데미지를 주었다");
        }
    }
    
    
}

package daySixth.Game;

public class Wand {
    private String name;
    private double power;
    
    public Wand(String name, double power) {
        setName(name);
        setPower(power);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        // 1 마법사나 지팡이의 이름은 null 일 수 없고, 반드시 3문자 이상이어야 한다
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Wand의 이름은 3글자 이상 작성해야 합니다");
        }
        this.name = name;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("마력 범위를 벗어났습니다");
        }
        this.power = power;
    }
    
    
}

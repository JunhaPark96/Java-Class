package daySixth.Game;

public class Computer extends TangibleAsset {
    private String makerName;
    private int weight;

    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    public String getMakerName() {
        return makerName;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight() {}
}

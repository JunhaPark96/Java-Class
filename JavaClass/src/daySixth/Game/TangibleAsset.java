package daySixth.Game;

public abstract class TangibleAsset extends Asset implements Thing {
    private String color;
    private double weight;
    
    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
//
//    public abstract void setWeight();
//
//    public abstract double getWeight();

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    

}

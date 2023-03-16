package daySixth.Game;

public class Book extends TangibleAsset{
    private String isbn;
    private double weight;
    
    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public double getWeight() {
        return weight;
    }

}

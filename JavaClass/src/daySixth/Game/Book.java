package daySixth.Game;

public class Book extends TangibleAsset{
    private String isbn;
    private int weight;
    
    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
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
    public void setWeight() {
        
    }
}

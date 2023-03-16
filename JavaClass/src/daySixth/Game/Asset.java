package daySixth.Game;

public abstract class Asset {
    // 뭘 적어야할지 잘 모르겠습니다
    private String name;
    private int price;

    public Asset() {
        this.name = name;
    }

    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}

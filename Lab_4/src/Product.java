public class Product {
    private String name;
    private int count;
    private int price;

    Product(String name, int count, int price) {
        this.count = count;
        this.name = name;
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

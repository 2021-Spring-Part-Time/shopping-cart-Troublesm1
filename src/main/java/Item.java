public class Item {

    private String name;
    private int price;
    private String quantity;

    public Item(String name, int price, String quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "The item is named " + name + " it cost " + price + "and you ordered " + quantity;
    }
}

package Task3;

public class Product {
    private int id;
    private String name;
    private int quantity;
    public Money price;

    public Product(int id, Money price) {
        this.id = id;
        this.price = price;
    }
    public Product(int id, Money price, String name, int quantity) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }

    public void ShowProduct() {
        System.out.println("---------------");
        System.out.println("Name - " + this.name);
        System.out.println("Quantity - " + this.quantity);
        System.out.println("Price - " + this.price.ShowAmount());
    }

    public void changePrice(int intPart, byte floatPart) throws Exception {
        this.price.setIntPart(intPart);
        this.price.setFloatPart(floatPart);
    }


}

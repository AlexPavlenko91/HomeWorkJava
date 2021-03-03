import java.io.IOException;

public class App3 {
    public static void main(String[] args) throws Exception {
        Money[] money = new Money[10];
        for (int i = 0; i < money.length; i++) {
            int multi = (int) (Math.random() * 1000);
            int randI = (int) (Math.random() * multi);
            byte randF = (byte) (Math.random() * 100);
            if (i % 2 == 0) {
                money[i] = new Money(i + 1, "USD");
            } else {
                money[i] = new Money(i + 1, "EUR");
            }
            money[i].setIntPart(randI);
            money[i].setFloatPart(randF);
            money[i].ShowMoney();
        }

        Money money1 = new Money(11, "UAH");
        money1.setIntPart(12312);
        money1.setFloatPart((byte) 99);
        money1.ShowMoney();

        Product product = new Product(1, money1, "Iphone7", 1);
        product.ShowProduct();

        money1.setIntPart(16000);
        money1.setFloatPart((byte) 0);

        Product product2 = new Product(2, money1);
        product2.setName("Samsung a51");
        product2.setQuantity(2);
        product2.ShowProduct();

        product2.changePrice(15500, (byte) 99);
        product2.ShowProduct();

    }
}

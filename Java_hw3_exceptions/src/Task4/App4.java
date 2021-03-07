package Task4;

public class App4 {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("Samsung", 1.7F, 700);
        kettle.Show();
        kettle.Sound();
        kettle.Desc();
        System.out.println("-----------------");

        Car car = new Car("Audi", "Passenger's", 300, "Diesel", 280);
        car.Show();
        car.Sound();
        car.Desc();
        System.out.println("-----------------");

        Steamship steamship = new Steamship("Sirius", 5000, 100, 50, 40);
        steamship.Show();
        steamship.Sound();
        steamship.Desc();
        System.out.println("-----------------");

        Microwave microwave = new Microwave("Samsung", 15, -100);
        microwave.Show();
        microwave.Sound();
        microwave.Desc();
        System.out.println("-----------------");

    }
}

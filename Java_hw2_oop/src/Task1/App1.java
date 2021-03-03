package Task1;

public class App1 {
    public static void main(String[] args) {
        Human human1 = new Human(1,"Alex", "male", 29, "programmer");
        human1.ShowInfo();

        Human human2 = new Human(2,"Petr");
        human2.ShowInfo();
        human2.ShowInfo(-2);

        Human human3 = new Human();
        human3.ShowInfo();

    }
}

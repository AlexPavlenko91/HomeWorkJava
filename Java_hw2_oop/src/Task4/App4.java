package Task4;

public class App4 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1,2);
        Fraction fraction2 = new Fraction();
        System.out.printf("Fraction first = ");
        fraction1.Show();

        fraction1.Add(2,4);
        System.out.printf("Fraction first = ");
        fraction1.Show();

        fraction2 = fraction1.Add(3,0.5f);
        System.out.printf("Fraction second = ");
        fraction2.Show();

    }
}

package Task1;

import java.time.LocalDate;
import java.time.LocalTime;

public class App1 {
    public static void main(String[] args) {
        mathOperations sum = (x, y, z) -> x + y + z;
        int resSum = sum.calculate(13, 20, 44);
        System.out.println("summa (13, 20, 44 ) = " + resSum);

        mathOperations mul = (x, y, z) -> x * y * z;
        int resMul = mul.calculate(5, 4, 3);
        System.out.println("multiplication (5, 4, 3) = " + resMul);


        printOperations currentDate = dt -> System.out.println(dt);
        currentDate.print("Current date: " + LocalDate.now());

        printOperations currentTime = dt -> System.out.println(dt);
        currentTime.print("Current time: " + LocalTime.now());
    }
}

interface mathOperations {
    int calculate(int x, int y, int z);
}

interface printOperations {
    void print(String s);
}
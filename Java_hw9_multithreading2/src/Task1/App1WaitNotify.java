package Task1;

import java.util.Arrays;

public class App1WaitNotify {
    public static void main(String[] args) {
        SumAverage obj = new SumAverage();
        Thread th1, th2, th3;
        th1 = new Thread(()-> System.out.println(Arrays.toString(obj.fillingArr())));

        th1.start();

        th2 = new Thread(()-> System.out.println("Summa of elements = "+obj.getSum()));
        th2.start();

        th3 = new Thread(()-> System.out.println("Average number = "+obj.getAverage()));
        th3.start();
    }
}

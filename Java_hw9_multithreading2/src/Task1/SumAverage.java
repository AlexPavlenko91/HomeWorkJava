package Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumAverage {
    int[] arr;
    boolean arrFilled = false;

    public synchronized int[] fillingArr() {
        Random rand = new Random();
        int size = rand.nextInt(6) + 2;
        arr = new int[size];
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Please enter " + (i + 1) + " element:");
                arr[i] = scan.nextInt();
            }
            // notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
        arrFilled=true;
        notifyAll();
        return arr;
    }

    public synchronized int getSum() {
        while (!arrFilled)
            try
            {
                wait ();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        return Arrays.stream(arr).sum();
    }

    public synchronized double getAverage()  {
        while (!arrFilled)
            try
            {
                wait ();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        return Arrays.stream(arr).average().getAsDouble();
    }
}

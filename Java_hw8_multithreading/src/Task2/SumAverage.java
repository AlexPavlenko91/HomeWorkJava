package Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumAverage {
    int[] arr;

    public int[] getArr() {
        return arr;
    }

    public int getSum(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    public double getAverage(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }

    public void fillingArr() {
        Random rand = new Random();
        int size = rand.nextInt(8) + 2;
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

    }

}

package Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaxMin {
    int [] arr;

    public int[] getArr() {
        return arr;
    }
    public int getMax(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
    public int getMin(int[] arr){
        return Arrays.stream(arr).min().getAsInt();
    }

    public void fillingArr() {
        Random rand = new Random();
        int size = rand.nextInt(5) + 2;
        arr = new int[size];
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Please enter " + (i + 1) + " element:");
                arr[i] = scan.nextInt();
            }
            //notify();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

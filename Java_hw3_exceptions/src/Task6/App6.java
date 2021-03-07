package Task6;

import java.util.Random;
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Please enter the size of the array:");
            int size = scanner.nextInt();
            System.out.println("Please enter the bigger end (from 0 to your number):");
            int multi = scanner.nextInt();
            Random rand = new Random();
            arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(multi);
                System.out.print(arr[i] + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        Array myArr = new Array(arr);
        System.out.println();
        System.out.println("Max - " + myArr.Max());
        System.out.println("Min - " + myArr.Min());
        System.out.println("Average - " + myArr.Avg());
    }
}

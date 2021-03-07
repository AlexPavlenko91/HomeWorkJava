package Task7;

import Task6.Array;

import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Array newArr = new Array();
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Please enter the size of the array:");
            int size = scanner.nextInt();
            System.out.println("Please enter the bigger end (from 0 to your number):");
            int multi = scanner.nextInt();

            newArr.randFilling(size, multi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        newArr.SortAsc();
        newArr.PrintArr();
        System.out.println("------------");
        newArr.SortDesc();
        newArr.PrintArr();
    }
}

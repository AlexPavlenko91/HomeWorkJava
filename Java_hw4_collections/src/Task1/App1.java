package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            fillingOut(integers, scanner);
            System.out.println(integers);
            int choice = -1;
            while (choice != 0) {
                choice = menu(scanner);
                actions(integers, scanner, choice);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void fillingOut(ArrayList<Integer> integers, Scanner scanner) {
        try {
            System.out.println("Please enter the amount of numbers:");
            int amount = scanner.nextInt();
            for (int i = 1; i <= amount; i++) {
                System.out.println("Please enter the " + i + " number:");
                integers.add(scanner.nextInt());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int menu(Scanner scanner) {
        System.out.println("1. Add an element to the list;");
        System.out.println("2. Delete an element from the list;");
        System.out.println("3. Show the list;");
        System.out.println("4. Check if a value is in the list;");
        System.out.println("5. Change a value in the list;");
        System.out.println("0. Exit.");
        int i = 0;
        try {
            i = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public static void actions(ArrayList<Integer> integers, Scanner scanner, int i) {
        try {
            switch (i) {
                case 0:
                    break;
                case 1: {
                    System.out.println("Please input an element:");
                    int el = scanner.nextInt();
                    integers.add(el);
                    break;
                }
                case 2: {
                    System.out.println("Please enter the number of the element:");
                    int ind = scanner.nextInt();
                    if (ind > integers.size() || ind <= 0) {
                        System.out.println("You've entered a wrong number!");
                        break;
                    }
                    integers.remove(ind - 1);
                    break;
                }
                case 3: {
                    System.out.println(integers);
                    break;
                }
                case 4: {
                    System.out.println("Please input a value:");
                    int val = scanner.nextInt();
                    if (integers.contains(val)) {
                        System.out.println("Yes, an element with this value is in the list");
                        break;
                    }
                    System.out.println("There isn't an element with this value");
                    break;
                }
                case 5: {
                    System.out.println("Please enter the number of the element, you want to change:");
                    int num = scanner.nextInt();
                    if (num > integers.size() || num <= 0) {
                        System.out.println("You've entered a wrong number!");
                        break;
                    }
                    System.out.println("Please enter new value:");
                    int val = scanner.nextInt();
                    integers.set(num - 1, val);
                    break;
                }
                default: {
                    System.out.println("You've entered wrong symbol or number");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

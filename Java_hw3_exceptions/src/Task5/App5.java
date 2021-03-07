package Task5;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        String violinName = "";
        String violinDesc = "";
        String violinHistory = "";
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the name of the Violin:");
            violinName = scanner.nextLine();
            System.out.println("Input the description of the Violin:");
            violinDesc = scanner.nextLine();
            System.out.println("Input the history of the Violin:");
            violinHistory = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Violin violin = new Violin(violinName, violinDesc, violinHistory);
        violin.Sound();
        violin.Show();
        violin.Desc();
        violin.History();
    }
}

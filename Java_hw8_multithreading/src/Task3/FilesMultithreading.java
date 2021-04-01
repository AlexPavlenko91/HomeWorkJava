package Task3;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesMultithreading {
    String path = "Test1.txt", evenStr = "", oddStr = "";
    int[] arr;
    int evenCount = 0, oddCount = 0;

    public int[] getArr() {
        return arr;
    }

    public void inputPath() {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please, enter the path to the file:");
            path = scan.next();
            //notify();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void getArrFromFile() {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(path)));
            String[] exploded = content.split(",");

            arr = new int[exploded.length];

            for (int i = 0; i < exploded.length; i++) {
                arr[i] = Integer.parseInt(exploded[i]);
                if (arr[i] % 2 == 0) {
                    evenStr += (exploded[i] + ", ");
                    evenCount++;
                } else {
                    oddStr += (exploded[i] + ", ");
                    oddCount++;
                }
            }

            System.out.println("evenStr = " + evenStr);
            System.out.println("oddStr = " + oddStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int writeEvenNumbers() {
        try {
            FileWriter myWriter = new FileWriter("evenNumbers.txt");
            myWriter.write(evenStr);
            myWriter.close();
            System.out.println("Successfully wrote to the \"evenNumbers.txt\": " + evenCount + " numbers");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return evenCount;
    }
    public int writeOddNumbers() {
        try {
            FileWriter myWriter = new FileWriter("oddNumbers.txt");
            myWriter.write(oddStr);
            myWriter.close();
            System.out.println("Successfully wrote to the \"oddNumbers.txt\": " + oddCount + " numbers");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return oddCount;
    }
}

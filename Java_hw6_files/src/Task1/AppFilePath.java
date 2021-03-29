package Task1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AppFilePath {
    public static void main(String[] args) {

        String pathName = "";
        try (Scanner scanPath = new Scanner(System.in)) {
            System.out.println("Please enter the path to a file:");
            pathName = scanPath.next();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner( new File(pathName), StandardCharsets.UTF_8)) {
            String text = scanner.useDelimiter("\\A").next();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

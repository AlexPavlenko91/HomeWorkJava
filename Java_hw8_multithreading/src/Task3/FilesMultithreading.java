package Task3;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;
import java.util.Scanner;

public class FilesMultithreading {
    String path;
    public void inputPath() {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please, enter the path to the file:");
            path = scan.next();
            //notify();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /*public void getArrFromFile(){
        String content = "";

        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }*/
}

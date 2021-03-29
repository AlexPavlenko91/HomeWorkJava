package Task5;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppReplaceWords {
    public static String text;

    public static void main(String[] args) {
        String pathName = "", searchWord = "", replaceWord = "";
        try (Scanner scanPath = new Scanner(System.in)) {
            System.out.println("Please enter the path to a file:");
            pathName = scanPath.next();
            System.out.println("Please enter a word that you want to find:");
            searchWord = scanPath.next();
            System.out.println("Please enter a word that you want to replace:");
            replaceWord = scanPath.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        //pathName = Select the file and push the shortcut: CTRL+SHIFT+C

        try (Scanner scanner = new Scanner(new File(pathName), StandardCharsets.UTF_8)) {
            text = scanner.useDelimiter("\\A").next();
            System.out.println(text);
            System.out.println("=========================");

            int matches = 0;
            Matcher matcher = Pattern.compile("\\b" + searchWord + "\\b", Pattern.CASE_INSENSITIVE).matcher(text);
            while (matcher.find()) matches++;

            text = Pattern.compile("\\b" + searchWord + "\\b", Pattern.CASE_INSENSITIVE).matcher(text).replaceAll(replaceWord);

            System.out.println(text);
            System.out.println("=========================");
            System.out.println("There was find and replaced: " + matches + " words");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

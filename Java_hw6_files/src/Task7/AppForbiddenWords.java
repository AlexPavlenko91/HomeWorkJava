package Task7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppForbiddenWords {
    static String pathName = "";
    static List<String> forbiddenWords;
    static String text = "";

    public static void main(String[] args) {

        forbiddenWords = getWords();
        try (Scanner scan = new Scanner(System.in)) {
            int i = -1;
            while (i != 0) {
                i = menu(scan);
                actions(scan, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static int menu(Scanner scanner) {
        System.out.println("1. Change the path;");
        System.out.println("2. Cut forbidden words from the file and show details;");
        System.out.println("3. Add new word to the forbidden list;");
        System.out.println("4. Delete a word from the forbidden list;");
        System.out.println("5. Show forbidden list;");
        System.out.println("6. Show file content1;");
        System.out.println("0. Exit.");
        int i = 0;
        try {
            i = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public static void actions(Scanner scanner, int i) {
        try {
            switch (i) {
                case 0:
                    break;
                case 1: {
                    pathName = scanner.next();
                    break;
                }
                case 2: {
                    for (String forbiddenWord : forbiddenWords) {
                        System.out.println("The word \"" + forbiddenWord + "\" have been cut: "
                                + writeAndGetInfo( forbiddenWord) + " times");
                    }
                    break;
                }
                case 3: {
                    forbiddenWords.add(scanner.next());
                    break;
                }
                case 4: {
                    try {
                        System.out.println("Enter the number of the word:");
                        forbiddenWords.remove(scanner.next());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 5: {
                    System.out.println(forbiddenWords);
                    break;
                }
                case 6:{
                    getStrFromFile();
                    System.out.println(text);
                    break;
                }
                default: {
                    System.out.println("You've entered a wrong symbol or number");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<String> getWords() {

        List<String> forbiddenWords = new ArrayList<>();

        return forbiddenWords;
    }

    public static int writeAndGetInfo( String searchWord) {
        int matches = 0;

        getStrFromFile();

        Matcher matcher = Pattern.compile("\\b" + searchWord + "\\b",
                Pattern.CASE_INSENSITIVE).matcher(text);

        while (matcher.find()) matches++;

        text = Pattern.compile("\\b" + searchWord + "\\b",
                Pattern.CASE_INSENSITIVE).matcher(text).replaceAll("");

        try (OutputStream out = new FileOutputStream(pathName)) {
            out.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


        return matches;
    }

    public static void getStrFromFile() {

        try (Scanner scanFile = new Scanner(new File(pathName), StandardCharsets.UTF_8)) {
            text = scanFile.useDelimiter("\\A").next();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

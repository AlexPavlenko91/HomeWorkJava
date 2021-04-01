package Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchByWordInFile {
    String path = "Text2.txt", word = "";
    Map<Integer, Integer> statistic = new HashMap<>();
    public String getPath() {
        return path;
    }

    public String getWord() {
        return word;
    }
    public Map<Integer, Integer> getStatistic(){
        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            int numberStr = 1;
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                int count = 0;

                Matcher matcher = Pattern.compile("\\b" + word + "\\b",
                        Pattern.CASE_INSENSITIVE).matcher(sCurrentLine);
                while (matcher.find()) {
                    count++;
                }

                statistic.put(numberStr, count);
                numberStr++;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return statistic;
    }

    public void inputPathAndWord() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the path to the word:");
            path = scan.next();
            System.out.println("Enter the word, that you want to find:");
            word = scan.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

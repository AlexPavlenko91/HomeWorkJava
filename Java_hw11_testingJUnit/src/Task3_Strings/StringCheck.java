package Task3_Strings;

import java.util.Arrays;
import java.util.Collections;

public class StringCheck {
    public boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        return str.equals(rev);
    }

    public int checkingVowels(String str) {
        String vowels = "aeiouAEIOU";
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (vowels.indexOf(currentChar) >= 0)
                vowelCount++;

        }
        return vowelCount;
    }

    public int checkingConsonants(String str) {
        String vowels = "aeiouAEIOU";
        int consCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isLetter(currentChar) && vowels.indexOf(currentChar) < 0)
                consCount++;
        }
        return consCount;
    }

    public int occurrences(String word, String str) {
        int count = 0;
        count = Collections.frequency(Arrays.asList(str.split(" ")), word);
        return count;
    }
}

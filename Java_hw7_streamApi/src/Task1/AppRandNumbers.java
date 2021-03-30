package Task1;

import java.util.Arrays;
import java.util.Random;

public class AppRandNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(10) + 5;
        int[] arrRand = new int[size];
        //int[] arrRand = new int[]{111,2222,11,3223,40104};
        for (int i = 0; i < arrRand.length-2; i++) {
            arrRand[i] = rand.nextInt(2000) - 1000;
        }
        arrRand[arrRand.length-2] = 3223;
        arrRand[arrRand.length-1] = 40104;
        System.out.println("arrNum = " + Arrays.toString(arrRand));

        System.out.println("Number of positive = " + Arrays.stream(arrRand).filter(a -> a > 0).count());
        System.out.println("Number of negative = " + Arrays.stream(arrRand).filter(a -> a < 0).count());

        System.out.println("Number of two-digit = "
                + Arrays.stream(arrRand).filter(a -> (a >= 10 && a <= 99)).count());

        System.out.println("Number of mirrored numbers = "
                + Arrays.stream(arrRand).filter(a -> {
            String str = (String.valueOf(a));
            String firstPart = str.substring(0, str.length() / 2);
            String secondPart;
            if (str.length() % 2 == 0) {
                secondPart = new StringBuilder(str.substring(str.length() / 2)).reverse().toString();
            } else {
                secondPart = new StringBuilder(str.substring(str.length() / 2 + 1)).reverse().toString();
            }
            return firstPart.equals(secondPart);
        }).count());

    }
}

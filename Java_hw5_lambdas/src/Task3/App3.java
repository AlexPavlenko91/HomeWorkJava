package Task3;

import java.util.Arrays;

public class App3 {
    public static void main(String[] args) {
        MathOperations<Integer> max3 = (x, y, z) -> {
            int arr[] = {x, y, z};
            return Arrays.stream(arr).max().getAsInt();
        };
        int maxFrom3Num = max3.calculate(1, 8, 8);
        System.out.println("maxFrom (1, 8, 8) = " + maxFrom3Num);

        MathOperations<Integer> min3 = (x, y, z) -> {
            int arr[] = {x, y, z};
            return Arrays.stream(arr).min().getAsInt();
        };
        int minFrom3Num = min3.calculate(3, 8, 1);
        System.out.println("minFrom (3, 8, 1) = " + minFrom3Num);
    }
}

interface MathOperations<T extends Number> {
    T calculate(T x, T y, T z);
}
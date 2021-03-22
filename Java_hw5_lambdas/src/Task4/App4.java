package Task4;

public class App4 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 5, 3, 10};

        int sumEven = arrSum(((x) -> (x % 2) == 0), arr);
        System.out.println("sumEven = " + sumEven);

        int sumOdd = arrSum(((x) -> (x % 2) != 0), arr);
        System.out.println("sumOdd = " + sumOdd);

        int sumFromAtoB = arrSum(((x) -> (x > 1 && x < 10)), arr);
        System.out.println("sumFromAtoB = " + sumFromAtoB);

        int sumMultiplicityA = arrSum(((x) -> (x % 3) == 0), arr);
        System.out.println("sumMultiplicityA = " + sumMultiplicityA);
    }


    public static <T extends Number> int arrSum(CheckInterface condition, T[] anArray) {
        int sum = 0;
        for (T t : anArray) {
            if (condition.check((int) t)) {
                sum += (int) t;
            }
        }
        return sum;
    }
}

interface CheckInterface {
    boolean check(int num);
}


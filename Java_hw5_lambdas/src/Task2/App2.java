package Task2;

public class App2 {
    public static void main(String[] args) {
        MathOperations max = (int x, int y) -> {
            if (x > y) return x;
            else return y;
        };
        System.out.println("max number between (7, 10) = " + max.calculate(7, 10));

        MathOperations min = (int x, int y) -> {
            if (x < y) return x;
            else return y;
        };
        System.out.println("min number between (2, 8) = " + min.calculate(2, 8));

        GetFactorial getFactorial = (int num) -> {
            int res = 1;
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
            return res;
        };
        int num1 = 4;
        System.out.println("Factorial of " + num1 + " is: " + getFactorial.calculate(num1));

        PrimeNumCheck primeNumCheck = (int num) -> {
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            return !flag;
        };
        int myNum = 29;
        if (primeNumCheck.calculate(myNum)) System.out.println(myNum + " - is a prime number");
        else System.out.println(myNum + " - is not a prime number");
    }
}

interface MathOperations {
    int calculate(int x, int y);
}

interface GetFactorial {
    int calculate(int x);
}

interface PrimeNumCheck {
    boolean calculate(int x);
}
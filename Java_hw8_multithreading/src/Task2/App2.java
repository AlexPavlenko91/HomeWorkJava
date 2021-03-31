package Task2;

public class App2 {
    public static void main(String[] args) throws InterruptedException {
        SumAverage obj = new SumAverage();
        obj.fillingArr();

        Thread thread1 = new Thread(() -> System.out.println("Sum = " + obj.getSum(obj.getArr()) + "; "
                + Thread.currentThread().getName()));
        //thread1.join();
        thread1.start();

        Thread thread2 = new Thread(() -> System.out.println("Average = " + obj.getAverage(obj.getArr()) + "; "
                + Thread.currentThread().getName()));
        //thread2.join();
        thread2.start();

        System.out.println(Thread.currentThread().getName() + " closed");

    }
}

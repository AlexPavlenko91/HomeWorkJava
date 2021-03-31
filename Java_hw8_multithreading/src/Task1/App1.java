package Task1;

public class App1 {


    public static void main(String[] args) throws InterruptedException {
        MaxMin obj = new MaxMin();

        obj.fillingArr();

        Thread thread1 = new Thread(() -> System.out.println("Max element = " + obj.getMax(obj.getArr())));
        //thread1.wait();   //По каким-то причинам потоки Thread1 и Thread2 не запускаются пока не выполнится  obj.fillingArr()
                            //по этому wait() не нужен. ??
        thread1.start();
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        System.out.println("thread1 = " + thread1.getName());

        Thread thread2 = new Thread(() -> System.out.println("Min element = " + obj.getMin(obj.getArr())));
       // thread2.wait();   //?

        thread2.start();
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        System.out.println("thread2 = " + thread2.getName());

        System.out.println(Thread.currentThread().getName()+" closed");
    }



}

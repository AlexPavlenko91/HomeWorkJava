package Task3;

public class App3 {
    public static void main(String[] args) {
        FilesMultithreading obj = new FilesMultithreading();

        obj.inputPath();
        obj.getArrFromFile();
        System.out.println();
        new Thread(() -> System.out.println("Even = " + obj.writeEvenNumbers() + "; "
                + Thread.currentThread().getName())).start();

        new Thread(() -> System.out.println("Odd = " + obj.writeOddNumbers() + "; "
                + Thread.currentThread().getName())).start();

    }
}

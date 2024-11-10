package HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        HelloworldPrinter hwp = new HelloworldPrinter();

        System.out.println("Main : " + Thread.currentThread().getName());

        Thread t1 = new Thread(hwp);
        t1.start();
        System.out.println("Main : " + Thread.currentThread().getName());
    }
}

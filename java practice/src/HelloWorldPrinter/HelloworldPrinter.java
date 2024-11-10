package HelloWorldPrinter;

public class HelloworldPrinter implements Runnable {
    @Override
    public void run(){
        System.out.println("Hello World : " + Thread.currentThread().getName());
    }
}

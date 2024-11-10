package Print1to100InSingleThread;

public class Client {
    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber();
        Thread t = new Thread(pn);
        t.start();
    }
}

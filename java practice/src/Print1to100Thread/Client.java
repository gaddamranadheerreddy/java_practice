package Print1to100Thread;

public class Client {
    public static void main(String[] args) {

        for(int i=1; i<100; i++){
            numberPrinter np = new numberPrinter(i);
            Thread t = new Thread(np);
            t.start();
        }
    }
}

package Print1to100Thread;

public class numberPrinter implements Runnable {

    private int number;
    public numberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Printing from Thread : "+ Thread.currentThread().getName() + " - Number - " + number);
    }
}

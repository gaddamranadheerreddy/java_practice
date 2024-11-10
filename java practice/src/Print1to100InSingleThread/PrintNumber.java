package Print1to100InSingleThread;

public class PrintNumber implements Runnable {

    @Override
    public void run(){
        for(int i=0;i<100;i++) {
            System.out.println("Printing Number in : " + Thread.currentThread().getName() + " -Number- " + i);
        }
    }
}

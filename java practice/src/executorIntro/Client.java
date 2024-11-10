package executorIntro;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        Executor ex = Executors.newFixedThreadPool(4);
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=1;i<=100;i++){
            if(i==2 || i==20){
                System.out.println("Debug");
            }

            NumberPrinter np = new NumberPrinter(i);
//            ex.execute(np);
            executorService.execute(np);
        }

        executorService.shutdown(); //terminates the process after finishing the job.
    }
}

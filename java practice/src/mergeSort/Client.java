package mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {

//        List<Integer> list = new ArrayList<>();
//        list.add(2);

        List<Integer> list = List.of(2,5,1,3,4,6,8,7);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sort = new Sorter(list,executorService);
//        System.out.println(sort.call());

//        ExecutorService executorService = Executors.newCachedThreadPool();

//        List<Integer> sortedArray = sort.call();
//        List<Integer> sortedArray = executorService.submit(sort); //--> gives error
        //so use futures as to have an empty bucket
        Future<List<Integer>> sortedArrayFuture = executorService.submit(sort);

        System.out.println("Doing some work ");
        System.out.println("Doing some more work with Future<> ");

        System.out.println(sortedArrayFuture.get());
        //this prints the value if the box is not empty,
        //If the box is empty, it will wait till the box gets filled. here box is list<Integer>

//        executorService.shutdown();

    }
}

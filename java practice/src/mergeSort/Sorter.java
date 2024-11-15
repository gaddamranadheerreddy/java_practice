package mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executorService;
    public Sorter(List<Integer> array, ExecutorService exS){
        arrayToSort = array;
        executorService = exS;
    }

    @Override
    public List<Integer> call() throws Exception {

        //base condition in merge sort.
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }

        int mid  = arrayToSort.size()/2;

        List<Integer> leftArray = new ArrayList<>();
        for(int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for(int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

        Sorter leftSorter = new Sorter(leftArray, executorService);
        Sorter rightSorter = new Sorter(rightArray, executorService);

        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightSorter);

//        List<Integer> leftSortedArray = leftSorter.call();
//        List<Integer> rightSortedArray = rightSorter.call();

        //Merge Logic
        int i=0;
        int j=0;
        List<Integer> sortedArray = new ArrayList<>();

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

//        //Merge Logic
//        int i=0;
//        int j=0;
//        List<Integer> sortedArray = new ArrayList<>();

        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)<rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else{
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while(i<leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j<rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}

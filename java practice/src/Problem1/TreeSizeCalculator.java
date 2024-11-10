package Problem1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

//Calculating Binary tree size
public class TreeSizeCalculator implements Callable<Integer> {
    private Node root;
    private ExecutorService executorService;
    public TreeSizeCalculator(Node root, ExecutorService exS) {
        this.root = root;
        executorService = exS;
    }

    @Override
    public Integer call() throws Exception {
        if(root == null){
            return 0;
        }

        TreeSizeCalculator leftSize = new TreeSizeCalculator(root.left, executorService);
        TreeSizeCalculator rightSize = new TreeSizeCalculator(root.right, executorService);

        Future<Integer> leftSizeFuture = executorService.submit(leftSize);
        Future<Integer> rightSizeFuture = executorService.submit(rightSize);

        return 1 + leftSizeFuture.get() + rightSizeFuture.get();
    }
}

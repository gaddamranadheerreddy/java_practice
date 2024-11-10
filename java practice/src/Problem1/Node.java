package Problem1;

public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(){
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

/*
**Raw Problem**
Write code to achieve the following
A class Node to represent the Node of a BinaryTree.
Node should have two properties - left and right of type Node.
Node should also have an integer property - data.
Create a class TreeSizeCalculator to calculate the size of a BinaryTree using multiple threads.
TreeSizeCalculator constructor will be passed the root of the tree and ExecutorService to make new threads.
TreeSizeCalculator should implement Callable<Integer> interface.
*/

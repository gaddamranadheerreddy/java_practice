package Threads;

public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); //prints "main" thread method .
        print();
    }

    public static void print(){
        System.out.println("Printing from Thread: " + Thread.currentThread().getName());
    }
}

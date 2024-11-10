package syncIntro;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        count.val = 0; //can work same without this line as well
        //because primitive data types gets initiated with default values if not mentioned.

        Add add = new Add(count);
        Subtract subtract = new Subtract(count);

        Thread t1 = new Thread(add);
        Thread t2 = new Thread(subtract);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        //join() method - here waiting till the finishing/completing the threads t1,t2.

        System.out.println(count.val);

        /*
            This is how an operation works in java:
            x = x + 1
            temp <- x //copies x value to an temp variable
            temp = temp + 1
            x <- temp // gives back updated temp value to x;

         */
    }
}

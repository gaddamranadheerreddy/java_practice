package syncIntro;

public class Add implements Runnable {
    private Count count;
    public Add(Count c ){
        count  = c;
    }

    @Override
    public void run(){
        for(int i=1;i<10000;i++){
            count.val += i;
        }
    }
}

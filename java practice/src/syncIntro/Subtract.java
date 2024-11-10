package syncIntro;

public class Subtract implements Runnable {
    private Count count;
    public Subtract(Count c){
        count = c;
    }
    @Override
    public void run(){
        for(int i=1;i<=10000;i++){
            count.val -= i;
        }
    }
}

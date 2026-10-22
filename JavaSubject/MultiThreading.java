class ChildThread extends Thread
{
public void run()
    {
        for(int i = 1; i<= 100; i++)
        {
            System.out.println("child " + i);
        }
    }
}
public class MultiThreading {
    
    public static void main(String[] args) {
        ChildThread obj = new ChildThread();
        obj.start();
        for(int i = 1; i<= 100; i++)
        {
            System.out.println("main " + i);
        }


    }
}

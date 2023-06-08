class Counter
{
    int count;
    public synchronized void increment() //synchronized key word only one thread  works with it one time
    {                                      // when t1 is working t2 will wait
        count ++;
    }
}
public class Demo {
    public static void main(String a[]) throws InterruptedException{
        Counter c = new Counter();
        // able to convert into lambda expression because Runnable is funtional interface, means only one method.
        Runnable obj1 = () ->
                {
                    for(int i=1; i<=10000;i++)
                    {
                        c.increment();
                    }
                };
        Runnable obj2 = () ->
        {
            for(int i=1; i<=10000;i++)
            {
                c.increment();
            }
        };
       // obj1.start();  // not works beacause its method of thread class
        Thread t1 = new Thread(obj1); // constructor public Thread(Runnable task)
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join(); // main thread wait for t1 thread to join
        t2.join();
        System.out.println(c.count); // main says i have started two threads then i go to sout 
    }
    
}
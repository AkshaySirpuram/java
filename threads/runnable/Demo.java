
// class A implements Runnable
// {
//     public void run()
//     {
//         for(int i=1; i<=5;i++)
//         {
//             System.out.println("hi");
//             try 
//             {
//                 Thread.sleep(10); // in milliseconds
//             } 
//             catch (InterruptedException e) 
//             {
//                 e.printStackTrace();
//             } 
//         }
//     }
// }
// scheduler in os, scheduler it is schedule a job to allow which thread to execute on the OS
class B implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5;i++)
        {
            System.out.println("hello");
            try 
            {
                Thread.sleep(10); // in milliseconds
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            } 
        }
    }
}
public class Demo {
    public static void main(String a[]) {
        // able to convert into lambda expression because Runnable is funtional interface, means only one method.
        Runnable obj1 = () ->
                {
                    for(int i=1; i<=5;i++)
                    {
                        System.out.println("hi");
                        try 
                        {
                            Thread.sleep(10); // in milliseconds
                        } 
                        catch (InterruptedException e) 
                        {
                            e.printStackTrace();
                        } 
                    }
                };
        Runnable obj2 = new B();
       // obj1.start();  // not works beacause its method of thread class
        Thread t1 = new Thread(obj1); // constructor public Thread(Runnable task)
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
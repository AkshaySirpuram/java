//threads
//software1,software2 -> multitasking
//os -> scheduler
// Hard ware -> cpu-4cores & 4vcores = 8cores or 8 threads,ram
class A extends Thread
{
    public void run()
    {
        for(int i=1; i<=100;i++)
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
    }
}
// scheduler in os, scheduler it is schedule a job to allow which thread to execute on the OS
class B extends Thread
{
    public void run()
    {
        for(int i=1; i<=100;i++)
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
        A obj1 = new A(); //not object they are threads now
        B obj2 = new B();
        System.out.println(obj2.getPriority()); //1 to 10 priority 1 is least  10 is highest 5 is default
        //obj2.setPriority(Thread.MAX_PRIORITY);
        //or obj2.setPriority(10); // only suggesting to scheduler
        //or obj2.setPriority(Thread.MAX_PRIORITY - 1); = 9
        obj1.start();
         try 
             {
                 Thread.sleep(5); // in milliseconds
             } 
             catch (InterruptedException e) 
             {
                 e.printStackTrace();
             } 
        obj2.start();  // run this 2 methods in prallel
    }
    
}
// all decided by scheduler

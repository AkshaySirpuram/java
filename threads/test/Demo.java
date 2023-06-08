class A 
{   
    public void show()
    {
        for (int i=1; i<=10;i++)
        {
            System.out.println("hi");
            try 
            {
                Thread.sleep(1000); // in milliseconds
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            } 
        }
    }
}
class B 
{   public void show()
    {
        for (int i=1; i<=10;i++)
        {
          System.out.println("hello");
        }
}
}
public class Demo {
    public static void main(String a[]) {
    A obj1 = new A();
    B obj2 = new B();
    obj1.show();
    try 
    {
        Thread.sleep(10); // in milliseconds
    } 
    catch (InterruptedException e) 
    {
        e.printStackTrace();
    } 

    obj2.show();
    }
}

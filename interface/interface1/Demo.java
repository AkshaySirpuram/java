 //class - class -> extends
 //class - interface ->  implements
 //interface - interface -> extends
 interface A  // interface just show u design
{
    int age = 10; //  variables in interface  by default final and static
    String area ="Mumbai";
    void show(); //by default public abstract
    void config();
}
interface X
{
    void run();
}
interface Y extends X
{

}
class B implements A,Y // if u failed to define both methods it becomes abstract class
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run()
    {
        System.out.println("running..");
    }

}
public class Demo 
{
    public static void main(String a[]) 
    {   
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        X obj1 = new B();
        obj1.run();
        System.out.println(A.area);
    }    
}

abstract class A 
{
    abstract public void show();
    abstract public void config();
}
public class Demo {
    public static void main(String a[]) {
        A obj = new A()  //we are creating object of Anonymous inner class 
        {
            public void show()  
            {
                System.out.println("in new show");  //Anonymous inner class  because inside Demo class
            }
            public void config()  
            {
                System.out.println("in new config");  //Anonymous inner class  because inside Demo class
            }
        };
        obj.show();
        obj.config();
    }
    
}

class A 
{
    int age;
    public void show()
    {
        System.out.println("in show");
    }
}
public class Demo {
    public static void main(String a[]) {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in new show");  //inner class  because inside Demo class
            }
        };
        obj.show();
    }
    
}
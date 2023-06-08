
class A 
{   
    public void show() throws ClassNotFoundException
    {
        Class.forName("Calc");
    }
}
public class Demo {
        static // static block
        {
            System.out.println("Class Loaded");
        }
        public static void main(String a[])
        {
            A  obj = new A();
            try{
               obj.show();    //throws here
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();  // u can track entire stack ex: which method calling which method
            }
        }
}
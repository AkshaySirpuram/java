class A 
{
    int age;
    public void show()
    {
        System.out.println("in show");
    }


    static class B  ///class B belongs to class A
    {                // static can be used with inner class
        public void config()
        {
            System.out.println("in config");
        }
    }

}
public class Demo {
    public static void main(String a[]) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        A.B obj2 = new A.B();  // static
        obj2.config();
        //obj2.show(); not work
    }
    
}

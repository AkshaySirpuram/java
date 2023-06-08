
// Dynamic method Dispatch
class D
{
    public void show()
    {
        System.out.println(" in A show");
    }
}

class B extends D
{
    public void show()
    {
        System.out.println(" in B show");
    }
}
class C extends D
{
    public void show()
    {
        System.out.println(" in C show");
    }
}

public class Ak {
    public static void main(String ak[])
    {
        D obj = new D();
        obj.show();   // same object which is obj.show behaving differently with different objects
                        //runntime polymorphism
        obj = new B();   // only we have chiled objects of parent variablels

        obj.show();     // here

        obj = new C();
        obj.show();     //here
    }
    
}

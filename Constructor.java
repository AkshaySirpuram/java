class A extends Object
{
    public A()
    {
        super();   //every class has default constructor
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A int");
    }

}
class B extends A  //multilevel 
{
    public B() 
    {
      //  super(5);    // calls super class parameterized constructor
      System.out.println("in B");
    }
    public B(int n)
    {
       // super(n);   //every constructor has super method even you not specify aslo
        // super means call the constructor of super class
        this();   //excicute the construtor of same class
        System.out.println("in B int");
    }
}

public class Constructor 
{
    public static void main(String ar[])
    {
      //  B obj = new B();
        B obj1  = new B(5);
    }
}

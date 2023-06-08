class A 
{
    public void showTheDataWhichBelongsTOThisClass() // class
    {
        System.out.println("in A show");
    }
}
class B extends A
{                                         //check spelling
    @Override  //show the your intension with the help of annotaion
    //public void showTheDataWhichBelongsTOThisClasss()  //classs
    public void showTheDataWhichBelongsTOThisClass()
    {
        System.out.println("in B show");
    }
}
public class Demo {
    public static void main(String a[]) {
        B obj = new B();
        obj.showTheDataWhichBelongsTOThisClass();
    }
    
}

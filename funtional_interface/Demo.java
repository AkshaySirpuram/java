package java.funtional_interface;
// SAM - single abstract method interface 
//funtional interface has only one method
@FunctionalInterface
interface A
{
    void show();
}
// class B implements A
// {
//     public void show()
//     {
//         System.out.println("in show");
//     }
// }

public class Demo 
{
    public static void main(String a[]) {

        A obj = new A()  //we are able to instantiate A whit the help of a Anonymous inner class
        {   
            public void show()   // and we are able to call the method
            {
                System.out.println("in show");
            }
        };
        obj.show();
    }
    
}
// in java 8 new  feature called Lambda expressions
//java is no more verbose, to reduce the bugs
// verbose means specifying everything making detailed code 
//we can use Lambda expression only with funtional interface  
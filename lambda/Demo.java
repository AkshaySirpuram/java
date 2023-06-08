// SAM - single abstract method interface 
//funtional interface has only one method

// in java 8 new  feature called Lambda expressions
//java is no more verbose, to reduce the bugs
// verbose means specifying everything making detailed code 
//we can use Lambda expression only with funtional interface  

@FunctionalInterface
interface A
{
    void show(int i);
}

public class Demo 
{
    public static void main(String a[]) {

        // A obj = new A()   //we are able to instantiate A whit the help of a Anonymous inner class
        // {   
        //     public void show(int i)  // and we are able to call the method
        //     {
        //         System.out.println("in show" + i);
        //     }
        // };
        //  obj.show(5);
        // syntactically the code is getting reduced
        A obj = (int i) ->  
                // -> is lambda expression
            {
                System.out.println("in show" + i);
                System.out.println("in show");
            };
        obj.show(5);

        // for one statement we can use below
        // when u know variable type is int why to mention it. (int i)--> (i)
        // if we have one variable we don't even mention brackets. (i) --> i
        A obj1 = i ->  System.out.println("in show" + i);
        obj1.show(10);
    }
    
}

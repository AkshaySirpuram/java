class AkshayException extends Exception // or extend RuntimeException
{
    public AkshayException(String string)
    {
        super(string);  //calling super class constructor
    }
}
public class Demo {
    public static void main(String a[])
    {
        try
        {
          Class.forName("Calc");  // try with Demo
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Not able to find the class");
        }
        int i = 20;
        int j = 0;
        try         
        {
            j = 18/i;
            if(j==0)
                throw new AkshayException("passing a message in the constructor  18/20");  //throw the exception
            // throw ->key word //creating ArithmeticException Object using new key word, and passing message to constructor
        }
        catch(AkshayException e) //do //excecuted only when exception occurs ///catches the exception
        {
            j =18/1;
            System.out.println("thats the default output "+e);
        }
        catch(Exception e) //bottom
        {
            System.out.println("Something Went Wrong. " + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
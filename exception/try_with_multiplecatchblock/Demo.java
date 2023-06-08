
public class Demo {
    public static void main(String a[]) {
        int i = 0;
        int j = 0;
        int nums[] = new int[5];
        String str = null;
        try         // if exception occurs
        {
            //j = 18/i;  // jump after try block
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e) //do //excecuted only when exception occurs
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit.");
        }
        catch(Exception e) //bottom
        {
            System.out.println("Something Went Wrong. " + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
    
}
// (Exception e) -> is a parent class

public class Demo {
    public static void main(String a[]) {
        int i = 0;
        int j = 0;
        try         // if exception occurs
        {
            j = 18/i;
        }
        catch(Exception e) //do //excecuted only when exception occurs
        {
            System.out.println("Something Went Wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
    
}

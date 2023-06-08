import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo 
{
    public static void main(String a[]) throws IOException
    {
        System.out.println("Enter a number"); 
        // println() is method of PrintStream class, out is object of PrintStream class which is defined in System class
        // package java.lang;
        // public final class System {
        // public static final PrintStream out;
        // }
        //
        // package java.io;
        // public class PrintStream extends java.io.FilterOutputStream implements java.lang.Appendable, java.io.Closeable {
        // public void println() {}
        // }
        // int num = System.in.read(); //read method gives ascii value     //in is object of InputStream ->public static final java.io.InputStream in;
        InputStreamReader in = new InputStreamReader(System.in); // passing InputStream object
        BufferedReader bf = new BufferedReader(in); //passing object of Reader class
        int num = Integer.parseInt(bf.readLine()); //readLine will give string, using parseInt to convert into int.
        System.out.println(num);
        bf.close();
        //
        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // System.out.println(num1);
        
     }
}

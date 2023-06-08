import java.util.ArrayList; // java internaly has lot of inbuild classes
//here its package java folder util folder ArrayList class
//import java.
import tools.VeryAdvCalc;
public class Demo {
    public static void main(String a[]) {
        ArrayList List = new ArrayList();   // java internaly has lot of classes
        VeryAdvCalc obj = new VeryAdvCalc(); 
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7,3);
        int r3 = obj.multi(5,3);
        int r4 = obj.div(15,4);
        double r5 = obj.power(4,2);
        System.out.println(r1 + " " + r2 +" " + r3 +" " +r4+" "+r5);
        // import java.lang.Systerm;
        // import java.lang.*;  u can import all files
        obj.show();  //method overriding
    }
}

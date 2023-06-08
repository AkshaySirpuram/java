
class Calculator {
    int g; // g is instance variable

    public int add(int n1, int n2) // n1 & n2 are local variables
    {
        int as = n1 + n2;
        return as;
    }
    int rollno;
    static String name; //static variable  
    int marks;
   
    public static void show(Calculator m)      //static method  //accepting object 
    {
        System.out.println(name + " " + m.rollno + " " + m.marks);
    }

}
class Mobile
{   
    int price;
    String brand;
    static String name; 

    static    //used to initialize static variables // calls only one time and called first 
    {
        name = "Phone";    //  call static block only onces irespectively how may objects u create
        System.out.println("in static block");
    }
    public Mobile()      //constructor
    {
        price = 10;           // calls and intitalized for each object creation
        brand = "";
        System.out.println("in constructor");
    }
    static void show1()
    {
        System.out.println("hello");
    }
}


public class Object {
    /**
     * @param a
     * @throws ClassNotFoundException
     */
    public static void main(String a[]) throws ClassNotFoundException {
        int af = 6; // local variable because its inside main method
        int ak = 8; // af is primitive variable
        Calculator calc = new Calculator(); // calc is refrence variable
        // calculator type variable // calulator type object
        int result = calc.add(af, ak);
        System.out.println(result);
        int ar[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                ar[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        double am = Math.random();
        System.out.println(am);
        for (int n[] : ar) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        // jagged arrray
        System.out.println("jagged arrray");

        int ay[][] = new int[3][];

        ay[0] = new int[3];
        ay[1] = new int[4];
        ay[2] = new int[2];

        for (int i = 0; i < ay.length; i++) {
            for (int j = 0; j < ay[i].length; j++) {
                ay[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int n[] : ay) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }


        System.out.println("3D arrray");

        int an[][][] = new int[4][3][2];

        for (int i = 0; i < an.length; i++) 
        {
            for (int j = 0; j < an[i].length; j++) 
            {
                for (int k =0;k< an[i][j].length;k++)
                {
                    an[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }
        for (int n[][] : an) 
        {
            for (int m[] : n) 
            {
                for (int k : m)
                {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
        System.out.println(an[0][0][0]);
        System.out.println(an[0][0]);
        
        // Array of objects

        Calculator s1 = new Calculator();
        s1.rollno = 1;
        s1.name ="Akshay";
        s1.marks = 88;

        Calculator s2 = new Calculator();
        s2.rollno = 2;
        s2.name = "Avinash";
        s2.marks = 89;

        Calculator s3 = new Calculator();
        s3.rollno = 3;
        s3.name ="Anand";
        s3.marks = 90;
        Calculator cal1[] = new Calculator[3];
        cal1[0] = s1;
        cal1[1] = s2;
        cal1[2] = s3;

        for(int i=0;i<cal1.length;i++)
        {
            System.out.println(cal1[i].name + " : " +cal1[i].marks);
        }
        for(Calculator cal2 : cal1)
        {
            System.out.println(cal2.name + " " + cal2.marks);
        }

        // Enhanced for loop works whit array

        int aq[] = new int[4];
        aq[0]= 4;
        aq[1]= 8;
        aq[2]= 3;
        aq[3]= 9;

        for(int n : aq)
        {
            System.out.println(n);
        }

        //             Strings
        String name = new String("Navin");
        // same its creates obj inside String name = "Navin";
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Akshay"));
        name = name + " Vinay";
        System.out.println(name);
        int az = 5;
        int b = 5;
        System.out.println(az == b);

        // String Buffer also know as mutable string -->change
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        StringBuffer sb1 = new StringBuffer("Akshay");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1);
        sb1.append(" Rao");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1);
        sb1.deleteCharAt(0);
        System.out.println(sb1);
        sb1.insert(0,"a");
        System.out.println(sb1);
        System.out.println(sb1.length());
        sb1.setLength(30);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.ensureCapacity(100);
        System.out.println(sb1.capacity());
        String str = sb1.toString(); //converts sting buffer to string
        System.out.println(str);
        str = str + "aks";
        System.out.println(str);

        // Static key word

        Calculator m = new Calculator();
        m.name = "ak";
        m.marks =90;
        m.rollno = 10;
        Calculator n = new Calculator();
        n.name = "hello";
        n.rollno = 10;
        n.marks = 90;
        System.out.println(m.name); 
        System.out.println(n.name);  // deep look into it 
        // aslo call directly with class without objects
        // in non static method() we can use static variables
        // a variable belongs to  class not to object
        Calculator.name = "calling var with class name";
        System.out.println(Calculator.name);
        Calculator.show(m);            // passing object
        Mobile akm = new Mobile();   // for first object calls static block and construtor
        Mobile akm1 = new Mobile();  // calls construtor
        Mobile.show1();
        //Class.forName("Mobile");  //will load the class
    }
}


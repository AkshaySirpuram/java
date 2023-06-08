//we have a specific error code so when you
//have a specific constants which you want to use
// instead of creating a different object by yourself
// you can create a enum
enum Status   //class
{
    Running, Failed, Pending, Success; // by default objects
    // numbering 0, 1, 2, 3,
}
public class Demo {
    public static void main(String a[]) {
        Status s = Status.Running;    // object Running assigning to s
        System.out.println(s);
        System.out.println(s.ordinal());  // order number
        Status s1[] = Status.values();  // values() is methode inside class Status
        int sa[] = new int[4];
        sa[0] = 1;
        sa[1] = 2;
        sa[2] = 3;
        sa[3] = 4;
        System.out.println(s1[0]);
        for(Status s2 : s1) //it will give one status at a time
        {
            System.out.println(s2 + " : " + s2.ordinal());
        }
        for(int k : sa)
        {
            System.out.println(k);
        }
    }
    
}

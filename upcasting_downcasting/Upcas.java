class Up1
{
    public void show1()
    {
        System.out.println("in Up1 show");
    }
}
class Up2 extends Up1
{
    public void show2()
    {
        System.out.println("in Up2 show");

    }
}

public class Upcas 
{
    public static void main(String a[]) 
    {
        Up1 obj = (Up1) new Up2();  //upcasting going to parent 
        obj.show1();
        //  obj.show2(); not work
        Up1 obj1 = new Up2();

        Up2 obj2 = (Up2) obj1;  //downcasting obj1 is parent reference downcating to child reference
        obj2.show2();
    }
    
}

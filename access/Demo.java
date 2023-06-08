import ak.A;

class E extends A
{
    public void abc()
    {
        System.out.println(marks);  //protected
    }
}
// final key word
final class Calc1     // ca not inheritate
{
    final public void show()   // can not overide the method
    {
        System.out.println("in Cal1 show");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
//class AdvCalc1 extends Calc1{} can not posible because its final 
public class Demo {
    public static void main(String a[]) 
    {
        E obj = new E();
       //System.out.print(obj.marks);
       obj.abc();
        final int num = 10;   // making its constant and can not change
        Calc1 obj1 = new Calc1();
        obj1.show();
        obj1.add(4, 5);
    }
    
}

@FunctionalInterface  //Lambda expression works only with funtionalinterface
interface A
{
    int add(int i, int j);
}
public class Demo 
{
        public static void main(String a[])
        {
            A obj = (i,j) -> i+j;    // an expression its become an return type
            int result = obj.add(10, 20);
            System.out.println(result);

        }
}

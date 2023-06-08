import java.io.*;
// restrict inheritance 
sealed class A extends Thread implements Cloneable permits B,C
{
    
}
non-sealed class B extends A   //sub class should be any of this (sealed ,non-sealed ,final)
{

}
final class C extends A
{

}
class D extends B
{

}
sealed interface X permits Y 
{

}
non-sealed interface Y extends X // interface can't be final
{

}
public class Demo
{
    public static void main(String args[])
    {

    }
}
abstract class Car   //if method in class is abstract then class should be abstract
{
    public abstract void drive(); //if method decleared then it should be abstract
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("play music..");
    }
}
abstract class WagonR extends Car //if any class extending abstract class it must declear abstract method
{
    public void drive() //calls WagonR class because dynamic method dispatch
    {
        System.out.println("Driving.."); 
    }
}
class UpdatedWagonR extends WagonR  //concrete class
{
    public void fly()
    {
        System.out.println("flying..");
    }
}
public class Demo {
        public static void main(String a[]) {
            // Car obj = new Car(); we can not create object of abstract class
            // u can create refrerance of abstract class
            Car obj = new UpdatedWagonR();
            obj.drive();   //calls WagonR class because dynamic method dispatch
            obj.playMusic();
            obj.fly();
        }
    
}

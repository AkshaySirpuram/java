enum Status   //class  // by default enum extends enum class, so we can use enum methods like : ordinary
             //we can not extend enum class
{
    Running, Failed, Pending, Success; // by default objects
    // numbering 0, 1, 2, 3,
}
enum Laptop //extends Enum //class java.lang.Enum
{
    Macbook(2000), XPS(2200), Surface, Thinkpad(1800); // objects or constances
    private int price;

    private Laptop() {   //default constructor
        price = 500;
    }

    private Laptop(int price) {  // private because we are creating objects in the same class
        this.price = price;        //parameterized construtor
        System.out.println("in Laptop " + this.name());
    }

    public int getPrice() {     //we can create our own methods in enum
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
public class Demo {
    public static void main(String a[]) {
        Status s = Status.Pending;    // object Running assigning to s, which is refrance
        Laptop lap = Laptop.Macbook;
        lap.setPrice(100);
        System.out.println(lap + " : " + lap.getPrice());
        System.out.println(s.getClass().getSuperclass());  // printing super class of enum
        switch(s)  // s type of Status
        {
            case Running:   //constant
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
        }
        if(s == Status.Running)
            System.out.println("All Good");
        else if(s == Status.Failed)
            System.out.println("Try Again");
        else if(s == Status.Pending)
            System.out.println("Please Wait");
        else 
            System.out.println("Done");
        
        for(Laptop lap1 :  Laptop.values())  //values gives the array
        {
            System.out.println(lap1 + " : " + lap1.getPrice());
        }
    }
    
}


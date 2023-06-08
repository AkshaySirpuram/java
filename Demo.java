class Human              //Encapsulation
{
    private int age;
    private String name;
    public Human()     // default constructor
    {
        age = 28;
        name = "Anand";
        System.out.println("default constructor");
    }
    public Human(int a,String n) // parameterized constructor
    {
        age = a;
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;   //this keyword represent current object eg: obj.age = age;
    }
    // public void setAge(int age,Human obj){
    // Human obj1 = obj;
    // obj1.age = age;    
    // }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

public class Demo
{
    public static void main(String ak[])
    {
        Human obj = new Human();
        Human obj1 = new Human(18,"Akshay"); 
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        //obj.setAge(30,obj);
       // obj.setAge(10);
       // obj.setName("Akshay");
        //System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
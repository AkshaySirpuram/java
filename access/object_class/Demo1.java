
// Object class
class Laptop
{
    String model;
    Integer price;
}
class Laptop1
{
    String model;
    int price;
    public String toString()  ///prefrance given to this class
    {
        return model + " : " + price;
    }
    public boolean equals(Laptop1 that)
    {
        if(this.model.equals(that.model) && this.price == that.price)
        {
            return true;
        }
        else
            return false;
    }
}

public class Demo1
{
    public static void main(String a[]) 
    {
        Laptop1 obj = new Laptop1();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;
        System.out.println(obj);
        System.out.println(obj.toString());

        Laptop1 obj0 = new Laptop1();
        obj0.model = "Lenovo Yoga";
        obj0.price = 1000;
        System.out.println(obj0);
        System.out.println(obj0.toString());

        boolean result = obj.equals(obj0);
        System.out.println(result);

        // public bollen equals (Object obj)
        //{
        //   return (this == obj);
        //}

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;
        System.out.println(obj1);
        System.out.println(obj1.toString());
    }
}
import java.util.Objects;

// class Alien
// {
//     private final int id;
//     private final String name;
    
//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }
//     // @Override
//     // public int hashCode() {
//     //     return Objects.hash(id, name);
//     // }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

//     @Override
//     public String toString() {
//         return "Alien [id=" + id + ", name=" + name + "]";
//     }
// }
            //record is a class, it can not extend any other class // because record class extends a record class
            // can able implement an interface  // can able to create multiple methods
           //all variables in record is private and final by default
record Alien (int id, String name)  implements Cloneable// constructor based on values u mentioned is called canonical constructor
{            // state description
    static int num;
    //int age; //not works
    public Alien()
    {
        this(0,"");
    }

    // public Alien(int id , String name)   //even if you not mention this code u will get implicit constructor 
    // {                                     //its happens benind the seen
    //     this.id = id;                    //canonical constructor
    //     this.name = name;
    // }

    public Alien   // compact canonical constructor
    {
        if(id==0)
            throw new IllegalArgumentException("id cannot be Zero");
         
    //     this.id = id;              
    //     this.name = name;       these are done in background (implicitly)
    }
    public void show()
    { 
        System.out.println(num);
    }
}
public class Project {
    public static void main(String args[]) {
        
        Alien a1 = new Alien(1, "Akshay");
        Alien a2 = new Alien(1, "Akshay");
        System.out.println(a1.equals(a2));
        System.out.println(a1);
        Alien.num = 10;
        a1.show();
        a2.show();
        System.out.println(a1.name());   // because we dont have a setter
        System.out.println(a1.id());
        Alien a3 = new Alien();
        System.out.println(a3);
        Alien a4 = new Alien(0, "Akshay");
        System.out.println(a4);
    }
}

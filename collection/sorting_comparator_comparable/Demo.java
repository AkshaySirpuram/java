import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student //implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "students [age=" + age + ", name=" + name + "]";
    }

    // @Override
    // public int compareTo(Student that) {
    //     if (this.age > that.age)
    //                 return 1;   // means swap
    //             else
    //                 return -1;  // not swap
    // }
    
}
public class Demo {
    public static void main(String a[]) { // Comparator is an interface
                                          // in anonymous class u need to mention generics two sides
        Comparator<Student> com = ( i, j) ->  i.age > j.age?1:-1;
            // {

            //     if (i.age > j.age)
            //         return 1;   // means swap
            //     else
            //         return -1;  // not swap
            //      i.age > j.age?1:-1;
            // }
    
        
        // after 1.7 update its optional to add generics left hand side is enough.

         List<Student> studs = new ArrayList<>();
        studs.add(new Student(18, "Akshay"));
            studs.add(new Student(12, "Manoj"));
            studs.add(new Student(64, "Anupam"));
            studs.add(new Student(20, "Vinay"));

        // // Collections.sort(studs,com); // Collections is a class
         Collections.sort(studs,com);   //No error because we implements Comparable<Student>
         for(Student s : studs) 
              System.out.println(s);

        // List<Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(29);
        // Collections.sort(nums, com); // Collections is a class
        // System.out.println(nums);

    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Collection; //collection is interface has so many methods 
//collection works with objects not with primitive values
//Integer is class//int is primitive 
//Integer is wrapper class of int type
//java.lang 
//java.util
public class Demo {
    public static void main(String a[])
    {
        //collection is the interface
        List<Integer> nums = new ArrayList<Integer>();  
        //Collection<Integer> nums = new ArrayList<Integer>();      
        nums.add(6);
        nums.add(4);
        nums.add(8);
        nums.add(2);
        nums.add(2);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(2));
        //objects can't store into integers 
        //here comes generics
        //angular brackets after collection in that you mention the type of element Integer  
        //System.out.println(nums);
    for(int n : nums)
        {
            System.out.println(n);
        }
    
     // set
        System.out.println( "below is set ");
        // set is the collection of uniqe values
        //in set we can't have  repeated value
        //its not sorted formet
        // not sequence formet
        // does not support index value
       // Set<Integer> nums1 = new HashSet<Integer>();
       //TreeSet for sorted values
        Set<Integer> nums1 = new TreeSet<Integer>();    
        nums1.add(64);
        nums1.add(42);
        nums1.add(89);
        nums1.add(24);
        //nums1.add(2);

        Iterator<Integer> values = nums1.iterator();
        while(values.hasNext())
             System.out.println(values.next());
         
        // for(int n : nums1)
        // {
        //     System.out.println(n);
        // }
    
}
}

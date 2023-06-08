import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.*;;
public class Demo {

    public static void main(String a[]) 
    {
        // List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // int sum = 0;
        // for(int n : nums)
        // {
        //     if(n%2==0)
        //     {
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }
        
        // System.out.println(sum);

        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        //different loops

        // for(int i=0;i<nums.size();i++)
        // {
        //     System.out.println(nums.get(i));
        // }
         
       
        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }

        // nums.forEach(n -> System.out.println(n));  // gives one value at a time
        
        Consumer<Integer> con = new Consumer<Integer>() {  // Funtional interface
            public void accept(Integer n)
            {
                System.out.println(n);
            }
        };
        nums.forEach(con); // its takes object of Consumer  // gives one value at a time to accept method

        nums.forEach(n -> System.out.println(n));

        

    }
}

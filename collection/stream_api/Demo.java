
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo 
{

    public static void main(String a[]) 
    {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        // Stream<Integer> s1 = nums.stream();   //gives stream of values
        // Stream<Integer> s2 = s1.filter(n -> n%2==0); //here s1 is used , Stream u can use it only once  
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0,(c,e) -> c+e); // reduce gives the one value of type defined in Stream, here Integer
        // System.out.println(result);

        //one line
        Predicate<Integer> p = new  Predicate<>() 
        {

            @Override
            public boolean test(Integer n) {
                if(n%2==0)
                return true;
                else 
                return false;
            }
            
        };
        // Predicate<Integer> p = n -> n%2==0;
    
        // Function<Integer,Integer> fun = new Function<Integer,Integer>()
        // {
        //     public Integer apply(Integer n) {
        //         return n*2;
        //     }  
        // }; 
        


        int result = nums.stream()
                        .filter(p)  //(n -> n%2==0) // applying filter on stream and again we get a new stream, fliter needs obj of predicate Functional interface has a method test it boolean.
                        .map(n -> n*2) //(fun)  // map needs obj of Function Functional interface takes 2 typs has a method apply. 
                        .reduce(0,(c,e) -> c+e); //0,c-> carry, e -> element , 0,1,2,3,4
        System.out.println(result);

        Stream<Integer> sortedValues = nums.stream()
                        .filter(n -> n%2==0)  
                        .sorted();
        sortedValues.forEach(n -> System.out.println(n));
        //s3.forEach(n -> System.out.println(n));
       // s1.forEach(n -> System.out.println(n)); Stream can't be used again, only once
    }
}
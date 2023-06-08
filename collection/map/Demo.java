
//map is the collection of key and value pair
// map is interface and its support key and value pair
// public abstract interface Map<K,V> {}
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String a[])
    {
        Map<String, Integer> students = new HashMap<>();

        students.put("Akshay", 556);
        students.put("Anupam", 996);
        students.put("Vaibhav", 786);
        students.put("Manoj", 998);
        students.put("Anupam", 1000);
        // add key is for adding new element
        // put key is for try to add element if u already have the key then  just replace it
        //Keys are unique
        //Keys are set , values are list
        System.out.println(students.keySet());
        System.out.println(students.values());
        for(String key : students.keySet())
        {
            System.out.println(key +" : "+ students.get(key));;     // in list we have used to get the value of index
        }
    }
}
// we also have Hashtable it works almost same has HashMap
// the only difference is hashtable is synchronized // we used in multiple threads



public class Wrapper 
{
    public static void main(String a[])
    {
        int num = 7;
        //Integer num1 = new Integer(num); // boxling
        Integer num1 = num;    //autoboxing
        System.out.println("autoboxing" +" " +num1);  

        int num2 = num1.intValue();  // unboxing getting the value from object type to premitive type
        int num3 = num1; // auto unboxing
        System.out.println("" + num2);

        String str = "12";
        int num4 = Integer.parseInt(str);  //method connvert into integer
        System.out.println(num4*2);
    }  
}

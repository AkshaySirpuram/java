public class Hello   //class
{   
    /*
     * @param args
     */
    public static void main(String[] args)  //funtion
    {
        int num1 = 3;
        int num2 = 4;
        char c = '1';
        boolean b = true; 
        int result = num1 + num2;
        float f = 1.382f;
        int x = (int)f;
        byte by = 120;
        byte bt = 120;
        int ak = by + bt;
        ak *= 2;
        int ab = 2;
        ab = ab++;
        System.out.println(result);
        System.out.println(num1 + num2);
        System.out.println(10 + 30);        //statment
        System.out.println(10 + 30);
        System.out.println(1034 + 23);
        System.out.println(c);
        System.out.println(b);
        System.out.println(f);
        System.out.println(x);
        System.out.println(ak);
        System.out.println(ab);
        int ac = 20;
        if(ac>1 && ac<=10)
            System.out.println("Hello");
        else if(ac>11)
            System.out.println("Bye");
        else if(ac<0)
            System.out.println("Good bye");
        else
            System.out.println("ak");
        int ad = 2;
        switch(ad)
        { 
            case 1:
                System.out.println("ak");
                break;
            case 2:
                System.out.println("ak1");
                break;
            default:
                System.out.println("akd");
        }
        int ae = 1;
        while(ae <=4)
        {
            System.out.println("hello " + ae);
            int af = 1;
            while(af <=3)
            {
            System.out.println("hi " + af); //nested while loop
            af++;
            }
            ae++;
        }
        System.out.println("Bye " + ae);

        do
        {
            System.out.println("hello " + ae);
            ae++;
        }while(ae<=7);

        for(int i=4; i>=1; i--)
        {
            System.out.println("for" + i);
        }
        int af=6;                      // af is primitive variable
        Calculator calc = new Calculator();            //calc is refrence variable
        calc.add(af, af);

    }
}

class calculator
{
    public int add()
    {
        int g;
        System.out.println("in add");
        return 0;
    }

}
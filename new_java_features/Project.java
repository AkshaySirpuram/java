public class Project {
    
public static void main(String args[]) {
         //switch as an Statement
        // int a=10;
        // switch(a)
        // {
        //     case 1 :
        //     System.out.println(a);
        //     break;
        //     case 2 :
        //     //
        //     default :
        //     //

        // }
 
        //  after java 5 String is supported

        // String day = "Monday";
        // switch(day)
        // {
        //     case "Satuday", "sunday":
        //         System.out.println("6am");
        //         break;
        //     case "Monday":
        //         System.out.println("8am");
        //         break;
        //     default:
        //         System.out.println("7am");

         //  after java 12 String is supported
         // switch has an expression

         String day = "Monday";
         String result = "";
         result = switch(day)
        //  {
        //      case "Satuday", "sunday" -> "6am";
        //      case "Monday"-> "8am";
        //      default -> "7am";
        // };   // because its an expression 

        ////////////////OR///////////////////
        {
            case "Satuday", "sunday": yield "6am";
            case "Monday": yield "8am";
            default: yield "7am";
       };   // because its an expression 
        System.out.println(result);
    }
}

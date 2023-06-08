import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String a[]) throws NumberFormatException, IOException
    {
        
        int num =0;

        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        // once the try block gets over br resources will close  automatically beacause BufferRReader class is closeble
        {   
           // InputStreamReader in = new InputStreamReader(System.in);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
          
        }
        // try
        // {   
        //    // InputStreamReader in = new InputStreamReader(System.in);
        //     br = new BufferedReader(new InputStreamReader(System.in));
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
          
        // }
        // finally   // close the resource
        // {
        //     System.out.println("Bye1");
        //     br.close();
        // }

    }
    
}

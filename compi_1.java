import java.util.Scanner;

public class compi_1 {
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
     float n = in.nextFloat();
     float f = in.nextFloat();
     if(n%5==0 && f>=n+0.5f)
     {
     System.out.println(f-n-0.5f);
     }
     else{
         System.out.println(f);
     }
     in.close();
     
    }
    
}

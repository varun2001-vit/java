import java.util.Scanner;

public class hcf_lcm {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("------20BDS0150---");
        System.out.println("Enter the numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int t1,t2,t;
        t1=a;
        t2=b;
        while(t2!=0)
        {
            t=t2;
            t2=t2%t1;
            t1=t;
            
        }
        int hcf=t1;
        int lcm=(a*b)/hcf;
        System.out.println("hcf is "+ hcf);
        System.out.println("lcm is " + lcm);
        System.out.println("-----------20BDS0150-------------------");
        in.close();
        
        
        
    }
    
}

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("---20BDS0150---");
        int n=sc.nextInt();
        for(int i = 1; i <=n;i++)
        {
            for(int j = 0; j <i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}

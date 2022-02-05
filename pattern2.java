import java.util.Scanner;
public class pattern2 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---20BDS0150---");
        int n=sc.nextInt();
        for(int i = 0; i < n;i++)
        {
            for(int j = 0; j <i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
        for(int i = n; i >0;i--)
        {
            for(int j = 0; j <i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }

        sc.close();
    }

    }
    


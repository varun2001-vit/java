import java.util.Scanner;

public class pattern3 {
    public static void main( String[] args){
        Scanner in = new Scanner(System.in);
        //int n=in.nextInt();
        int n=3;
        System.out.println("---20BDS0150---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }

            for(int j=i;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
        

    }
    
}

import java.util.Scanner;

public class addition_matrix {
    public static void main(String[] args)
    { 
        Scanner in = new Scanner(System.in);
        int[][] a  = new int[3][3];
        int[][] b  = new int[3][3];
        System.out.println("-----20BDS0150-----");
        System.out.println("enter the elements of 3X3 matrix 1");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length;j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("enter the elements of 3X3 matrix 2");
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length;j++)
            {
                b[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length;j++)
            {
               System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    
}
}

import java.util.Scanner;
public class identity_matrix {
    public static void main(String[] args)
    { int flag=0;
        Scanner in = new Scanner(System.in);
        int[][] a  = new int[3][3];
        System.out.println("-----20BDS0150-----");
        System.out.println("enter the elements of 3X3 matrix");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length;j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < a.length; i++)
        { 
            for(int j = 0; j < a[i].length; j++)
            { 
                if(i==j && a[i][j]!=1)
                { 
                    flag=1;
                }
                if(i!=j && a[i][j]!=0)
                {
                    flag=1;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Not identity_matrix");
        }
        else
        {
            System.out.println("it is a identity_matrix");
        }
        in.close();

        System.out.println("-----20BDS0150-----");


    }
}

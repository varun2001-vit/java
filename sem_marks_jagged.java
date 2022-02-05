import java.util.Scanner;

public class sem_marks_jagged
{
    public static void enter_jagged(int marks[][],int a)
     {  Scanner in = new Scanner(System.in);
        int n=a;
        System.out.println("Enter the number of subjects in each sem");
        for(int i=0; i<n; i++)
        {
            //int a=in.nextInt();
            marks[i]=new int[in.nextInt()];
        }
        System.out.println("Enter the  marks");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<marks[i].length; j++)
            {
                marks[i][j]=in.nextInt();
               
            }
        }
        int p=0,f=0;
        
        for (int[] innerArray : marks)
      {
         for (int val : innerArray)
         {
            if(val>=40)
            {
                p++;
            }
            else
            {
                f++;
            }
             
         }
        
    }
    System.out.println("the number of subject student passed is " + p);
    System.out.println("the number of sbjects student failed is " + f);
    in.close();
      

}
    public static void main(String[] args)
    {
        int n;
        //int p=0,f=0;
       
        Scanner in = new Scanner(System.in);
        System.out.println("---20BDS0150---");
        System.out.println("enter the number of sems");
        n=in.nextInt();
        int[][] marks = new int[n][];
        enter_jagged(marks,n);
      in.close();
             
         }
        
    
      



    } 

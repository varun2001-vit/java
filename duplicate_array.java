import java.util.Scanner;

public class duplicate_array {
    public static void main(String[] args) {
        int n;
        Scanner in= new Scanner(System.in);
        System.out.println("---20BDS0150---");
        System.out.println("enter size of the array");
        n=in.nextInt();
        int[] a= new int[n];
        System.out.println("enter the elements in a sorted array");
        for(int i=0; i<n; i++)
        {
            a[i]=in.nextInt();
        }
        int j=0;
        
        for(int i=0; i<n-1; i++)
        {
            if(a[i]!=a[i+1])
            {
                a[j]=a[i];
                j++;
            }

        }
        a[j]=a[n-1];
        j++;
        
        System.out.println(" elements in the array after removing duplicates");
       for(int k=0;k<j;k++)
            {
                System.out.print(a[k]+" ");
            }
        in.close();

        
    }

  
    

}

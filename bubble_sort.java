import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("---20BDS0150---");
        System.out.println("enter n");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("enter the elements");
        for (int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("array before sorting");
        for (int i=0; i<n; i++) {
            System.out.print(a[i]+" ");
        }
        for (int i=0; i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("array after sorting");
        
            for(int j=0; j<n;j++)

            {
                System.out.print(a[j]+" ");

            }
        sc.close();
    
}
}

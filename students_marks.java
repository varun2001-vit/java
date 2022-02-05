import java.util.Scanner;
public class students_marks {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---20BDS0150---");
        System.out.println("enter the number of students");
        int n=in.nextInt(); 
        int []a=new int[n];
        System.out.println("enter the marks");
        for(int i=0; i<n; i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("the marks are ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("the marks in reverse order");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        in.close();


    }
    
}

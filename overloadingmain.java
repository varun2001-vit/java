/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassessment;

import java.util.Scanner;

/**
 *
 * @author varun
 */
public class overloadingmain {
     public static void main(int args)
    {
        System.out.println("main() overloaded"
                           + " method 1 Executing");
    }
  
    // Overloaded main method 2
    // According to us this overloaded method
    // Should be executed when character is passed
    public static void main(char args)
    {
        System.out.println("main() overloaded"
                           + " method 2 Executing");
    }
  
    // Overloaded main method 3
    // According to us this overloaded method
    // Should be executed when double value is passed
    public static void main(Double[] args)
    {
        System.out.println("main() overloaded"
                           + " method 3 Executing");
    }
  
    // Original main()
    public static void main(String[] args)
    {
        int count=0;
        System.out.println("Original main()" + " Executing");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
        int n= sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=2;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    count++;
                    break;
                }
            }
        }
        System.out.println("no of composite are: "+ count);
        System.out.println("no of prime are :"+ (n-count));
    }
    
}

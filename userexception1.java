package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class userexception1 {
    public static void main(String[] args)
    {
    
      
      Scanner s = new Scanner(System.in);
      System.out.println("***20BDS0150*****");
      System.out.println("enter the  no of students");
      int n=s.nextInt();
      int a[]= new int[n];
      System.out.println("enter the marks of the students");
      try{
          for(int i=0; i<a.length; i++)
          {
              a[i] = s.nextInt();
              if(a[i]<0 || a[i]>100)
              {
                  throw new markserror("marks can't be less than 0 and greater than 100");
              }
          }
      }
      catch(markserror e)
      {
          System.out.println(e.getMessage());
      }
      catch(ArithmeticException e)
      {
          System.out.println("enter valid mark");
      }
      catch(InputMismatchException e)
      {
          System.out.println("enter invalid mark in valid format");
      }
      
      System.out.println("program ended successfully");
      s.close();
      System.gc();
      
    }
    
}
class markserror extends Exception
{
    markserror(String msg)
    {
        super(msg);
    }
}

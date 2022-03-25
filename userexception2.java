package exception;

import java.util.Scanner;

public class userexception2 {
    public static void main(String[] args)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("20BDS0150");
        System.out.println("enter the value");
        try
        {
            try
            { 
              a= sc.nextInt();
                  if(a<0)
                  {
                      throw new negitivexception("number cannot be negitive");
                  }
                  if(a>50 && a<100)
                  {
                      throw new rangexception("out of range bounds");
                  }

            }
            catch(rangexception e)
            {
                System.out.println(e.getMessage());
            }
        }
        catch(negitivexception c){
            System.out.println(c.getMessage());
            
        }
        finally{
            System.out.println("executed successfully no error termination");
        }
    }
    
}
class negitivexception extends Exception
{
    negitivexception(String s)
    {
        super(s);
    }
}
class rangexception extends Exception
{
    rangexception(String s)
    {
        super(s);
    }
}
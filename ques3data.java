package files;






import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


class A extends Thread
{
   
   @Override
   public  void run()
   {  
       FileOutputStream f = null;
       try {
           File obja = new File("file1.txt");
           f = new FileOutputStream(obja);
           DataOutputStream data = new DataOutputStream(f);  
          
           for(int number=2;number<100;number++)
           {
               int flag=0;
               for(int i=2;i<number-1;i++)
               {
                   if(number%i==0)
                   {
                       flag=1;
                       break;
                   }
               }
                   if(flag==0)
                   {
                        data.writeInt(number);
                        Thread.sleep(1000);
                   }
               
               
               
           }
       } catch (FileNotFoundException ex) {
           Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
       } catch (InterruptedException ex) {
           Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
           try {
               f.close();
               
                System.out.println("Written sucessfully by thread A");
        
           } catch (IOException ex) {
               Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
   }
}
class calc{
    public int a;
    public int b;
    calc(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void calculate() throws FileNotFoundException, IOException, InterruptedException
    {
        File objc = new File("file2.txt");
        FileOutputStream fc  = new FileOutputStream(objc);
           DataOutputStream datac = new DataOutputStream(fc);  
        
       
        
        for(int number=a;number<b;number++)
        {
            int flag=0;
               for(int i=2;i<number-1;i++)
               {
                   if(number%i==0)
                   {
                       flag=1;
                       break;
                   }
               }
                   if(flag==0)
                   {
                        datac.writeInt(number);
                        Thread.sleep(1000);
                   }
        }
         System.out.println("Written sucessfully by thread B");
        
        
    }
}
class C extends Thread
{
    @Override
    public void run()
            
    {
        try {
            Thread.sleep(35000);
            System.out.println("*****DATA FROM FILE 1******");
            File obj = new File("file1.txt");
            DataInputStream d2=null;
            try {
                d2 = new DataInputStream(new FileInputStream(obj));
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
                
            }
            
            try{
                while(d2.available()>0)
                {
                    
                    System.out.println(d2.readInt());
                    
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
class D extends Thread
{
    @Override
    public void run()
            
    {
        try {
            Thread.sleep(33000);
            System.out.println("*****DATA FROM FILE 2******");
            File obj = new File("file2.txt");
            DataInputStream d2=null;
            try {
                d2 = new DataInputStream(new FileInputStream(obj));
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
                
            }
            
            try{
                while(d2.available()>0)
                {
                    
                    System.out.println(d2.readInt());
                    
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


public class ques3data{
    public static void main(String[] args) throws InterruptedException {
        A a= new A();
  
            calc x = new calc(100,200);
            Thread tt = new Thread(()->{
                try {
                    x.calculate();
                } catch (IOException ex) {
                    Logger.getLogger(ques3data.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                Logger.getLogger(ques3data.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
             tt.start();
        
   
        //B b = new B();
        a.start();
        
        C c = new C();
        c.setPriority(1);
        c.start();
        D d = new D();
        d.start();
        d.setPriority(2);
      
        
        
    }
    
}
class rangeexception extends Exception
{
    rangeexception(String s)
    {
       super(s);
    }
}

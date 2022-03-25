/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class AX extends Thread
{
   
   @Override
   public  void run()
   {  
       FileWriter fout = null;
       try {
           File obj = new File("file1.txt");
            fout = new FileWriter(obj);
           
           int count=0;
           for(int number=1;number<100;number++)
           {
               count++;
               
               int flag=0;
               
               int sum=0;
               int num=number;
               while (num > 0)
               {
                   int s= num % 10;
                   sum=sum+s;
                   num = num / 10;
               }
               for(int i=2;i<sum-1;i++)
               {
                   if(sum%i==0)
                   {
                       flag=1;
                       break;
                   }
                   
               }
               if(flag==0)
               {
                   //System.out.println("the number with sum as prime :" +number+"(BY THREAD A)" );
                   String word=String.valueOf(number);
                   fout.write(word);
                   fout.write(" ");
                  
                   
               }
               
           }
       } catch (IOException ex) {
           Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
           try {
               fout.close();
               System.out.println("Written sucessfully by thread A");
        
           } catch (IOException ex) {
               Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
   }
}
class calcX{
    public int a;
    public int b;
    calcX(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void calculate() throws IOException, InterruptedException
    {
        
        File obj1 = new File("file2.txt");
        FileWriter fout1= new FileWriter(obj1);
        int count=0;
        
        for(int number=a;number<b;number++)
        {
            count++;
            int sum=0;
            int num=number;
            while(num>0){
                int s= num % 10;
                sum=sum+s;
                num = num / 10;
            }
            if(number%sum==0)
            {
               // System.out.println("numbers where sum is factor:"+ " "+ number+"(BY THREAD B)");
                String word=String.valueOf(number);
                   fout1.write(word);
                   fout1.write(" ");
                   
            }

                
        }
        fout1.close();
        System.out.println("Written sucessfully by thread B");
        
    }
}



public class ques3 {
    public static void main(String[] args) throws InterruptedException {
        AX a= new AX();
        int l = 0,m=0;
       
        System.out.println("enter the range for factor thread");
        Scanner sc= new Scanner(System.in);
        try{
         l = sc.nextInt();
         m= sc.nextInt();
        if(l<100 || m>200)
        {
            throw new rangeexceptionc("not in range");
        }
        
        }
        catch (rangeexceptionc c)
        {
            System.out.println(c.getMessage());
        }
        if(l>=100 && m<=200)
        {
            calcX c = new calcX(l,m);
            Thread tt = new Thread(()->{
                try {
                    c.calculate();
                } catch (IOException ex) {
                    Logger.getLogger(ques3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ques3.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
             tt.start();
        
            
        
        
        }
   
        //B b = new B();
        a.start();
      
        
        
    }
    
}
class rangeexceptionc extends Exception
{
    rangeexceptionc(String s)
    {
       super(s);
    }
}
    


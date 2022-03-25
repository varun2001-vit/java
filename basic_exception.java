/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author varun
 */
public class basic_exception {
    public static void main(String[] args) {
        int choice ;
        System.out.println("******20BDS0150**********");
        System.out.println("enter the choice");
        Scanner sc= new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice)
        {
            case 0:
                try{  
      //code that may raise exception  
                   int data=100/0;  
                   }
                catch(ArithmeticException e)
                {
                    System.out.println(e);
                }
                break;
            case 1:
                try {
                    String s=null;  
                       System.out.println(s.length());
                }
                catch(NullPointerException e)
                {
                    System.out.println(e);
                }
                break;
            case 2:
                try{
                    int a[]=new int[5];
                    a[0]=2;
                    a[6]=10;
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println(e);
                }
                break;
        }
        System.out.println("executed");
        sc.close();
        
    }
    
}

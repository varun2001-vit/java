//package java_vit.src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author varun
 */
public class odd_even {
     public static void main(String[] args)
             
     {
         Scanner in =new Scanner(System.in);
         int num;
         System.out.println("--20BDS0150--");
         System.out.println("Enter the number");
         num=in.nextInt();
         //using if else
         //if(num%2==0)
         //{
         //    System.out.println("even");
         //}
         //else
         //{
          //   System.out.println("odd");
        //}
         num=num%2;
         switch(num)
         {
             case 0:System.out.println("even");
             break;
             case 1:System.out.println("odd");
             break;
         }
         
         in.close();
         
     }
}

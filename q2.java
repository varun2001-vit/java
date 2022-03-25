 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Scanner;

/**
 *
 * @author varun
 */
public class q2 {
    public static void main(String[] args) {
        test t = (String s)->{
           
            System.out.println("***20BDS0150***");
            System.out.println("*****orginal string******");
            System.out.println(s);
            String str[]=s.split(" ");
            System.out.println("****capitalized String******");
            for(String name:str)
            {
                 String firstLetStr = name.substring(0, 1);
                  // Get remaining letter using substring
                 String remLetStr = name.substring(1);
 
                 // convert the first letter of String to uppercase
                  firstLetStr = firstLetStr.toUpperCase();
 
                // concantenate the first letter and remaining string
                String firstLetterCapitalizedName = firstLetStr + remLetStr;
                System.out.print(firstLetterCapitalizedName+" ");
              
            }
            System.out.println("");
        
    };
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        t.printcapitalized(s);
    }
}
interface test 
{
    void printcapitalized(String s);
}

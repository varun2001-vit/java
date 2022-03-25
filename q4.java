/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author varun
 */
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,ArrayList<String>> h1 = new HashMap<>();
        int ch=0;
        do
        {
            System.out.println("enter key");
            String key = sc.next();
            System.out.println("enter value");
            String value = sc.next();
            if(h1.containsKey(key))
            {
                ArrayList<String>b=new ArrayList<>();
                b=h1.get(key);
                b.add(value);
                h1.put(key, b);
            }
            else
            {
                ArrayList<String>b=new ArrayList<>();
                b.add(value);
                h1.put(key, b);
            }
            System.out.println("do you want more(0 for yes)");
             ch= sc.nextInt();
        }while(ch==0);
        
        System.out.println(h1);         
        
        
        HashMap<String,String> h2 = new HashMap<>();
         ch=0;
        do
        {
            System.out.println("enter key");
            String key = sc.next();
            System.out.println("enter value");
            String value = sc.next();
           
            h2.put(key, value);
            System.out.println("do you want more(0 for yes)");
             ch= sc.nextInt();
        }while(ch==0);
        
       System.out.println("Iterating Hashmap...h1");  
   for(Map.Entry m : h1.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
    System.out.println("Iterating Hashmap...h2");  
   for(Map.Entry m : h2.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   } 
   for(Map.Entry m:h1.entrySet())
   {
       for(Map.Entry k : h2.entrySet() )
       {
           if(m.getValue().toString().contains((String)k.getKey()))
           {
               System.out.println(m.getKey()+ " is taught by "+k.getValue());
           }
           
       }
      
   }
        
        
        
}
}

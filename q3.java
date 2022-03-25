/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author varun
 */
public class q3 {
    public static void main(String[] args) {
        ArrayList<books> str1= new ArrayList<>();
        ArrayList<books> str2= new ArrayList<>();
        ArrayList<books> str3= new ArrayList<>();
        books b[]= new books[8];
        b[0]= new books("panchatantra",100,"comic","chetan bhagat");
        b[1]= new books("khanna khazana",200,"cooking","abraham joseph");
        b[2]= new books("spider-man",500,"fiction","peter james");
        b[3]= new books("In Search of Lost Time",900,"fiction","Marcel Proust");
        b[4]= new books(". Ulysses ",600,"comic"," James Joyce");
        b[5]= new books(" War and Peace",800,"fiction","destiby");
        b[6]= new books("The Man Who Ate Too Much",1200,"cooking","James Beard");
        b[7]= new books("food for life",1000,"cooking","ramshanker");
           
        for(int i=0;i<b.length;i++)
        {
            if(b[i].type.contains("comic"))
            {
                str1.add((books)b[i]);
            }
            if(b[i].type.contains("cooking"))
            {
                str2.add((books)b[i]);
            }
            if(b[i].type.contains("fiction"))
            {
                str3.add((books)b[i]);
            }
        }
        System.out.println("***comics***");
        for(books x:str1)
        {
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
           
            
        }
        System.out.println("***cooking***");
        for(books x:str2)
        {
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
           
            
        }
        System.out.println("***fiction***");
        for(books x:str3)
        {
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
           
        }
        Collections.sort(str1,new names() );
         Collections.sort(str2,new names() );
          Collections.sort(str3,new names() );
          System.out.println("**AFTER SORTING**");
          System.out.println("***comics***");
        for(books x:str1)
        {
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
           
            
        }
        System.out.println("***cooking***");
        for(books x:str2)
        {
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
           
            
        }
        System.out.println("***fiction***");
        for(books x:str3)
        {
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
           
        }
        System.out.println("**MAX AND MIN PRICES FOR EACH LIST**");
        int max=0,min=1000;
         for(books x:str1)
        { if(max<x.price)
        {
            max=x.price;
        }
        if(min>x.price)
        {
            min=x.price;
        }
        }
         System.out.println("***COMICS***");
        for(books x:str1)
         {
             
             if (max==x.price)
             {
                 System.out.println("**max priced book**");
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
                 
             }
             
             
             if (min==x.price)
             {
                 System.out.println("**min priced book**");
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
                 
             }
         }
           max=0;min=1000;
         for(books x:str2)
        { if(max<x.price)
        {
            max=x.price;
        }
        if(min>x.price)
        {
            min=x.price;
        }
        }
         System.out.println("**COOKING**");
         for(books x:str2)
         {
            
             if (max==x.price)
             { System.out.println("**max priced book**");
                 
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
                 
             }
             
             
             if (min==x.price)
             {
                 System.out.println("**min priced book**");
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
                 
             }
         }
           max=0;min=1000;
         for(books x:str3)
        { if(max<x.price)
        {
            max=x.price;
        }
        if(min>x.price)
        {
            min=x.price;
        }
        }
         System.out.println("**FICTION***");
         for(books x:str3)
         {
             
             if (max==x.price)
             {
                 System.out.println("**max priced book**");
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
                 
             }
             
             
             if (min==x.price)
             {System.out.println("**min priced book**");
                 
            System.out.println("name:"+x.name);
            System.out.println("price:"+x.price);
            System.out.println("author:"+x.author);
            System.out.println("type:"+x.type);
            System.out.println(" ");
                 
             }
         }
         
        
    }
    
       
       
    
}
class books
{
    String name;
    int price;
    String type;
    String author;

    public books(String name, int price, String type, String author) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.author = author;
    }
    
    
}
class names implements Comparator<books>
{

    @Override
    public int compare(books o1, books o2) {
        if(o1.name.compareTo(o2.name)>0)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
}

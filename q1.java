/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.*;
import java.io.*;

/**
 *
 * @author varun
 */
public class q1 {
    public static void main(String[] args) {
        System.out.println("20bds0150");
        ArrayList<String> str0= new ArrayList<>();
        ArrayList<String> str1= new ArrayList<>();
        ArrayList<String> str2= new ArrayList<>();
        ArrayList<String> str3= new ArrayList<>();
        
        str0.add("varun");
        str0.add("shobhit");
        str0.add("elzibeth");
        str0.add("alpana");
        str2= (ArrayList<String>) str0.clone();
        str3=(ArrayList<String>) str0.clone();
        System.out.println("****orginal string****");
        System.out.println(str0);
        System.out.println("***sorting(Ascending)***");
        Collections.sort(str0, new words() );
        System.out.println(str0);
        int n=str0.size();
        for(int i=0; i<str0.size();i++)
        {
            str1.add((String)str0.get(n-i-1));
        }
        System.out.println("***sorting(Descending)***");
        System.out.println(str1);
        System.out.println("***sorting by 1st alphabet***");
        Collections.sort(str2);
        System.out.println(str2);
        Collections.sort(str3,new words1());
        System.out.println("***sorting by strings with e as first***");
        System.out.println(str3);
        
        
    }
    
}
class words  implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length()>o2.length())
        {
            return 1;
        }
        else
        {
            return -1;
        }
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
class words1  implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        if(o2.contains("e"))
        {
            return 1;
        }
        else
        {
            return -1;
        }
         //To change body of generated methods, choose Tools | Templates.
    }
    
}


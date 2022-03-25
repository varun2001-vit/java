/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author varun
 */
public class arraylist {
    public static void main(String[] args) {
      ArrayList<Integer> a = new ArrayList<>();
      for(int i=0;i<5;i++)
      {
          a.add(i);
      }
        System.out.println(a);
        a.add(5);
        System.out.println(a);
        a.add(1,69);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        System.out.println(a.contains(6));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        ArrayList<Integer> b=new ArrayList<>();
        b=(ArrayList<Integer>) a.clone();
        System.out.println(b);
        a.clear();
        System.out.println(a.isEmpty());
        //displaying
        b.add(10);
        b.add(9);
        b.add(6);
        System.out.println(b);
        b.set(1, 100);
        System.out.println(b);
        b.sort(null);
        System.out.println(b);
        //
        ArrayList<Integer> c= new ArrayList<>();
        c.add(56);
        c.add(57);
        c.add(58);
        b.addAll(c);
        System.out.println(b);
        b.removeAll(c);
       // b.retainAll(c);
        System.out.println(b);
        //display
        //1st way
        for(int i:b)
        {
            System.out.println("the number is:"+i); 
        }
        //2nd way
        Iterator f =b.iterator();
        while(f.hasNext())
        {
            System.out.println("the number (f):"+ (int)f.next());
        }
        //3rd way
        ListIterator s=b.listIterator(b.size());
         while(s.hasPrevious())
        {
            System.out.println("the number (s):"+ (int)s.previous());
        }
        
        
    }
    
}

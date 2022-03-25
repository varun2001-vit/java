/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author varun
 */
public class linkedlist {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(3);
        l.add("somit");
        l.add("varun");
        l.add("shag");
        System.out.println(l);
        //object to access the elements
        
        l.push(69);
        l.add("ram");
        for(Object s:l)
        {
            System.out.println(s);
        }
        ListIterator<Object> x= l.listIterator();
        while(x.hasNext())
        {
            System.out.println(x.next());
        }
        System.out.println("****sorting*****");
        try{
        Collections.sort(l);
        System.out.println(l);
    }catch(Exception e)
    {
        System.out.println("jaa na lawde");
    }
    }
    
}

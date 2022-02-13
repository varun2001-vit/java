/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise;
class sis {
    public void test(int n)
    {
        System.out.println(n);
    }
    private class behen{
        void display()
        {
            System.out.println("behen");
        }
    }
    void pyaar(){};
    void dis()
    {
        behen b=new behen();
        b.display();
    }
    static class bhai
    {
        bhai()
        {
            System.out.println("bhai nested static ");
        }
        void set()
        {
            System.out.println("bhai hu ");
        }
    }
     
}
/**
 *
 * @author varun
 */
public class bro {
    public static void main(String[] args)
    {
        sis a=new sis();
       // a.test(19);
       // new sis().test(5);
      //  sis.behen lol =a.new behen();
       // lol.display();
        a.dis();
        sis c= new sis(){
            
            
            void pyaar()
            {
                System.out.println("behen bhai ");
            }
        };
        c.pyaar();
        
        //new sis.bhai();(anonymous)
        sis.bhai d= new sis.bhai();
        d.set();
        System.gc();  
        
    }
    
}

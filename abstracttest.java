/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author varun
 */
abstract class ab1{
    void display()
    {
        System.out.println("abstract");
    }
    abstract void che1();
    abstract void che2();
}
class bc extends ab1{
    public void che1()
    {
        System.out.println("che1 tested in bc");
    }
    public void che2()
    {
        System.out.println("che2 tested");
    }
}
public class abstracttest {
    public static void main(String [] args)
    {
        bc b11= new bc();
        b11.che1();
        b11.che2();
        ab1 b12 = new bc();
        b12.che1();
        
    }
}

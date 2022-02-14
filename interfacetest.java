/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
interface check{
    void check1();
    void check2();
}
interface try1{
    void check3();
}
class base1 implements check
{
    base1()
    {
        System.out.println("hello");
    }
    public void check1()
    {
        System.out.println("check1 complete in base1");
    }
    public void check2()
    {
        System.out.println("check2 complete in base1");
    }
}
class base2 implements check,try1
{
    public void check1()
    {
        System.out.println("check1 complete");
    }
    public void check2()
    {
        System.out.println("check2 complete");
    }
    public void check3()
    {
        System.out.println("check 3 complete");
    }
    
}

/**
 *
 * @author varun
 */
public class interfacetest {
    public static void main(String[] args)
    {
        base1 b1 = new base1();
        b1.check1();
        b1.check2();
        base2 b2= new base2();
        b2.check1();
        b2.check2();
        b2.check3();
    }
            
}

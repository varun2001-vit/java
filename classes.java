
package practise;
class Account{
    int a=2;
    String b;
}
class rectangle{
    int l;
    int b;
    void set(int l,int b) {
        this.b=b;
        this.l=l;
    }
}


public class classes {
    public static void main(String[] args)
    {
        // Account c=new Account();
        // Account d=new Account();
        // c.a=1;
        // c.b="a";
        // System.out.println(c.a);
        // System.out.println(c.b);
        // System.out.println(d.a);
        rectangle r1=new rectangle();
        r1.set(2,3);
        System.out.println(r1.l);
    }
}

package practise;

public class test {
    public static void main(String[] args) {
        acess_modifiers b1=new acess_modifiers();
        System.out.println(b1.a);
        System.out.println(b1.b);
        //System.out.println(c1.d); cauz its private
        b1.pvt();
        System.out.println(b1.f);

    }
    
}

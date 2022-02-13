package practise;

 public class acess_modifiers {
    public int a=40;
    protected int b=30;
    private int d=10;
    int f=5;
    public void pvt()
    {
        System.out.println(d);
    }
    public static void main(String[] args)
    {
        acess_modifiers c1=new acess_modifiers();
        System.out.println(c1.a);//public
        System.out.println(c1.b);//protected
        //System.out.println(c1.d); cauz its private
        c1.pvt();//private
        System.out.println(c1.f);//default
    
    }

   

    }
    


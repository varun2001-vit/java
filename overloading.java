package practise;
class over{
    int add(int a, int b)
    {
        return a + b;
    }
    int add(int a,int b,int c)
    {
        return a + b + c;
    }
    double add(double a, double b)
    {
        return a + b;

    }
    int add(int a){
        return a;
    }
}

public class overloading {
    public static void main(String[] args)

    {
        over a=new over();
        System.out.println(a.add(25));
        System.out.println(a.add(20.3,20.5));
        System.out.println(a.add(20,20));
    }
    
}

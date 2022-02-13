package practise;
class A{
    int a;
    int b,c;
    A(int a,int b,int c)
    {
        this.a = a;
        this.b=b;
        this.c=c;
    }
    A(){
        a=b=c=0;
    }
    A(int a,int b)
    {
        this.a=a;
        this.b=b;
        c=1;
    }
    A(A x){
        this.a=x.a;
        this.b=x.b;
        this.c=x.c;
    }

}

    
    

public class contructors {
    public static void main(String[] args)
    {
        A b = new A();
        A d=new A(2,3,4);
        A f = new A(5,5);
        A c= new A(d);
        System.out.println(b.a +" "+b.b+" "+b.c);
        System.out.println(d.a +" "+d.b+" "+d.c);
        System.out.println(f.a +" "+f.b+" "+f.c);
        System.out.println(c.a +" "+c.b+" "+c.c);

    }
    
}

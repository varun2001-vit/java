
package inheritance;
class superclass{
    int a;
    int b;
    int c;
    void get(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    superclass()
    {
        System.out.println("base class");
    }
}
class subclass extends superclass
{
    int d;
    int e;
    subclass()
    {
       System.out.println("child class");
    }
    void get(int d,int e){
        this.d=d;
        this.e=e;
    }

    
}
class sub extends subclass{
    int f;
    sub()
    {
        System.out.println("sub");
    }
}
class multi extends superclass{
    multi()
    {
        System.out.println("multi");
    }
}

public class inheritance {
    public static void main(String[] args)
    {
      subclass b = new subclass();
      b.get(2,5,7);
      System.out.println(b.a);
      sub c=new sub();
      c.get(4,5);
      System.out.println(c.d);
      System.out.println(c.a);
      //multi m= new multi();

    }
}

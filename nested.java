package practise;
class outer{
    int a=20;
    protected int b=30;
    private int c=50;
    class inner{
         int x=30;
        public void display(){
            System.out.println(a +""+ b +" "+ c+" "+x);
        }

    }
}

public class nested {
    public static void main(String[] args)
    {
        outer o= new outer();
        outer.inner nest=o.new inner();
        nest.display();
    }
}

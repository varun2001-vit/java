package practise;
class boom{
    public int a;
    public static int b=2;
    public void finalize()
    {
        System.out.println("object is garbage collected");
    } 
    public static class nested{
        static int d=10;
        static int e=20;
        public int fx;
        nested()
        {
            fx=1;
        }
        public static void display(){
            System.out.println(d +" "+e);

        }
        public void out(){
            System.out.println(fx);
        }
    }
    nested l1=new nested();

}


public class nested_static {
    public static void main(String[] args)
    {
        boom.nested.display();
        boom ab= new boom();
        ab.l1.out();
        ab=null;
        System.gc();

    }
    
}

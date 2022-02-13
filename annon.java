package practise;

public class annon {
    public String message(){
        return "Hello World!";
     }
     void fact(int n){
         int fact=1;
         for(int i=1;i<=n;i++)
         {
             fact=fact*i;
        }
        System.out.println("factorialis "+fact);
    }

     public static void main(String[] args) {
        System.out.println(new annon().message());
        new annon().fact(5);
     }
    
}

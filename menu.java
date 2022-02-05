import java.util.Scanner;

public class menu {
    public static  void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int ch,choice;
        do
        {
            int a,b;
            System.out.println("---------20BDS0150----");
            System.out.println("Enter the numbers");
            a=in.nextInt();
            b=in.nextInt();
            System.out.println("Enter the choice(add=1,sub=2,mul=3,div=4");
            choice=in.nextInt();
            if(choice==1)
            {
                System.out.println("sum is"+(a+b));
            }
            else if(choice==2)
           {
            System.out.println("diffference is"+(a-b));
           }
            else if (choice==3)
            {
                System.out.println("multiplicaton result is"+(a*b));
            }
            else if(choice==4)
            {
                System.out.println("division result is"+(a/b));
            }
            System.out.println("do you want to continue(0 to stop ,1 to continue");
            ch=in.nextInt();
        }while(ch==1);
        in.close();
    }
  
    
}

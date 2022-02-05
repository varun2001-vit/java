import java.util.Scanner;

public class names_check {
    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        String[] names = new String[20];
        System.out.println("---20BDS0150---");
        System.out.println("enter the names");
        for(int i = 0; i < 5; i++)
        {
          names[i] = in.nextLine();
        }
        System.out.println("enter the name to be searched");
        a=in.nextLine();
        int f=0;
        for(int i = 0; i < 5; i++)
        {
          if(names[i].replaceAll("Dr","").trim().equals(a))
          {
              f=1;
              break;
          }
        }
        if(f==0)
        {
            System.out.println("Not found");
        }
        else 
        {
            System.out.println("found");
        }
        in.close();
       


    }
    
}

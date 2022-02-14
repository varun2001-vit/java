package labassessment;

import java.util.Scanner;

class faculty 
{
    String name;
    String id;
    static  class leaves{
        static int el=10;
        static int ml =20;
        static int cl=12;
        static void display_leaves()
        {
            System.out.println(el +" "+ ml + " "+ cl);
        }

    }
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of faculty");
        name = sc.next();
        System.out.println("enter emp id");
        id=sc.next();
    }
    void display()
    {
        System.out.println(name + " "+ id);
    }
    
}

public class leaves {
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the no of faculty");
            int n=sc.nextInt();
            
            faculty f1[]= new faculty[n];
            for(int i=0; i<n; i++)
            {
                f1[i]= new faculty();
                f1[i].get();
            }
            for(int i=0; i<n; i++)
            {
                f1[i].display();
                faculty.leaves.display_leaves();
                
            }
        }
        System.gc();
        


    }

    
}

package labassessment;

import java.util.Scanner;

class school{
    String sh;

   public class dept{
        String name,id,total;
        dept(String name,String id,String total)
        {
            this.name = name;
            this.id=id;
            this.total=total;
            
        }
        void show()
        {
            System.out.println(name+" "+id+" "+total);
        }
    }
    
   
}

public class schooldept {
    public static void main(String[] args)
    {Scanner sc = new Scanner(System.in);
        String name,code,total;
        
        school s1= new school();
        
        

        school.dept d1[]= new school.dept[2];
        System.out.println("enter the name of the school");
        s1.sh = sc.next();

       
        for(int i=0; i<d1.length; i++)
        {
            System.out.println("enter the name of department");
            name= sc.next();
            System.out.println("enter the code of the department");
            code= sc.next();
            System.out.println("enter the total number of students");
            total=sc.next();
            d1[i]=s1.new dept(name,code,total);

        }
       
        
        for(int i=0; i<d1.length; i++)
        {
            d1[i].show();
        }
        sc.close();
        
    }
    
}

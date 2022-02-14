package labassessment;

import java.util.Scanner;

interface courseTotal{
    int total(result r[]);
}
interface courseAverage{
    String avg(int n);
}
class result implements courseTotal,courseAverage{
    int sum=0;
    int marks;
    public int total(result r[]) {
        for (int i=0; i<r.length; i++)
        {
            sum=sum+r[i].marks;
        }
        return sum;
        
    }
    public String  avg (int n)
    {
        String a;
        if (n>=60)
        {
            a="first";
        }
        else if(n>=50)
        {
            a="second";
        }
        else
        {
            a="third";
        }
        return a;
    }    

}

public class coursetotal{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        result[] r = new result [5];
        for (int i=0; i<r.length; i++)
        {
             r[i] = new result();
        }
        System.out.println("enter the marks");
        for (int i=0; i<r.length; i++)
        {
            r[i].marks=in.nextInt();
        }
       
       
        in.close();


    }
    
}

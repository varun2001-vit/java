import java.util.Scanner;

public class metric {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m,p,c,e,cs;
        double oa,ea,csa;
        System.out.println("------20BDS0150---");
        System.out.println("enter the marks for subjects");
        m=in.nextInt();
        p=in.nextInt();
        c=in.nextInt();
        e=in.nextInt();
        cs=in.nextInt();
        oa=(m+p+c+e+cs)/5;
        ea=(m * 2)+ p + (c / 4); 
        csa=cs;
        if(oa>75 && ea>csa)
        {
            System.out.println("Mech, Civil, EEE, ECE candidate");
        }
        else if(oa > 75 && csa > ea )
        {
            System.out.println("CSE, IT, IS candidate ");
        }
        else if(oa < 75 && csa < ea )
        {
            System.out.println("BCA candidate  ");
        }
        else if(oa < 75 && csa > ea )
        {
            System.out.println("Bsc candidate  ");
        }
        else
        {
            System.out.println("none");
        }
        System.out.println("------20BDS0150---");
        in.close();




    }
    
}

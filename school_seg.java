import java.util.Scanner;

public class school_seg {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String[] reg=new String[5];
        String scope="BCE";
        String sense="BEC";
        int sc=0;
        int se=0;
        System.out.println("---20BDS0150---");

        System.out.println("enter the registration numbers");
        for (int i=0; i<5;i++) {
            reg[i]=in.next();
        }
        System.out.println("departmartments are as follows");
        for(int i=0; i<5; i++) 
        {
            if(reg[i].contains(scope)) {
                sc++;
            }
            else if(reg[i].contains(sense))
            {
                se++;
            }
        }
        System.out.println("Total students in SCOPE: "+ sc);
        System.out.println("Total students in SENSE: " + se);
        if(sc == 0 && se == 0)
        {
            System.out.println("No students in SENSE or SCOPE");
        }
        in.close();


    }
    
}

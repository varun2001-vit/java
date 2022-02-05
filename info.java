//package java_vit.src;

import java.util.Scanner;

public class info {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String reg_no,name;
        double cgpa;
        System.out.println("--20BDS0150--");
        System.out.println("Enter the reg_no and name of the student");
        reg_no =in.next();
        name=in.next();
        System.out.println("enter the cgpa of the student");
        cgpa=in.nextDouble();
        System.out.println("the details of the student are:");
        System.out.println("REG-no :"+ reg_no);
        System.out.println("name  :"+ name);
        System.out.println("cgpa  :"+ cgpa);
        in.close();


    }
    
}

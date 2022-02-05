import java.util.Scanner;

public class vit_no_check {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        String a="VIT";
        System.out.println("---20BDS0150---");
        System.out.println("enter the string");
        String s=in.nextLine();
        String[] words=s.split(" ");
        for (String b:words)
        {
            if (b.equals(a))
            {
                count++;
            }
        } 
        System.out.println("count: " + count);
        in.close();

        
    }
    
}

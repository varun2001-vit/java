import java.util.Scanner;
public class electricity {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double sum=0,units;
        System.out.println("-----20BDS0150------");
        System.out.println("enter the number of units");
        units = in.nextDouble();
        if(units<=100)
        {
            sum=200;
        }
        else if (units<=150){
            sum=sum+(units-100)*0.60+200;
        }
        else if (units<=200){
            units=units-100;
            sum=sum+(50)*0.60+(units-50)*1.2+200;
        }
        else if (units>200)
        {
            units=units-100;
            sum=sum+(50)*0.60+(50)*1.2+(units-100)*2.4+200;
        }
        System.out.println("price is " + sum);
        System.out.println("-----20BDS0150------");
        in.close();

    }
    
}

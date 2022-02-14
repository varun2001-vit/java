package labassessment;
class vehicle
{
    String name;
    String type;
    vehicle(String name, String type)
    {
        this.name = name;
        this.type = type;

    }
    void show()
    {
        System.out.println("vehicle");
    }
}
class car extends vehicle
{
    static int count=0;
    String company,price;
    int milege;
    car(String s, String t, String c,String p,int m)
    {
        super(s,t);
        company = c;
        price = p;
        milege = m;
    }
    void show()
    {
        System.out.println("car");
        System.out.println(name+" "+" "+type+" "+company + " " + price+" " + milege);
        //miles();
    }
    static void miles(car c[])
    {
        for (int i =0;i<c.length;i++)
        {
            if (c[i].milege>23)
            {
                car.count++;
            }
            
    }


}
}
class truck extends vehicle
{
    String company,price;
    truck(String s, String t,String c,String p)
    {
        super(s,t);
        company = c;
        price = p;
    }
    void show()
    {
        System.out.println("truck");
        System.out.println(name+" "+" "+type+" "+company + " " + price+" ");
    }
   
} 

public class vehical {
    public static void main(String[] args)
    {
    //   car v1= new car("car","4 -wheeler","honda","2 lakhs",29);
    //   car v2= new car("car","4 -wheeler","honda","1 lakhs",10);
    //   v1.show();
    //   v2.show();
        car[] c= new car[3];
         c[0]= new car("car","4 -wheeler","honda","100000",10);
         c[1]= new car("car","4 -wheeler","maruti","200000",29);
         c[2]= new car("car","4 -wheeler","tata","4000000",40);
         car.miles(c);
         System.out.println("******20BDS0150******");
         System.out.println("******car info******");
         c[0].show();
         c[1].show();
         c[2].show();
         System.out.println("total cars with milege greater than 23"+car.count);
         truck[] t= new truck[2];
         System.out.println("****truck info****");
         t[0]= new truck("truck","5 -wheeler","bajaj","1000000");
         t[1]= new truck("truck","5 -wheeler","mahindra","20000000");
         t[1].show();
         t[0].show();
         
    }
    
}

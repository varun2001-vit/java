import java.util.Scanner;

public class registr_check {
    public static void main(String[] args) {
        String tel,reg;
        int t=0,r=0;
        

        Scanner in = new Scanner(System.in);
        System.out.println("---20BDS0150---");
        System.out.println("enter the regno and number");
        reg = in.next();
        tel = in.next();
        if(reg.length()!=9)
        {
          System.out.println("Invalid reg number");
        }
        if(tel.length()!=10)
        {
          System.out.println("Invalid telephone number");
        }
        if(reg.length()==9)
        {
        for(int i=0;i<reg.length();i++)
        {
            //int a=reg.codePointAt(i);//gives unicode
            if(reg.codePointAt(i)=='A'||reg.codePointAt(i)=='B'||reg.codePointAt(i)=='C'||reg.codePointAt(i)=='D'||reg.codePointAt(i)=='E'||reg.codePointAt(i)=='F'||reg.codePointAt(i)=='G'||reg.codePointAt(i)=='H'||reg.codePointAt(i)=='I'||reg.codePointAt(i)=='J'||reg.codePointAt(i)=='A'||reg.codePointAt(i)=='K'||reg.codePointAt(i)=='L'||reg.codePointAt(i)=='M'||reg.codePointAt(i)=='N'||reg.codePointAt(i)=='O'||reg.codePointAt(i)=='P'||reg.codePointAt(i)=='Q'||reg.codePointAt(i)=='R'||reg.codePointAt(i)=='S'||reg.codePointAt(i)=='T'||reg.codePointAt(i)=='U'||reg.codePointAt(i)=='V'||reg.codePointAt(i)=='W'||reg.codePointAt(i)=='X'||reg.codePointAt(i)=='Y'|| reg.codePointAt(i)=='Z'|| reg.charAt(i)=='1' || reg.charAt(i)=='2' || reg.charAt(i)=='3' || reg.charAt(i)=='4' || reg.charAt(i)=='5' || reg.charAt(i)=='6' || reg.charAt(i)=='7' || reg.charAt(i)=='8' || reg.charAt(i)=='9'|| reg.charAt(i)=='0')
            {
               r=0;
              
            }
            else
                {
                    r=1;
                    break;
                }
          
        }
        if(r==0)
        {
            System.out.println("Valid regno");
        }
        else 
        {
            System.out.println("Invalid reg number(invalid characters)");
        }
        }

        if(tel.length()==10)
        {
        for(int i=0;i<tel.length();i++)
        {
            //int a=reg.codePointAt(i);
           // if(a<97 or a>122)
           if(tel.charAt(i)=='1' || tel.charAt(i)=='2' || tel.charAt(i)=='3' || tel.charAt(i)=='4' || tel.charAt(i)=='5' || tel.charAt(i)=='6' || tel.charAt(i)=='7' || tel.charAt(i)=='8' || tel.charAt(i)=='9' || tel.charAt(i)=='0')
           {
               t=0;
               
           }
           else 
           {
               t=1;
               break;
           }
        }
        if(t==0)
        {
            System.out.println("Valid telephone");
        }
        else 
        {
            System.out.println("Invalid telephone number(invalid characters)");
        }
        }




        in.close();
        
    }
    
}

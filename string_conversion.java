import java.util.Scanner;

public class string_conversion {
    
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("---20BDS0150---");
        System.out.println("enter the string");
        String sc=in.nextLine();
        StringBuffer sb=new StringBuffer();
        StringBuffer sd=new StringBuffer();
        StringBuffer v=new StringBuffer();

        char ch[] = sc.toCharArray();
      for(int i = 0; i < ch.length; i++) {
         String hex = Integer.toHexString(ch[i]);
         String bin=Integer.toBinaryString(ch[i]);
         sb.append(hex);
         sd.append(bin);
      }
     
      
      
      
      String r = sb.toString();
      String b= sd.toString();
      //hex to binary
      for(int i=0; i<r.length(); i++)
      {
          switch(r.charAt(i))
          {
              case '0':v.append("000");
              break;
              case '1':v.append("001");
              break;
              case '2':v.append("010");
              break;
              case '3':v.append("011");
              break;
              case '4':v.append("100");
              break;
              case '5':v.append("101");
              break;
              case '6':v.append("110");
              break;
              case '7':v.append("111");
              break;
              case '8':v.append("1000");
              break;
              case '9':v.append("1001");
              break;
              case 'a':v.append("1010");
              break;
              case 'b':v.append("1011");
              break;
              case 'c':v.append("1100");
              break;
              case 'd':v.append("1101");
              break;
              case 'e':v.append("1110");
              break;
              case 'f':v.append("1111");
              break;

          }

      }
      String bd=v.toString();
       System.out.println("string in binary");
      System.out.println(b);
      System.out.println("string in hex");
      System.out.println(r);
      System.out.println("string in hex to binary");
      
      System.out.println(bd);
      in.close();

    }
    
}

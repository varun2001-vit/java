public class strings {
    public static void main(String[] args) 
    {
        String a="dr varun";

        String b="varun";
        a=a.replaceAll("dr","");
       // a=a.trim();
        boolean c=a.equals(b);
        System.out.println(c);
        a=a.trim();
        System.out.println(a.length());
    }
    
}

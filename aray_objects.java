package practise;
import java.util.Scanner;
class Student{
    String name;
    int age;
    void enter(String name,int age){
    this.name = name;
    this.age= age;
    }
    void out(){
        System.out.println(name + " " + age);
    }
    }
public class aray_objects{
    public static void main(String[] args)
    {
        Student[] s=new Student[3];

        String name;
        int age;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<s.length;i++)
        {
            s[i]=new Student();
            System.out.println("enter the name");
            name=sc.next();
            System.out.println("enter the age");
            age=sc.nextInt();
            s[i].enter(name,age);



        }
        for(int i=0;i<s.length;i++)
        {
            s[i].out();
        }
        sc.close();
    }
}
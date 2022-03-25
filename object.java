/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author varun
 */
class student implements Serializable
{
    String name;
    String roll;

    public student(String name,String roll) {
        this.name=name;
        this.roll=roll;
    }
    void display()
    {
        System.out.println("name:"+name);
        System.out.println("rolll:"+ roll);
    }
    
}
public class object {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        student st = new student("varun","50");
        File obj = new File("try.txt");
        System.out.println(obj.getAbsolutePath());
        FileOutputStream fout= new FileOutputStream(obj);
        ObjectOutputStream obout= new ObjectOutputStream(fout);
        obout.writeObject(st);
        obout.close();
        FileInputStream fin= new FileInputStream(obj);
        ObjectInputStream obin= new ObjectInputStream(fin);
        student s= null;
        s=(student)obin.readObject();
        s.display();
        
        
        
        
        
    }
    
}

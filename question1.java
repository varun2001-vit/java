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

/**
 *
 * @author varun
 */
public class question1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         File obj = new File("C:\\Users\\varun\\Documents\\fall sem\\java\\java_vit\\src\\files\\hello.txt");
         String name="varun is here";
         byte x[]=name.getBytes();
        try (FileOutputStream fout = new FileOutputStream(obj)) {
            fout.write(x);
        }
         try (FileInputStream fin = new FileInputStream(obj)) {
            byte[] b = new byte[(int)obj.length()];
            fin.read(b);
            byte[] c = new byte[(int)obj.length()];
            for(int i=0;i<c.length;i++)
            {
                c[i]=b[c.length-1-i];            
            }
            System.out.println("orginal string in the file");
            for (byte k:b)
            {
                System.out.print((char)k);
                
            }
            System.out.println();
            System.out.print("reversed string of the file");
            System.out.println();
            for (byte k:c)
            {
                System.out.print((char)k);
                
            }
            System.out.println();
        }
        
    }
    
}

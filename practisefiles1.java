/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author varun
 */
public class practisefiles1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File obj = new File("C:\\Users\\varun\\Documents\\fall sem\\java\\java_vit\\src\\files\\hello.txt");
        FileInputStream fin = new FileInputStream(obj);
       
        int word;
       
       
        while((word=fin.read())!=-1)
       {
            System.out.print((char)word);
       }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author varun
 */
public class question2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try ( // File obj = new File("letter.txt");
                FileWriter fc = new FileWriter("letter.txt")) {
            BufferedWriter bc=new BufferedWriter(fc);
            for(int i=65;i<=90;i++)
            {
                bc.write(i);
                bc.write(" ");
            }
            
            bc.close();
        }
        FileReader fr=new FileReader("letter.txt");    
          BufferedReader br=new BufferedReader(fr);
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }
          System.out.println();
          br.close();
          fr.close();
          //Reading from the console
           InputStreamReader r=new InputStreamReader(System.in);    
            BufferedReader dr=new BufferedReader(r);           
            String letter="";    
            System.out.println("enter the alphabets");
            while(!letter.equals("stop")){    

             letter=dr.readLine();
             if(!letter.equals("stop"))
                     {
                         System.out.println("Letter is:"+letter+" ");
                     }
                
             
            }              
           br.close();    
           r.close();    
    }    
    }  
          
    
    


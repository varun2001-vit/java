//package java_vit.src;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author varun
 */
public class bmi {
     public static void main(String[] args)
    {   try (Scanner in = new Scanner(System.in)) {
        double weight,height;
        System.out.println("--20BDS0150--");
        System.out.println("enter the weight of the person in kgs");
        weight=in.nextDouble();
        System.out.println("enter the height of the person in  cm");
        height=in.nextDouble();
        height=height/100;
         double bmi=weight / (height*height);
        System.out.println(" the bmi is "+ bmi +" kg/m^2");
    }
    }
    
}

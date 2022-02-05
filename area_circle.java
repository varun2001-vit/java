/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author varun
 */
public class area_circle {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    double radius,area;
    System.out.println("--20BDS0150--");
    System.out.println("enter the radius");
    radius=in.nextDouble();
    area=3.14*radius*radius;
     System.out.println("area  is  " + area + " m^2");
    in.close();
    
}
}

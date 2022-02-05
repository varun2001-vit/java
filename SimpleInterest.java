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
public class SimpleInterest {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    double rate,amount,interest;
    int time;
    System.out.println("--20BDS0150--");
    System.out.println("enter the amount");
    amount=in.nextDouble();
     System.out.println("enter the time");
    time=in.nextInt();
     System.out.println("enter the rate");
    rate=in.nextDouble();
    interest=(amount*time*rate);
     System.out.println("simple interet is Rs "+interest);
    in.close();
    
}
}

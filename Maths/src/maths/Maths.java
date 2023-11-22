/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Maths {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
      
      Scanner myinput = new Scanner(System.in);
        
      System.out.println("Division");
      System.out.println("Enter X");
      double x = myinput.nextInt();
      System.out.println("Enter Y");
      double y = myinput.nextInt();
      double z = x/y;
      System.out.println("x/y: " + z);
      
        System.out.println("Multipcation");
      System.out.println("Enter h");
      double h = myinput.nextInt();
      System.out.println("Enter h");
      double d = myinput.nextInt();
       double m = h*d;
      System.out.println("c*d: " + m);
      
      System.out.println("Subtraction");
      System.out.println("Enter k");
      double j = myinput.nextInt();
      System.out.println("Enter d");
      double s = myinput.nextInt();
       double v = j-s;
      System.out.println("k-d: " + v);
      
      System.out.println("Addition");
      System.out.println("Enter g");
      double g = myinput.nextInt();
      System.out.println("Enter f");
      double f = myinput.nextInt();
       double n = g+f;
      System.out.println("g+f: " + n);
      


    

      
      
      
      
  
         
    }
    
}
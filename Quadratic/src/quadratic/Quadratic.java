/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Quadratic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println("insert value for a:");
  Scanner scan1 = new Scanner(System.in);
   double a = scan1.nextDouble();
    System.out.println("insert value for b:");
  Scanner scan2 = new Scanner(System.in);
    double b = scan2.nextDouble();
    System.out.println("insert value for C:");
  Scanner scan3 = new Scanner(System.in);
   double c = scan3.nextDouble();

    double answer =((Math.sqrt(Math.pow(b,2)-(4*a*c))-b)/2);
      double final2 =(-b + Math.sqrt(Math.pow(b,2)-(4*a*c)))/2;
  System.out.println("The x values are:" + answer + final2);
    }
    
}

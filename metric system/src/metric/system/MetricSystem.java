 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metric.system;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class MetricSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myinput = new Scanner(System.in);
        System.out.print("Input a value for foot: ");
        double foot = myinput.nextDouble();
        double inch = foot * 12 ;
        System.out.println(inch + " inches" );
        double inch1 = inch * 2.54;
        System.out.println(inch1 + " cm" );
    }
             
}

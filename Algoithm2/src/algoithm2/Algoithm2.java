/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoithm2;

import java.util.Scanner;

/**
 *
 * @author gghat
 */
public class Algoithm2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n1 = input.nextInt();
        if (n1 ==0) {
            System.out.println("Monday");
        } else if (n1 == 1) {
            System.out.println("Tuesday");
        } else if (n1 == 2) {
            System.out.println("Wednesday");
        } else if (n1 == 3) {
            System.out.println("Thusday");
        } else if (n1 == 4) {
            System.out.println("Friday");
        } else if (n1 == 5) {
            System.out.println("Saturday");
        } else if (n1 == 6) {
            System.out.println("Sunday");
        } else{
            System.out.println("Invalid number entered");
        }
    }
    
}

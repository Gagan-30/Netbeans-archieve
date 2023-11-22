/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm1;

import java.util.Scanner;

/**
 *
 * @author gghat
 */
public class Algorithm1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        double n1 = input.nextDouble();
        System.out.println("Enter number 2");
        double n2 = input.nextDouble();
        if (n1 > n2) {
            System.out.println("The larger number is " + n1);
        } else {
            System.out.println("The larger number is " + n2);
        }
    }

}

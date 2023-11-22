/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Supermarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner myInput = new Scanner(System.in);
        System.out.println("How many apple do you want");
        int apple = myInput.nextInt();
        System.out.println("How many bananas do you want");
        int banana = myInput.nextInt();
        System.out.println("How much catfood do you want");
        int catfood = myInput.nextInt();
        double total = apple * 0.99 + banana * 1.99 + catfood * 6.99;
        System.out.println("Yor total is " + total);
        System.out.println("What is your age");
        int age = myInput.nextInt();
        double discount = 0;
        
        if (age >= 73) {
            discount =  total * 0.25;
            System.out.println("Your discounted price is from " + discount);
        }
    }

}

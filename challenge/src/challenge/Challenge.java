/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("input test scores");
        do {
            int percentage = input.nextInt();
            if (percentage>=(75)) {
                System.out.println("Distinction");
            } else if (percentage >= 60) {
                System.out.println("Merit");
            } else if (percentage>= 50){
                System.out.println("Pass");
            }
        System.out.println();
        }
    }

}

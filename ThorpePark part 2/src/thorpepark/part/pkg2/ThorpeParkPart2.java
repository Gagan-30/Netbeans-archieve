/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thorpepark.part.pkg2;

import java.util.Scanner;

/**
 *
 * @author Ghatahora
 */
public class ThorpeParkPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);
        double height;
       int age = myInput.nextInt();
        System.out.println("Enter your height in metres");
        height = myInput.nextDouble();
        if (height <= 1.2) {
            System.out.println("you are too short");
        } else if (height >= 1.2) {
            System.out.println("You can ride ");
        }else if (height >= 1.6) {
            System.out.println("You are older than 12");
            }else if (age <= 12) {
            System.out.println("WOW");
        } else {
            System.out.println("You need to be 1.2m or above");
        }
    }

}

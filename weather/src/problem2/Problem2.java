/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Input weather");
        String weather = input.nextLine();

        if ("sunny".equals(weather)) {
            System.out.println("Wear shorts and sandals");
        } else {
            System.out.println("Wear a coat");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Gagandeep
        Scanner input = new Scanner(System.in);
        System.out.println("Input your weight");
        float weight = input.nextFloat();
        System.out.println("Input your height");
        float height = input.nextFloat();
        float BMI = weight / (height * height);
        System.out.println(BMI+" BMI");

    }

}

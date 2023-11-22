/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelif;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Ifelif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //program1();
        //program2();
        //program3();
        //program4();
        program5();
    }

    private static void program1() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mark: ");
        int mark = input.nextInt();
        if (mark >= 40) {
            System.out.println("Passed");
        }
    }

    private static void program2() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mark: ");
        int mark = input.nextInt();
        if (mark <= 20) {
            System.out.println("Failed");
        } else {
            System.out.println("Passed");
        }
    }

    private static void program3() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mark: ");
        int mark = input.nextInt();
        if (mark >= 320) {
            System.out.println("Grade A");
        } else if (mark >= 280) {
            System.out.println("Grade B");
        } else if (mark >= 240) {
            System.out.println("Grade C");
        } else if (mark >= 200) {
            System.out.println("Grade D");
        } else if (mark >= 160) {
            System.out.println("Grade E");
        } else {
            System.out.println("U");
        }
    }

    private static void program4() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mark: ");
        int test1 = input.nextInt();
        int test2 = input.nextInt();
        test1 = test1 * 2;
        int total = (test1 + test2) / 2;

        if (total >= 80) {
            System.out.println("Grade A");
        } else if (total >= 70) {
            System.out.println("Grade B");
        } else if (total >= 60) {
            System.out.println("Grade C");
        } else if (total >= 50) {
            System.out.println("Grade D");
        } else if (total >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("U");
        }

    }

    private static void program5() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num = input.nextInt();
        int total = num % 2;
        
        if (!(total == 0)){
            System.out.println(num + " is an odd number");
        } else{
            System.out.println(num + " is an even number");
        }
        
    }

}

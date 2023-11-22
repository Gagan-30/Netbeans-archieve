/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        first();
        second();
        third();
        fourth();
    }

    public static void first() {

        final int score = 25;
        if (score > 30) {
            System.out.println("Expert");
        } else {
            System.out.println("Novice");
        }
    }

    public static void second() {
        final Scanner input = new Scanner(System.in);
        System.out.println("enter exam mark");
        final int mark = input.nextInt();
        if (mark > 50) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

    public static void third() {
        //Gagandeep
        final String newname;
        final String user_name = "Ted";

        if (!user_name.equals("Fred")) {
            newname = "Mick";
        } else {
            newname = "Tom";
        }
        System.out.println("Hi " + newname);
    }

    public static void fourth() {
        //Gagandeep
        final Scanner input = new Scanner(System.in);
        String regex = "([0-9][0-9]|[0-9]";
        System.out.println("enter dog age");
        String userInput = input.nextLine();

        if (userInput.matches(regex)) {
            int dogyears = Integer.parseInt(userInput);

            if (dogyears > 2) {
                int dog = (int) ((2 * 9) + ((dogyears - 2) * 7.84));
                System.out.println("Your dogs human age is " + dog);
            }
        } else if (dogyears<= 2) {
            System.out.println("Error");
        }
    }
}

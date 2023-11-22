/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age.selection;

import java.util.Scanner;

/**
 *
 * @author Ghatahora
 */
public class AgeSelection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner myinput = new Scanner(System.in);

        int age;

        System.out.println(" enter your age");

        age = myinput.nextInt();

        if (age >= 65) {

            System.out.println("you are elderly and deserve a pention");

        } else if (age >= 18) {

            System.out.println("you are old enough to vote");

        } else if (age == 17 || age == 16) {

            System.out.println("you are almost eligble to vote,unlucky");
        } else if (age <= 0) {

            System.out.println("that is not your age");
        } else {

            System.out.println("you're  not old enough ");

        }
        {

        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subroutine;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Subroutine {

    /**
     * @param args the command line arguments
     */
    static String name;

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);  //declare scanner
        System.out.println("Enter a name");
        name = input.nextLine();  //input name

        initial();  //initialise subroutine
        int length = name.length(); //length of name
        if (length > 10) {
            longname();  // declare subroutine
        }

    }

    private static void initial() {    // name passed to subroutine
        System.out.println(name.charAt(0));  //first letter of name
    }

    private static void longname() {  // name passed to subroutine
        System.out.println("Wow! What a long name!"); // output if name is > 10 char
    }

}

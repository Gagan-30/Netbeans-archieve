/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function;

import java.util.Scanner;

/**
 *
 * @author gghat
 */
public class Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String s = input(); // named s passes to input method
        String out = output(s); // named out, s passes to output method
        System.out.println(out); // output

    }

    private static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = sc.nextLine();

        return sentence; // sentence goes to s
    }

    public static String output(String s) {
        String[] words = s.split(" "); //number of words stored in array
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i].length() + " "; // searches for number characters in words
        }

        return result; // result goes to out
    }

}

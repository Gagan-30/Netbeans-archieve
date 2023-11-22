/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.pkg11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 10373
 */
public class Algorithm11 {

    private static int tries;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //alg11();
        //alg12();
        //alg13();
        //alg14();
        //alg15();
        alg16();
        //alg17();
        //alg18();
        //alg19();
        //alg20();
        //alg21();
    }

    public static void alg11() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

    }

    public static void alg12() {
        Scanner input = new Scanner(System.in);

        String rp = "12345";
        System.out.println("enter password");
        String up = input.next();

        if (!rp.equals(up)) {
            System.out.println("Denied");
        } else {
            System.out.println("Correct");
        }
    }

    public static void alg13() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kg");
        int kg = input.nextInt();

        System.out.println("Enter height in meters");
        int height = input.nextInt();

        int BMI = kg / height * height;
        System.out.println(BMI);
    }

    public static void alg14() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = input.nextLine();
        String first = sentence.substring(0).toLowerCase();
        int length = sentence.length();

        if (sentence.isEmpty()) {
            System.out.println("What happened?");
        }
        if (sentence.contains(first)) {
            System.out.println("No captial letter");
        } else {
            System.out.println("There is a captial");
        }
        if (sentence.endsWith(".")) {
            System.out.println("there is a fullstop");
        } else {
            System.out.println("there is no fullstop");
        }
        if (sentence.contains("and")) {
            System.out.println("contains and");
        } else {
            System.out.println("no and found");
        }

    }

    public static void alg15() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter sentence");
        String address = input.nextLine();
        int space = address.indexOf(" ");
        String door = address.substring(0, space);
        int doornumber = Integer.parseInt(" ");
        if (doornumber % 2 == 0) {
            System.out.println("left side");
        } else {
            System.out.println("right side");
        }

    }

    public static void alg16() {
        Scanner input = new Scanner(System.in);
        String title;
        while (true) {
            System.out.println("Enter name");
            String name = input.nextLine();
            System.out.println("Enter gender");
            boolean gender = input.nextBoolean();
            if (gender == false) {
                title = "Ms";
            } else {
                title = "Mr";
            }
            System.out.println("Welcome " + title + " " + name);

        }
    }

    public static void alg17() {
        Scanner input = new Scanner(System.in);
        String password = "BigBoss";
        int tries = 0;

        String userinput;

        do {
            System.out.println("enter password");
            userinput = input.next();
            System.out.println((!userinput.equals(password)) ? "password incorrect" : "password authorised");

            tries += 1;

        } while (!userinput.equals(password));

        System.out.println("your numbers of tries " + tries);

    }

    public static void alg18() {
        Scanner input = new Scanner(System.in);
        String password = "BigBoss";
        int i = 0;
        int tries = 0;

        String userinput;

        do {
            System.out.println("enter password");
            userinput = input.next();
            System.out.println((!userinput.equals(password)) ? "password incorrect" : "password authorised");

            tries += 1;
            i++;

        } while (i < 3 && !userinput.equals(password));

        System.out.println("your numbers of tries " + tries);
        if (!userinput.equals(password)) {
            System.out.println("logon faliure");
        }

    }

    public static void alg19() {
        for (int i = 71; i <= 100; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + " = " + (i * j));
            }
            System.out.println(" ");
        }

    }

    public static void alg20() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter start number");
        int s = input.nextInt();
        System.out.println("enter end value ");
        int e = input.nextInt();
        System.out.println("enter decrement value");
        int decrement = input.nextInt();

        for (int i = s; i >= e; i -= decrement) {

            System.out.println(i);

        }
    }

    public static void alg21() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string");
        String user = input.nextLine();
        String Caps = user.toUpperCase();
        System.out.println(Caps);
        if (Caps) {
		System.out.print("Zero");
             
            }
        }
    }


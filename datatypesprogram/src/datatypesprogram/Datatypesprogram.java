/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypesprogram;

import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class Datatypesprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //program1();
        //program2();
        //program3();
        program4();

    }

    private static void program1() {
        Scanner input = new Scanner(System.in);

        double pi = 3.142;
        double radius;

        do {
            System.out.println("Enter the radius: ");
            radius = input.nextDouble();

            if (radius <= 0) {
                System.out.println("Above 0");
            }
        } while (radius < 0);

        double diameter = radius * 2;
        double circumference = diameter * pi;
        double area = pi * (radius * radius);

        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

    }

    private static void program2() {
        Scanner input = new Scanner(System.in);
        double muffins = 0;
        double people = 0;

        do {
            System.out.println("Enter number of muffins: ");
            muffins = input.nextDouble();
            if (muffins < 0) {
                System.out.println("Above 0");
            }
            System.out.println("Enter number of people: ");
            people = input.nextDouble();
            if (people < 0) {
                System.out.println("Above 0");
            }

        } while (muffins <= 0 && people < 0);
        Double shared = muffins / people;
        System.out.println(shared);
    }

    private static void program3() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstname = input.nextLine();
        System.out.println("Enter last name: ");
        String lastname = input.nextLine();
        String fullname;

        char firstletter = firstname.charAt(0);
        char lastletter = lastname.charAt(0);
        fullname = firstname + " " + lastname;
        System.out.println(fullname + " " + firstletter + " " + lastletter);

    }

    private static void program4() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed: ");
        Double speed = input.nextDouble();
        System.out.println("Enter y if seatbelt is on or n if not");
        String seatbelt = input.nextLine();
        if ("y".equals(seatbelt)) {
            System.out.println("alarm will sound");
        } else {
            System.out.println("alarm will sound");
        }

    }

}

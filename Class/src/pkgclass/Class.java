/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgclass;

import java.util.Scanner;

/**
 *
 * @author gghat
 */
public class Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        user.firstname = input.nextLine();
        System.out.println("Enter last name");
        user.lastname = input.nextLine();
        System.out.println("full name is   " + user.getfullname());

    }

}

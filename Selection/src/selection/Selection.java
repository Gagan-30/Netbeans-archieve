/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Selection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner myinput = new Scanner(System.in);
        String school;
        System.out.println("Which school is the best in Ealing?");
        school = myinput.nextLine();
        school = school.toLowerCase();
        if (school.equals("dwhs")) {

            System.out.println("Yes, Dormers is the best school in Ealing");
        } else if (school.equals("greenord")) {
            System.out.println("No, Dormers is the best school in Ealing");
        } else if (school.equals("villiers")) {
            System.out.println("No, Dormers is the best school in Ealing");
        } else {
            System.out.println("No, Dormers is the best school in Ealing");
        }

    }

}

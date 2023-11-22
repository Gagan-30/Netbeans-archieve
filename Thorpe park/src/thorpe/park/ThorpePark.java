/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thorpe.park;

import java.util.Scanner;

/**
 *
 * @author Ghatahora
 */
public class ThorpePark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner myInput = new Scanner(System.in);

        String queen;
        System.out.println("Please enter your name");
        queen = myInput.nextLine().toLowerCase();
        if (queen.equals("queen")) {
            System.out.println("Welcome her Majesty");
        } else {
            System.out.println("Get to the back of the queue");

        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvshow;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Tvshow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of shows you want");
        int numberofshows = input.nextInt();//stores numberofshows as number of elements

        String[] tvshow = new String[numberofshows];

        for (int i = 0; i < numberofshows; i++) {
            System.out.println("Enter name of show " + (i+1));
            
        }
    }

}

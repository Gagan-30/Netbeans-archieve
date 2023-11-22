/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytask;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Arraytask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        p1();
    }

    private static void p1() {
        System.out.println("Enter the size of the array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int myArray[] = new int[size];
        System.out.println("Enter the elements of the array one by one ");

        for (int i = 0; i < size; i++) {
            myArray[i] = input.nextInt();
        }
        System.out.println("Contents of the array are: " + Arrays.toString(myArray));

    }

}

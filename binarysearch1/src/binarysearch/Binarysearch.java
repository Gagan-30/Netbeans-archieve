/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Binarysearch {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        int array[] = p1();

        Scanner input = new Scanner(System.in);
        int midpoint;
        int searchCriteria = input.nextInt();
        int lowerBound = 0;
        int upperBound = array.length - 1;
        boolean found = false;

        while (!found && upperBound >= lowerBound) {
            midpoint = (upperBound + lowerBound) / 2;

            if (array[midpoint] == searchCriteria) {
                found = true;
                System.out.println("Item found at: " + midpoint);
            } else if (searchCriteria > array[midpoint]) {
                lowerBound = midpoint + 1;
            } else {
                upperBound = midpoint - 1;
            }
        }
    }

    private static int[] p1() {
        int array[] = null;
        System.out.println("Enter the size of the array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int myArray[] = new int[size];
        System.out.println("Enter the elements of the array one by one ");

        for (int i = 0; i < size; i++) {
            myArray[i] = input.nextInt();
        }
        System.out.println("Contents of the array are: " + Arrays.toString(myArray));

        return myArray;
    }
}
//

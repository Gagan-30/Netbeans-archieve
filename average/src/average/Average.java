/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average;

import java.util.Scanner;

/**
 *
 * @author gghat
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // p1();
        p2();
    }

    private static void p1() {
        int n, max, min, sum = 0;
        double average = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements you want to input in array: ");
        n = input.nextInt();
        int a[] = new int[n];
        max = a[0];
        min = a[0];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            sum += a[i];
            average = (double) sum / a.length;
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }

    private static void p2() {
        int[] array = {3, 15, 16, 20, 27, 56, 99, 102, 156};
        int midpoint, searchCriteria = 20;
        int lowerBound = 0;
        int upperBound = array.length - 1;
        boolean found = false;
        while (!found && upperBound >= lowerBound) {
            midpoint = upperBound + lowerBound / 2;
            if (midpoint == searchCriteria) {
                found = true;
                System.out.println("Item found at: " + midpoint);
            } else if (searchCriteria > array[midpoint]) {
                lowerBound = array[midpoint] + 1;
            } else if(searchCriteria < array[midpoint]){
                upperBound = array.length - 1;
            }
        }
    }

}

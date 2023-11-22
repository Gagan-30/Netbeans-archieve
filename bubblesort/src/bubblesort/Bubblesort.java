/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;

/**
 *
 * @author 10373
 */
public class Bubblesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] values = {5, 2, 1, 3, 6, 4};
        boolean swapped;
        do {

            swapped = false;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] > values[i + 1]) {
                    int temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                    swapped = true;
                    System.out.println(Arrays.toString(values));
                }
            }
        } while (swapped);

    }
}

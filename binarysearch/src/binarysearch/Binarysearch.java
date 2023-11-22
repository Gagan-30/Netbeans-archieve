/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author 10373
 */
public class Binarysearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {3, 15, 16, 20, 27, 56, 99, 102, 156};
        int midpoint; int searchCriteria = 20;
        int lowerBound = 0;
        int upperBound = array.length - 1;
        boolean found = false;
        while (!found && (upperBound >= lowerBound)) {
            midpoint = (upperBound + lowerBound) / 2;
            if (midpoint == searchCriteria) {
                found = true;
                System.out.println("Item found at: " + midpoint);
            } else if (searchCriteria > array[upperBound/2]) {
                midpoint = array[(upperBound/2) + 1];
            } else if(searchCriteria < array[upperBound/2]){
                midpoint = array.length - 1;
            }
        }
    }
}

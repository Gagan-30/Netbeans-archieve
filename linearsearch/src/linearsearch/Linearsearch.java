/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Linearsearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int array[] = {1, 41, 6, 31, 62, 3, 37, 33, 15};
        int criteria = 15;

        System.out.println("Search criteria is " + criteria);

        boolean found = false;
        int i = 0;
        while (!found && i < array.length) {
            if (criteria == array[i]) {
                found = true;
            } else {
                i++;
            }
            System.out.println(found);
        }
        if(!found){
            System.out.println("Item is not found");
        }
    }
}

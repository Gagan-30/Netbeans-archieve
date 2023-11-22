/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marty;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Marty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Gagandeep 
        Scanner input = new Scanner(System.in);
        System.out.println("how many bottles do you want?");
        int milk = input.nextInt();
        double price = 0.25;
        double total = milk * price;
        System.out.println("£"+total);
        System.out.println("you have "+ milk +" bottles");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypatterns;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class ArrayPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //p1();
        //p2();
        //p3();
        //p4();
        p5();
    }

    private static void p1() {
        int myArray[] = {25, 2, 30, 4, 53, 42};

        int length = myArray.length;
        for (int i = 0; i < length; i++) {
            System.out.println(+myArray[i] + " ");
        }
    }

    private static void p2() {
        Scanner input = new Scanner(System.in);
        int myArray[] = {25, 2, 30, 4, 53, 42};

        int length = myArray.length;
        for (int     = 0; i < length;
        i++
        
            ) {
        System.out.println(">");
            myArray[i] = input.nextInt();
        }

    }

    private static void p3() {
        int myArray[] = {25, 2, 30, 4, 53, 42};

        int length = myArray.length;
        int x = 0;
        for (int i = 0; i < length; i++) {
            if (myArray[i] < myArray[x]) {
                x = i;
            }
        }
    }

    private static void p4() {
        int myArray[] = {25, 2, 30, 4, 53, 42};

        int length = myArray.length;
        for (int i = 0; i < length; i++) {
            System.out.println(i + ". " + myArray[i]);

        }
    }

    private static void p5() {
       
    }
    
    
}

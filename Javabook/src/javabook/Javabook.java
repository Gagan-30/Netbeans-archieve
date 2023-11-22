/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabook;

/**
 *
 * @author gghat
 */
public class Javabook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mdarray1();
        mdarray2();
    }

    private static void mdarray1() {
        int twoD[][] = new int[4][5];
        int k = 0;
        
        for (int i = 0; i < 4; i++) 
            for (int j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) 
            System.out.print(twoD[i][j] + " ");
            System.out.println();
            
        }
        

    }

    private static void mdarray2() {

        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(twoD[i][j] + " ");
                }
                System.out.println();

            }

        }

    }
}

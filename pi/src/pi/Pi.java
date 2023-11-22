/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 10373
 */
public class Pi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
 
    // Function to calculate and print the surface area and volume of a sphere

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radius;
        System.out.println("Enter the radius of the sphere");
        try{
            radius=Double.parseDouble(br.readLine());
        }catch (IOException | NumberFormatException e){
            System.out.println("An error occurred");
            return;
        }
        if(radius<=0){
            System.out.println("Wrong Input");
            return;
        }
        System.out.println("Volume = " + (4*Math.pow(radius,3)*Math.PI)/3);
        System.out.println("Surface area = " + (4*Math.PI*Math.pow(radius,2)));
    
    }
    
}

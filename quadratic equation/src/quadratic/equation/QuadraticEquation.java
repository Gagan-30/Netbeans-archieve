/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic.equation;

/**
 *
 * @author Ghatahora
 */
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter the values of a, b and c");
 
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
 
        double r1 = 0;
        double r2 = 0;
 
        double discriminant = b * b - 4 * a * c;
 
        if (discriminant > 0){
 
            // r = -b / 2 * a;  
            r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
 
            System.out.println("The equation has two real roots " + r1 + " and " + r2);
        }
 
 
        if (discriminant == 0){
            System.out.println("The equation has one root " +r1);
 
            r1 = -b / (2 * a);
            r2 = -b / (2 * a);
 
        }
 
        if (discriminant < 0){
            System.out.println("The equation has no real root");
 
        }
    }
    
}

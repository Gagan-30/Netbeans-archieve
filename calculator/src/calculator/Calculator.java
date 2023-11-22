/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    static int answer;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        

        System.out.println("Enter the operation");
        char operation = input.next().charAt(0); //first char has to be operator 
        System.out.println("Enter the first number");
        int value1 = input.nextInt();
        System.out.println("Enter the second number");
        int value2 = input.nextInt();

        switch (operation) {
            case '+':
                System.out.println("The answer is " + add(value1, value2)); //passes the values through to sub routine
                break;
            case '-':
                System.out.println("The answer is " + subtract(value1, value2)); //passes the values through to sub routine
                break;
            case '*':
                System.out.println("The answer is " + multiply(value1, value2)); //passes the values through to sub routine
                break;
            case '/':
                System.out.println("The answer is " + divide(value1, value2)); //passes the values through to sub routine
                break;
            default:
                System.out.println("Out of Range");
                break;
        }

    }

    private static int add(int value1, int value2) {    //values have passed through
        answer = value1 + value2;   //overwrites answer
        return answer;
    }

    private static int subtract(int value1, int value2) {   //values have passed through
        answer = value1 - value2;   //overwrites answer
        return answer;
    }

    private static int multiply(int value1, int value2) {   //values have passed through
        answer = value1 * value2;   //overwrites answer
        return answer;
    }

    private static int divide(int value1, int value2) {    //values have passed through
        answer = value1 / value2;   //overwrites answer
        return answer;
    }

}

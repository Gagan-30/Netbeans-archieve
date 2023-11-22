/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Datatypes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Type the first letter of your name"); 
       char letter = input.next().charAt(0);
       System.out.println("Letter:" + letter);
       
       Scanner myinput = new Scanner(System.in);
        System.out.println("Type your name"); 
        String name = myinput.nextLine();
        System.out.println("Hello " + name);
        
        Scanner myint = new Scanner(System.in);
       System.out.println("Enter a gender, true for male, false for female");
      boolean gender = myint.nextBoolean();
      System.out.println("you are " + gender);
      
        Scanner myin = new Scanner(System.in);
       System.out.println("Enter your age");
       int age = myin.nextInt();
      System.out.println("you are " + age);
      
      Scanner myinT = new Scanner(System.in);
       System.out.println("Enter number, it will become a decimal number");
       double numb = myinT.nextDouble();
      System.out.println("your number is " + numb);
    }
    
}
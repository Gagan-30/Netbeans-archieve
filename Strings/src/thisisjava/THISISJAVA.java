/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisisjava;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class THISISJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          Scanner myinput = new Scanner(System.in);
  
  System.out.println("Type your name");
  String name = myinput.nextLine();
  System.out.println("uuugh " + name + " Not you again");
  
  System.out.println("Type your favourite brand?");
 String brand = myinput.nextLine();
  System.out.println( brand + " why please why");
  
  System.out.println("Type your favourite colour");
        String color = myinput.nextLine();
  System.out.println( color + " what is wrong with you");
  
        System.out.println("Type your favourite animal");
       String animal = myinput.nextLine();
  System.out.println("Your a " + animal + " person");
        
       System.out.println("Type your favourite food");
       String food = myinput.nextLine();
  System.out.println( food + ", you eat weird food");
        
        System.out.println("Type your favourite music");
       String music = myinput.nextLine();
  System.out.println( music + " , you listen to weird music");
        
        System.out.println("Type your age");
       String age = myinput.nextLine();
  System.out.println( age + ", OK");
    }
    
}

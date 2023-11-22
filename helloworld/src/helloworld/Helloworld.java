package helloworld;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Helloworld {


    public static void main(String[] args) {
     
        
  System.out.println("    *"
          + "\n   ***"
          + "\n  *****"
          + "\n *******"
          + "\n *******"
          + "\n *******"
          + "\n *******"
          + "\n *******"
          + "\n  *****"
          + "\n *******");
  
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
  System.out.println( food + ", you eat wierd food");
        
        System.out.println("Type your favourite music");
       String music = myinput.nextLine();
  System.out.println( music + " , you listen to weird music");
        
        System.out.println("Type your age");
       String age = myinput.nextLine();
  System.out.println( age + ", OK");
    }
    
}

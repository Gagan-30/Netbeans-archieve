/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaper;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Rockpaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int num;
        String userChoice = "";
        String computerChoice = "";
        int userWins = 0;
        int computerWins = 0;
        
        System.out.println("Welcome to Rock, Paper, and Scissors!");
        
        // Repeat this section
        for(int i=0;i<3;i++)
        {
            System.out.print("\nPlease choose R)ock, P)aper, or S)cissors. > ");
            
            userChoice = input.nextLine();
            
            // Computer choice
            num = rand.nextInt(3);
            
            switch (num) {
                case 0:
                    computerChoice = "R";
                    break;
                case 1:
                    computerChoice = "P";
                    break;
                case 2:
                    computerChoice = "S";
                    break;
                default:
                    break;
            }
            
            // Print the computer choice
            switch (computerChoice) {
                case "S":
                    System.out.println("The computer chose scissors.");
                    break;
                case "R":
                    System.out.println("The computer chose rock.");
                    break;
                case "P":
                    System.out.println("The computer chose paper.");
                    break;
                default:
                    break;
            }
            
            // Determine a winner
            if(userChoice.equals("R") && computerChoice.equals("S"))
            {
                System.out.println("The user won!");
                userWins++;
            }
            
            else if(userChoice.equals("P") && computerChoice.equals("R"))
            {
                System.out.println("The user won!");
                userWins++;
            }
            
            else if(userChoice.equals("S") && computerChoice.equals("P"))
            {
                System.out.println("The user won!");
                userWins++;
            }
            
            else if(userChoice.equals("S") && computerChoice.equals("R"))
            {
                System.out.println("The computer won!");
                computerWins++;
            }
            
            else if(userChoice.equals("R") && computerChoice.equals("P"))
            {
                System.out.println("The computer won!");
                computerWins++;
            }
            
            else if(userChoice.equals("P") && computerChoice.equals("S"))
            {
                System.out.println("The computer won!");
                computerWins++;
            }
            
            else if(userChoice.equals(computerChoice))
            {
                System.out.println("Tie!");
            }
            // End repeat here
            System.out.println("User Wins: " + userWins + " Computer Wins: " + computerWins);
        }
        
        // Determine the final winner
        if(userWins > computerWins)
        {
            System.out.println("The user is the ultimate winner!");
        }
        else if (userWins < computerWins)
        {
            System.out.println("The computer is the ultimate winner!");
        }
        else
        {
            System.out.println("The game is tied!");
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wloops;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Wloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //q1();
        //q2();
        //q3();
        //q4();
        //q5();
        //q6();
        //q7();
        //q8();
        //q9();
        q10();
    }

    private static void q1() {
        Scanner input = new Scanner(System.in);
        System.out.println("How are you feeling?");
        String feeling = input.nextLine();
        while (!feeling.equals("happy")) {
            System.out.println("Feeling, " + feeling + " is not acceptable. How are you really feeling?");
            feeling = input.nextLine();
        }
    }

    private static void q2() {
        int count = 1;
        while (count < 10) {
            System.out.println("Stop");
            count = count + 1;
        }
    }

    private static void q3() {
        int count = 0;
        while (count <= 6) {
            System.out.println(count);
            count = count + 2;
        }
    }

    private static void q4() {
        int count = 16;
        while (count > 5 & count < 20) {
            System.out.println(count);
            count = count - 6;
        }
    }

    private static void q5() {
        int count = 5;
        int finish = 15;
        while (count < finish) {
            System.out.println(count);
            count = count + 3;
        }
    }

    private static void q6() {
        int count = 0;
        while (count == 0) {
            System.out.println(count);
        }
    }

    private static void q7() {
        Scanner input = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter a series of positive numbers for the total negative number to finish and get the total");
        int number = input.nextInt();
        while (number >= 0) {
            total = total + number;
            System.out.println("Enter a positive number to continue, and a negative number to end");
            number = input.nextInt();
        }
        System.out.println("The total is " + total);
    }

    private static void q8() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(1000);
        int correct = 0;
        int count = 1;
        System.out.println("Enter a number between 1 and 1000");
        do {
            int guess = input.nextInt();
            if (guess == number) {
                System.out.println("Correct - Well Done");
                correct = 1;
            } else if (guess < number) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
            count = count + 1;
        } while (count < 11 & correct == 0);
        System.out.println("The number was " + number);

    }

    private static void q9() {
        Scanner input = new Scanner(System.in);
        int number, i = 1, exponent;
        long power = 1;

        System.out.print("Please Enter any Number : ");
        number = input.nextInt();

        System.out.print("Please Enter the Exponent Value : ");
        exponent = input.nextInt();

        while (i <= exponent) {
            power = power * number;
            i++;
        }
        System.out.println("\n The Final result of " + number
                + " power " + exponent + " = " + power);
    }

    private static void q10() {
        Scanner input = new Scanner(System.in);
        int teamScore;
        int totalteams = 0;
        int totalSum = 0;
        int answer;
        double average = 0;
        int hightScore = 0;
        int lowestScore = 0;

        System.out.print("Enter 1 to input a score.\n");
        System.out.print("Enter a negative number to get results and exit. >> ");
        answer = input.nextInt();
        if (answer > 1 && answer > -1) {
            System.out.print("Invaild number!\n");
            System.out.print("Enter 1 to input a score.\n");
            System.out.print("Enter a negative number to get results and exit. >> ");
            answer = input.nextInt();
        }
        while (answer == 1) {
            System.out.print("Please enter a score >> ");
            teamScore = input.nextInt();
            if (teamScore < -1 || teamScore < 0) {
                System.out.print("Invalid score! \n");
                System.out.print("please enter a score that is not less than zero >> ");
                teamScore = input.nextInt();
            }
            totalSum += teamScore;
            ++totalteams;
            lowestScore = teamScore;
            if (teamScore > hightScore) {
                hightScore = teamScore;
            } else if (teamScore < lowestScore) {
                lowestScore = teamScore;
            }
            System.out.println("Your score was processed.");
            System.out.print("Enter 1 to input a score.\n");
            System.out.print("Enter negative to get results and exit.\n");
            answer = input.nextInt();
        }
        average = totalteams * totalSum;
        System.out.println("The number of students: " + totalteams);
        System.out.println("The total score is: " + totalSum);

        System.out.println("The average of scores is: " + average);
        System.out.println("Highest score: " + hightScore);
        System.out.println("Lowest score: " + lowestScore);
    }
}

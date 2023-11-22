/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author 10373
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //q1();
        //q2();
        //q3();
        //q4();
        //q5();
        q6();
        //q7();
        //q8();
        q9();
        //q10();
        q11();
        q12();
    }

    private static void q1() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Go");
        }
    }

    private static void q2() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    private static void q3() {
        for (int i = 5; i < 20; i++) {
            System.out.println(i);
        }
    }

    private static void q4() {
        for (int turn = 1; turn < 12; turn++) {
            System.out.println(turn * 5);
        }
    }

    private static void q5() {
        int Start = 5;
        int Finish = 15;
        for (int turn = Start; turn < Finish; turn++) {
            System.out.println(turn);
        }
    }

    private static void q6() {
        //Gagandeep
        for (int i = 15; i > 5; i--) {
            System.out.println(i);
        }
    }

    private static void q7() {
        for (int j = 1; j < 12; j++) {
            for (int k = 1; k < 12; k++) {
                System.out.println(j * k);
            }
        }
    }

    private static void q8() {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total = total + i;
            System.out.println(total);
        }
    }

    //Gagandeep
    private static void q9() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter number");
        int i = input.nextInt();
        System.out.println("Enter number");
        int k = input.nextInt();
        for (int j = i; j <= k; j++) {
            sum = sum + j;
            System.out.print(j + "+");
            System.out.println("\n");
            System.out.println(sum);
        }
    }

    private static void q10() {
        Scanner input = new Scanner(System.in);
        int n = 3;
        System.out.println("Enter number");
        int i = input.nextInt();
        System.out.println("Enter number");
        int k = input.nextInt();
        for (int j = i; j <= k; j += n) {
            System.out.print(j + ",");
        }
    }

    private static void q11() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rainfall");
        int max_rainfall = 0;
        for (int i = 1; i <= 12; i++) {
            int rainfall = input.nextInt();
            if (rainfall > max_rainfall) {
                max_rainfall = rainfall;
            }
        }
        System.out.println("The maximum rainfall for the year was " + max_rainfall + ".");
    }

    private static void q12() {
        Scanner input = new Scanner(System.in);
        int teamScore;
        int totalteams = 0;
        int totalSum = 0;
        int answer;
        double average = 0;
        int hightScore = 0;
        int lowestScore = 0;

        System.out.print("Enter 1 to input a score.\n");
        System.out.print("Enter 999 to get results and exit. >> ");
        answer = input.nextInt();

        if (answer != 1 && answer != 999) {
            System.out.print("Invaild number!\n");
            System.out.print("Enter 1 to input a score.\n");
            System.out.print("Enter 999 to get results and exit. >> ");
            answer = input.nextInt();
        }

        while (answer == 1) {
            System.out.print("Please enter a team score >> ");
            teamScore = input.nextInt();

            if (teamScore < 0 || teamScore > 100) {
                System.out.print("Invalid score! \n");
                System.out.print("please enter a score that is not less than zero and"
                        + " and not more than 100. >> ");
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
            System.out.print("Enter 999 to get results and exit.\n");
            answer = input.nextInt();
        }
        average = totalteams * totalSum;
        System.out.println("The number of teams: " + totalteams);
        System.out.println("The total score is: " + totalSum);
        System.out.println("The average of scores is: " + average);
        System.out.println("Highest score: " + hightScore);
        System.out.println("Lowest score: " + lowestScore);
    }

}

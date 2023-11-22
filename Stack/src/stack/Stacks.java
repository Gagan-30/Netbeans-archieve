package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stacks 
{

    public static void main(String[] args) 
    {
        Stack <Integer> myStack = new Stack();
        Scanner input = new Scanner(System.in);
        boolean done = false;

        while (!done) 
        {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. View");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: \n");
            int choice = input.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = input.nextInt();
                    int binary = 0;
                    int remainder,
                     i = 1;

                    while (value != 0)
                    {
                        remainder = value % 2;
                        value /= 2;
                        binary += remainder * i;
                        i *= 10;
                    }

                    myStack.push(binary);
                    break;
                case 2:
                    int popped = myStack.pop();
                    if (popped != -1) 
                    {
                        System.out.println("Popped value: " + popped);
                    }
                    break;
                case 3:
                    int peeked = myStack.peek();
                    if (peeked != -1) 
                    {
                        System.out.println("Peeked value: " + peeked);
                    }
                    break;
                case 4:
                    System.out.println(myStack);
                    break;
                case 5:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
            System.out.println();
        }
    }
    
}

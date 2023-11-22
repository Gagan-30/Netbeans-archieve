package stack;

import java.util.Arrays;
import java.util.Scanner;

public class Arraystack 
{

    static final int MAX_SIZE = 10;
    static int[] Stack = new int[MAX_SIZE];
    static int pointer = -1;

    public static void main(String[] args)
    {
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

                    push(binary);
                    break;
                case 2:
                    int popped = pop();
                    if (popped != -1) 
                    {
                        System.out.println("Popped value: " + popped);
                    }
                    break;
                case 3:
                    int peeked = peek();
                    if (peeked != -1) 
                    {
                        System.out.println("Peeked value: " + peeked);
                    }
                    break;
                case 4:
                    int[] viewed = view();
                    System.out.println("Full stack: " + Arrays.toString(viewed));
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

    private static void push(int value) 
    {
        if (pointer == MAX_SIZE - 1) 
        {
            System.out.println("Stack overflow.");
        } 
        else 
        {
            pointer++;
            Stack[pointer] = value;
            System.out.println("Pushed value: " + value);
        }
    }

    private static int pop() 
    {
        if (pointer == -1) 
        {
            System.out.println("Stack underflow.");
            return -1;
        } 
        else 
        {
            int value = 0;
            Stack[pointer] = value;
            pointer--;
            return value;
        }
    }

    private static int peek() 
    {
        if (pointer == -1)
        {
            System.out.println("Stack is empty.");
            return -1;
        } 
        else 
        {
            return Stack[pointer];
        }
    }

    private static int[] view()
    {
        return Stack;
    }

}

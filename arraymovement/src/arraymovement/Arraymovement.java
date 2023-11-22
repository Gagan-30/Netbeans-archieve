package arraymovement;

import java.util.Scanner;

public class Arraymovement 
{

    public static void main(String[] args) 
    {

        grid();
        movement(x,y,Array[][]);
    }

    private static void grid() 
    {
        Scanner input = new Scanner(System.in);

        int cols = 3;
        int rows = 3;
        int x = 1;
        int y = 1;

        int[][] Array = new int[cols][rows];

        for (int i = 0; i < cols; i++) 
        {
            System.out.println("");
            for (int j = 0; j < rows; j++) 
            {
                System.out.print("|");
                
                if (i == x && j == y) 
                {
                    System.out.print("X|");
                } 
                else 
                {
                    System.out.print("_");
                    System.out.print("|");
                }
            }
        }
        System.out.println("");
    }

    private static void movement(int x,int y,int[][] Array) 
    {
        
    } 
}

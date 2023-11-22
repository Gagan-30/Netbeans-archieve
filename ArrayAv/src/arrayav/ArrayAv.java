package arrayav;

public class ArrayAv 
{

    public static void main(String[] args) 
    {
        int[][] counts
                = {
                    {1, 5, 7, 12},
                    {3, 4, 15, 16},
                    {0, 0, 1, 3},
                    {12, 16, 18, 23}
                };
        
        int total = 0;
        float col1 = 0, col2 = 0, col3 = 0, col4 = 0;
        float row1 = 0, row2 = 0, row3 = 0, row4 = 0;
        
        for (int i = 0; i <= 3; i++) 
        {
            col1 += counts[i][0];
            col2 += counts[i][1];
            col3 += counts[i][2];
            col4 += counts[i][3];
            
            for (int j = 0; j <= 3; j++) 
            {
                total += counts[i][j];
                
                row1 += counts[0][j];
                row2 += counts[1][j];
                row3 += counts[2][j];
                row4 += counts[3][j];
            }
        }
            row1 = row1 / 4;
            row2 = row2 / 4;
            row3 = row3 / 4;
            row4 = row4 / 4;
        
            System.out.println("Total = " + total);
            System.out.println("Mean = " + (total / 16));
            System.out.println("1st column = " + (col1 / 4));
            System.out.println("2nd column = " + (col2 / 4));
            System.out.println("3rd column = " + (col3 / 4));
            System.out.println("4th column = " + (col4 / 4));
            System.out.println("1st row = " + (row1 / 4));
            System.out.println("2nd row = " + (row2 / 4));
            System.out.println("3rd row = " + (row3 / 4));
            System.out.println("4th row = " + (row4 / 4));
            
    }

}

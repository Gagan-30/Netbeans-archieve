package numbers;

/**
 *
 * @author 10373
 */
public class Numbers 
{

    public static void main(String[] args) 
    {
        char letter = 'a';
        int num = (int) letter;
        int one = num / num;
        int ten = (one + one + one + one + one + one + one + one + one + one);
        for (int i = one; i <= (ten * ten); i++)
        {
            System.out.println(i);
        }

    }

}

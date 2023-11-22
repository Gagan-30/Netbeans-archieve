
public class diceGame {

    public static void main(String[] args) {
        int dice1;
        int dice2;
        int count = 0;
        int theSum = 0;
        int lowest = Integer.MAX_VALUE;
        int finalSum = 0;
        int diceSum;
        int totalSum = 0;
        while (count < Integer.parseInt(args[0])) {
            count += 1;
            diceSum = 0;
            theSum = 0;
            while (diceSum != 7) {
                diceSum = 0;
                dice1 = 1 + (int) ((Math.random() * (6 - 1)) + 1);
                dice2 = 1 + (int) ((Math.random() * (6 - 1)) + 1);
                diceSum = dice1 + dice2;
                if (diceSum != 7) {
                    theSum += diceSum;
                }
                System.out.println("the sum is "+theSum);
            }
            if (theSum > finalSum) {
                finalSum = theSum;
            }
            if (theSum < lowest) {
                lowest = theSum;
            }
            totalSum += theSum;
        }
        double average = totalSum / (Double.parseDouble(args[0]));
        System.out.println("After " + args[0] + " simulations: ");
        System.out.println("Biggest sum: " + finalSum);
        System.out.println("Smallest sum: " + lowest);
        System.out.println("The average is: " + average);

    }
}

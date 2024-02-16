import java.util.Random;
import java.util.Scanner;

public class Ass02_Craps {
    public static void main(String[] args)
    {   //call in scanner and nu,ber generator
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        //declaring variables
        int die1 = 0;
        int die2 = 0;
        int sum = 0;
        int pointDie1 = 0;
        int pointDie2 = 0;
        int pointSum = 0;

        do {
            // Roll two dice (assigns randoms)
            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;
            sum = die1 + die2;

            // Print the results of the initial roll
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            // Check the outcome of the initial roll
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win.");
            } else {
                System.out.println("Point is set to " + sum);

                // Play Point Round
                while (true) {
                    // Roll two dice for the point round
                    pointDie1 = random.nextInt(6) + 1;
                    pointDie2 = random.nextInt(6) + 1;
                    pointSum = pointDie1 + pointDie2;

                    // Print the results of the point round
                    System.out.println("Die 1: " + pointDie1);
                    System.out.println("Die 2: " + pointDie2);
                    System.out.println("Sum: " + pointSum);

                    // Check the outcome of the point round
                    if (pointSum == sum) {
                        System.out.println("You made the point! You win.");
                        break;
                    } else if (pointSum == 7) {
                        System.out.println("Got a seven! You lose.");
                        break;
                    } else {
                        System.out.println("Trying for point...");
                    }
                }
            }

            // Ask the user if they want to play again
            System.out.print("Do you want to play again? (y/n): ");
            //while that keeps the loop running
        } while (in.next().equalsIgnoreCase("y"));
    }
}
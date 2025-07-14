/*4. Write a java program : rolling a pair of dices 10 times [ each attempt should be delayed
by 10000 ms ] and count number Successful attempts.
successful attempt : If the pair of Dice results in same values.  */


import java.util.Random;

public class dice {
    public static void main(String[] args) {
        int numberOfAttempts = 10;
        int successfulAttempts = 0;

        Random random = new Random();

        for (int i = 1; i <= numberOfAttempts; i++) {
            // Roll the dice
            int dice1 = random.nextInt(6) + 1; // Generating a random number between 1 and 6
            int dice2 = random.nextInt(6) + 1;

            // Display the result of the dice roll
            System.out.println("Attempt " + i + ": Dice 1: " + dice1 + ", Dice 2: " + dice2);

            // Check if it's a successful attempt
            if (dice1 == dice2) {
                successfulAttempts++;
                System.out.println("Success! Same values on both dice.");
            } else {
                System.out.println("Not successful. Different values on the dice.");
            }

            // Delay for 10 seconds (10000 milliseconds)
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Display the total number of successful attempts
        System.out.println("Total successful attempts: " + successfulAttempts);
    }
}

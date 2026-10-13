import java.util.Random;
import java.util.Scanner;

public class Ass_01_Craps {

    static void main() {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {

            IO.println("\n--- New Game ---");

            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int sum = die1 + die2;

            IO.println("Initial Roll:");
            IO.println("Die 1: " + die1 + "   Die 2: " + die2 + "   Sum: " + sum);


            if (sum == 2 || sum == 3 || sum == 12) {
                IO.println("Crapped out! You lose.");
            }

            else if (sum == 7 || sum == 11) {
                IO.println("Natural! You win!");
            }

            else {
                int point = sum;
                IO.println("Point is set to: " + point);

                boolean rolling = true;

                while (rolling) {

                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;
                    sum = die1 + die2;

                    IO.println("\nRolling...");
                    IO.println("Die 1: " + die1 + "   Die 2: " + die2 + "   Sum: " + sum);

                    if (sum == point) {
                        IO.println("Made the point! You win!");
                        rolling = false;
                    } else if (sum == 7) {
                        IO.println("Got a seven! You lose.");
                        rolling = false;
                    } else {
                        IO.println("Trying for point...");
                    }
                }
            }

            IO.print("\nPlay again? (Y/N): ");
            playAgain = input.nextLine().trim();
        }

        IO.println("\nThanks for playing!");
    }
}

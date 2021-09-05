package part8;

import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        System.out.println("Pick a number from 0 to 255.");
        System.out.println("Can you guess what number I chose?");

        Random random = new Random();
        int randomNumber = random.nextInt(256);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("You have " + (8 - i) + " chance(s).");
            System.out.println("Enter the number.");
            String input = scanner.nextLine();
            int guess = Integer.parseInt(input);

            if (randomNumber == guess) {
                System.out.println("Congratuations! You won!");
                break;
            } else if (randomNumber < guess) {
                System.out.println("Down.");
            } else {
                System.out.println("Up.");
            }

            if (i == 7) {
                System.out.println("Game over. the number was " + randomNumber);
            }
        }

        System.out.println("End of Game. ");
    }
}

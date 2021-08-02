package part8;

import java.util.Scanner;

public class PasswordInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "123";

        while (true) {
            System.out.println("Please enter password.");
            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.println("Correct password.");
                break;
            }
            System.out.println("Wrong password.");
        }
    }
}

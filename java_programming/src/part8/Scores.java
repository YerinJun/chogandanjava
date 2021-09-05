package part8;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        String[] subjects = {"Korean", "English", "Math", "Science"};
        int[] scores = {90, 75, 30, 40};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which subjects score do you want to know? (Korean, English, Math, Science)");

        String inputSubject = scanner.nextLine();

        for (int i = 0; i < subjects.length; i++) {
            String subject = subjects[i];
             if (subject.equalsIgnoreCase(inputSubject)) {
                 System.out.println("Your score of " + inputSubject + " is " + scores[i]);
             }
        }
    }
}

package part7;

import java.util.Scanner;

public class If {
    public static void main (String[] args) {
        System.out.println("당신의 나이를 입력하십시오.");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if (age >= 10 && age < 20) {
                System.out.println("10대");
        } else if ( age >= 20) {
            System.out.println("20대 이상");
        } else {
            System.out.println("10대 이하");
        }
    }
}
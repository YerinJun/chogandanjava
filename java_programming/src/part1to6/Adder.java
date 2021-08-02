package part1to6;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하시오.");
        String firstInput = scanner.nextLine();
        System.out.println("두 번째 숫자를 입력하시오.");
        String secondInput = scanner.nextLine();
        try {
            int first = Integer.parseInt(firstInput);
            int second = Integer.parseInt(secondInput);
            int answeredNumber = first + second;
            System.out.println("첫 번째 숫자와 두 번째 숫자의 합은 " + answeredNumber + "입니다.");
        } catch (Exception e) {
            System.out.println("숫자를 입력하시지 않아서 연산이 종료되었습니다.");
        }
    }
}

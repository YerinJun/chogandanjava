import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월을 입력하시오.");
        int month;

        try {
            String input = scanner.nextLine();
            month = Integer.parseInt(input);
        }   catch (Exception e) {
            month = -1;
        }

        if (month  == 1) {
            System.out.println("January");
        }   else if (month == 2) {
            System.out.println("February");
        }   else if (month == 3) {
            System.out.println("March");
        }   else if (month == 4) {
            System.out.println("April");
        }   else {
            System.out.println("1월부터 4월까지만 입력 가능합니다.");
        }
    }
}

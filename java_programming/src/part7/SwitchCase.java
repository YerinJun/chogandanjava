package part7;
import java.util.Scanner;
public class SwitchCase {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월을 입력하시오.");
        int month = Integer.parseInt(scanner.nextLine());
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            default:
                System.out.println("1월부터 4월까지만 입력 가능합니다.");
        }
    }
}

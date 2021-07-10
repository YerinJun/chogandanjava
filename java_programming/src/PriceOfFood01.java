import java.util.Scanner;

public class PriceOfFood01 {
    public static void main(String[] args) {
        System.out.println("메뉴 번호를 입력하시오.");
        System.out.println("1. 치킨");
        System.out.println("2. 고기");
        System.out.println("3. 회");
        System.out.println("4. 돈없쪙");

        Scanner scanner = new Scanner(System.in);
        int menuNumber;

        try {
            menuNumber = scanner.nextInt();
        }   catch (Exception e) {
            menuNumber = -1;
        }

        switch (menuNumber) {
            case 1:
                System.out.println("치킨은 17,000원 입니다.");
                break;
            case 2:
                System.out.println("고기는 마이쪙");
                break;
            case 3:
                System.out.println("회ㅠㅠㅠㅠ");
                break;
            case 4:
                System.out.println("어쩌라고");
                break;
            default:
                System.out.println("올바른 메뉴 번호를 입력해 주십시오.");
                break;
        }
    }
}

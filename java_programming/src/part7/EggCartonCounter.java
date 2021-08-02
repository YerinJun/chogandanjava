package part7;

import java.util.Scanner;

public class EggCartonCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("총 계란의 수를 입력하십시오.");
        String input = scanner.nextLine();
        try {
            int numberOfEggs = Integer.parseInt(input);
            int cartonsOfEggs = numberOfEggs / 30;
            int restOfEggs = numberOfEggs % 30;
            if (numberOfEggs < 30) {
                System.out.println("계란 한 판의 양이 되지 않습니다.");
            } else if (restOfEggs == 0) {
                System.out.println("계란이 " + cartonsOfEggs + "판 있습니다.");
            } else {
                System.out.println("계란이 " + cartonsOfEggs + "판 하고 " + restOfEggs + "개 있습니다");
            }
        } catch (NumberFormatException c) {
            System.out.println("총 계란의 수를 입력하십시오.");
        }
    }
}

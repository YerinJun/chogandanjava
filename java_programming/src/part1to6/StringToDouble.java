package part1to6;

import java.util.Scanner;

public class StringToDouble {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("달러 환율을 입력하세요.");
        String dollar = scanner.nextLine();
        System.out.println("순대국 가격을 입력하세요.");
        String price = scanner.nextLine();
        double dollarD = Double.parseDouble(dollar);
        double priceOfSoup = Double.parseDouble(price);
        System.out.println("$1 의 환율은 " + dollarD + "원 입니다.");
        System.out.println("순대국의 가격은 " + priceOfSoup + "원 입니다.");
        System.out.printf("순대국은 %.2f달러 입니다.", priceOfSoup / dollarD );
    }
}

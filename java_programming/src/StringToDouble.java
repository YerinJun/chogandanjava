import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("달러 환율을 입력하세요.");
        String exchangeString = scanner.nextLine();
        System.out.println("순대국값을 입력하세요.");
        String priceOfSoupString = scanner.nextLine();
        double exchange = Double.parseDouble(exchangeString);
        double priceOfSoup = Double.parseDouble(priceOfSoupString);
        System.out.println("$1 의 환율은 " + exchange + "원 입니다.");
        System.out.println("순대국의 가격은 " + priceOfSoup + "원 입니다.");
        System.out.println("순대국은 " + priceOfSoup / exchange + "달러 입니다.");

    }
}

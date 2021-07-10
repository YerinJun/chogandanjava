import java.util.Scanner;

public class PriceOfFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("먹고 싶은 음식 이름을 입력해보세요.");
        String name = scanner.nextLine();

        switch (name) {
            case "치킨":
                System.out.println("치킨은 17,000원 입니다.");
                break;
            case "순대국":
                System.out.println("순대국은 마이쪙");
                break;
            case "스테이크":
                System.out.println("스테이크는 비싸요.");
                break;
            default:
                System.out.println("그런 거 먹지마. 몸에 안 좋아.");
                break;
        }
    }
}

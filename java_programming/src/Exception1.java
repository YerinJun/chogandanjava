import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        String numberInput = scanner.nextLine();
        try {
            int number = Integer.parseInt(numberInput);
            number = number + 1;
            System.out.println("다음 숫자는 " + number + "입니다.");
        }   catch (Exception e) {
            System.out.println("순순히 숫자를 입력한다면");
            System.out.println("잡아먹지 않겠다.");
            System.out.println("입력값 = " + numberInput);
        }


    }
}

import java.util.Scanner;

public class Transfer {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("숫자를 입력해 보세요.");
        String inputString = keyboard.nextLine();
        int inputNumber = Integer.parseInt(inputString);
        System.out.println("입력값은 " + inputNumber + " 입니다.");
    }
}

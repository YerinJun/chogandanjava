package part1to6;

import java.util.Scanner;

public class Input {
    public static void main (String[] args) {
          Scanner scanner = new Scanner(System.in);

//          System.out.println("Please, Type your name.");
//          String name = scanner.nextLine();
//          System.out.println("Welcome! Mr./Mrs. " + name);

//          System.out.println("영어 단어와 한글 단어를 하나씩 입력해보세요.");
//          String englishWord = scanner.next();
//          String koreanWord = scanner.next();
//          System.out.println("입력된 영단어: " + englishWord);
//          System.out.println("입력된 한글단어: " + koreanWord);

        System.out.println("숫자를 입력하세요.");
        String stringToInt = scanner.nextLine();
        int number = Integer.parseInt(stringToInt);
        number = number + 1;
        System.out.println("입력한 숫자의 다음 숫자는 " + number + "입니다.");
    }
}

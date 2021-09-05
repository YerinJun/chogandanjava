package part10;

import java.util.Scanner;

public class MethodCallWithinMethod {
    public static void main(String[] args){
        calculate();
    }
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("원하는 연산을 선택하세요.");
        System.out.println("1: 덧셈");
        System.out.println("2: 곱셈");
        System.out.println("그 외: 종료");

        String input = scanner.nextLine();

        System.out.println("첫 번째 숫자를 입력하세요");
        int a = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요");
        int b = scanner.nextInt();

        if(input.equals("1")) {
            int sum = add(a,b);
            System.out.println(a + "+" + b + "=" + sum);
        }

        if(input.equals("2")) {
            int product = multiply(a,b);
            System.out.println(a + "*" + b + "=" + product);
        }
    }

    public static int add(int a, int b) {
        System.out.println("덧셈을 수행합니다.");
        return a + b;
    }

    public static int multiply(int a, int b) {
        System.out.println("곱셈을 수행합니다.");
        return a * b;
    }
}

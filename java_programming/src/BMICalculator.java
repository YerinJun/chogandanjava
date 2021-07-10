import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몸무게를 입력하십시오.");
        double weight = scanner.nextDouble();
        System.out.println("키를 입력하십시오.");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height/10000);

        System.out.println("체질량 지수는 " + bmi + "입니다.");
        if (bmi < 18.5) {
            System.out.println("저체중 입니다.");
        }   else if (bmi >= 23) {
            System.out.println("과체중 입니다.");
        }   else {
            System.out.println("정상 체중 입니다.");
        }
    }
}

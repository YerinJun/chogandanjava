import java.util.Scanner;

public class DogFood {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("강아지의 몸무게를 kg으로 입력하십시오.");
        String weightOfDogString = input.nextLine();
        try {
            double weightOfDog = Double.parseDouble(weightOfDogString);
            double properDogFood = weightOfDog * 10;
            System.out.println("강아지 몸무게에 따른 1일 권장 사료량은 " + properDogFood + "g 입니다.");
        }   catch (Exception e) {
            System.out.println("강아지 몸무게를 숫자로 입력해 주십시요.");
        }

    }
}
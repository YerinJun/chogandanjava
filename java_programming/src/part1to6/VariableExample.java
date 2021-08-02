package part1to6;

public class VariableExample {
    public static void main (String[] args) {

        String name = "홍길동";
        int age = 80;
        String address = "서울시";

        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("사는곳: " + address);
        System.out.println("--------------------------");

        //AgeOfDogs
        int ageOfWinter = 3;
        int ageOfMax = 7;
        boolean sameAge = ageOfWinter == ageOfMax;
        boolean winterOlder = ageOfWinter > ageOfMax;
        boolean maxOlder = ageOfMax > ageOfWinter;
        System.out.println("윈터랑 맥스랑 동갑? " + sameAge);
        System.out.println("윈터가 더 나이 많음? " + winterOlder);
        System.out.println("맥스가 더 나이 많음? " + maxOlder);
        System.out.println("-------------------------");

        //DateConverter
        String date = "1970/01/23";
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8);
        System.out.println(year + "년 " + month + "월 " + day + "일");

    }
}

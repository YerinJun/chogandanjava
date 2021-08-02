package part1to6;

public class Birthday {
    public static void main (String[] args) {
      //AgeOfGildong
        int ageOfGildong = 9;
        String name = "홍길동";

        System.out.println(name + ": " + ageOfGildong + "세");
        System.out.println(name + "(10년 후)"+ ": " + (ageOfGildong + 10) + "세");
        System.out.println(name + "(20년 후)"+ ": " + (ageOfGildong + 20) + "세");
        System.out.println(name + "(30년 후)"+ ": " + (ageOfGildong + 30) + "세");
        System.out.println("---------------------");

        String birthday = "1970/01/01";
        String year = birthday.substring(0 , 4);
        String month = birthday.substring(5, 7);
        String day = birthday.substring(8);
        System.out.println("출생년도: " + year + "년");
        System.out.println("출생월: " + month + "월");
        System.out.println("출생일: " + day + "일");

    }
}

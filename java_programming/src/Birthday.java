public class Birthday {
    public static void main(String[] args) {
      //AgeOfGildong
        int ageOfGildong = 7;

        System.out.println(ageOfGildong + 10);
        System.out.println(ageOfGildong + 20);
        System.out.println(ageOfGildong + 30);
        System.out.println("---------------------");

        String birthday = "1970/01/01";
        String year = birthday.substring(0 , 4);
        String day = birthday.substring(8);
        System.out.println("출생년도: " + year);
        System.out.println("출생일: " + day);

    }
}

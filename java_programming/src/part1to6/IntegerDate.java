package part1to6;

public class IntegerDate {
    public static void main (String[] args) {
        //  정수형
        short shorNum = 5;
        int intNum = 10;
        long longNum = 20;

        int intResult = intNum - shorNum;
        long longResult = longNum - intNum;

        System.out.println(intResult);
        System.out.println(longResult);
        System.out.println();

        //  실수형
        float floatNumber = 0.001f + 0.001f + 0.0001f;
        double doubleNumber = 0.2;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println();

        //  문자열변수
        String chicken = "치킨은 살 안 쪄요.";
        String me = " 살은 내가 쪄요.";
        System.out.println(chicken + me);
        String chickenAndMe = chicken + me;
        System.out.println(chickenAndMe);




    }
}

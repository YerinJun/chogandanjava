package part8;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] days = {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
        System.out.println(Arrays.toString(days));
        System.out.println(days);
        String[] days2 = Arrays.copyOf(days, 10);
        days2[7] = "Sun(I wish)";
        days2[8] = "Sun(I wish)";
        days2[9] = "Sun(I wish)";

        for (int i = 0; i < days.length; i++) {
            if (i == 6) {
                System.out.println(days[i]);
            } else {
                System.out.print(days[i] + ", ");
            }
        }
        System.out.println("1 week has " + days2.length + " days.");
        for(String day : days2) {
            System.out.print(day + ", ");
        }
    }
}

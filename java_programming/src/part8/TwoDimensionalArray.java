package part8;

import java.util.Arrays;
public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] days = {
                {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"},
                {"Sun", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"},
                {"Mon", "Tues", "Wed", "Thurs", "Fri", "Fri", "Friday"},
        };
        System.out.println(Arrays.toString(days[0]));
        System.out.println(Arrays.toString(days[1]));
        System.out.println(Arrays.toString(days[2]));

        System.out.println(days[2][6]);
    }
}

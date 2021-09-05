package part11;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Racheal");
        students.add("Richard");
        students.add("Micheal");
        students.add("Jonathan");

        Collections.sort(students);
        System.out.println(students);
        Collections.reverse(students);
        System.out.println(students);
    }
}

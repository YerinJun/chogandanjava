package part11;

import java.util.ArrayList;
import java.util.List;

public class ListSet {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();

        students.add("Edega Ellen Peo");
        students.add("Peter");
        students.add("Cindy");

        String student = students.get(0);

        System.out.println("0번 학생: " + student);
    }
}

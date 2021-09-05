package part11;

import java.util.ArrayList;

public class ListEx {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<String>();

        foods.add("치킨");
        foods.add("피자");

        foods.remove(0);

        System.out.println(foods);
    }
}

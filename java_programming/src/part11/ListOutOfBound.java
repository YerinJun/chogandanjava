package part11;

import java.util.ArrayList;

public class ListOutOfBound {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<String>();

        foods.add("Pizza");
        foods.add("Chicken");

        foods.remove(2);

        System.out.println(foods);
    }
}

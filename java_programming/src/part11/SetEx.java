package part11;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> myFavoriteFoods = new HashSet<>();

        myFavoriteFoods.add("chicken");
        myFavoriteFoods.add("pizza");
        myFavoriteFoods.add("chicken");
        myFavoriteFoods.remove("chicken");

        System.out.println(myFavoriteFoods);
    }
}

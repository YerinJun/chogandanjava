package part11;

import java.util.ArrayList;
import java.util.List;

public class DuplicatedElements {
    public static void main(String[] args) {
        List<String> myFavFoods = new ArrayList<>();

        myFavFoods.add("chicken");
        myFavFoods.add("pizza");

        boolean containsChicken = myFavFoods.contains("chicken");

        System.out.println("Is there chicken on the list?: " + containsChicken);
    }

}

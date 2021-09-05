package part11;

// import java.util.ArrayList;
import java.util.HashSet;

public class CollectionLoop {
    public static void main(String[] args) {
        HashSet<String> myFavoriteFoods = new HashSet<>();

        myFavoriteFoods.add("chicken");
        myFavoriteFoods.add("pizza");
        myFavoriteFoods.add("jerky");
        myFavoriteFoods.add("hamburger");

        for(String food : myFavoriteFoods) {
            System.out.println(food + " is delicious!");
        }
    }
}

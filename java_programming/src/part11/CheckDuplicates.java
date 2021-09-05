package part11;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckDuplicates {
    public static void main(String[] args) {
        System.out.println("Enter your favorite foods. (To end press 0)");
        ArrayList<String> myFavoriteFoods = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String food = scanner.nextLine();

            if(food.equals("0")) break;
            if(myFavoriteFoods.contains(food)) {
                System.out.println(food + " is already on the list.");
            } else {
                myFavoriteFoods.add(food);
            }
        }
        System.out.println(myFavoriteFoods);
    }

}

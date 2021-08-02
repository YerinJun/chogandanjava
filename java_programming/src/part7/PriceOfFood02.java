package part7;
import java.util.Scanner;
public class PriceOfFood02 {
    public static void main(String[] args) {
    System.out.println("What would you like?");
    System.out.println("1. Chicken");
    System.out.println("2. Steak");
    System.out.println("3. Hamburger");
    Scanner scanner = new Scanner(System.in);
    int menuNumber;

    try {
        menuNumber = scanner.nextInt();
    } catch (Exception c) {
        menuNumber = 7;
    }

    switch (menuNumber) {
        case 1:
            System.out.println("Nene chicken has the best chicken Everrrr");
            break;
        case 2:
            System.out.println("Steak is too expensive in Korea.");
            break;
        case 3:
            System.out.println("Mom's Touch has thigh burgers which are reasonably priced.");
            break;
        default:
            System.out.println("Please choose menu number.");
    }
    }
}
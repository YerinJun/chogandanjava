package part13;

import java.util.Arrays;
import java.util.Scanner;

public class RoomsInCave {
    public static void main(String[] args) {
        int[] rooms = {0, 1, 2, 3};
        int[][] links = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1}, {0, 1, 2}};
        int currentRoom = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Now, You are at room number " + currentRoom + ".");
            System.out.println("Choose one number to move in from the examples.");
            System.out.println(Arrays.toString(links[currentRoom]));
            int roomNumber = scanner.nextInt();
            currentRoom = roomNumber;
        }
    }
}

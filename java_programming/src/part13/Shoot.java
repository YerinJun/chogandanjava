package part13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shoot {
    public static int[] rooms = {0, 1, 2, 3};
    public static int[][] links = {{1,2,3},{2,3,0},{3,0,1},{0,1,2}};

    public static String BAT = "Bat";
    public static String PIT = "Pit";
    public static String WUMPUS = "Wumpus";
    public static String NOTHING = "Nothing";

    public static String[] hazards = {NOTHING, BAT, PIT, WUMPUS};
    public static int currentRoom = 0;
    public static int arrowCount = 5;
    public static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("You are now in room number " + currentRoom + ".");
            int[] nextRooms = links[currentRoom];
            System.out.println("Which room do you want to shoot your arrow to?");
            System.out.println(Arrays.toString(nextRooms));
            int roomNumber = scanner.nextInt();
            shoot(roomNumber);
        }
    }

    public static void shoot (int room) {
        if(hazards[room].equals(WUMPUS)){
            System.out.println("Congratuations! You killed Wumpus!");
        } else {
            arrowCount = arrowCount - 1;
            if(arrowCount == 0) {
                System.out.println("You failed to hunt Wumpus.");
            } else if(random.nextInt(4) != 0) {
                System.out.println("Wumpus has waken up!");
                int wumpusRoom = 3;
                int[] nextRooms = links[wumpusRoom];
                int nextRoom = nextRooms[random.nextInt(3)];
                if(hazards[nextRoom].equals(NOTHING)) {
                    hazards[wumpusRoom] = NOTHING;
                    wumpusRoom = nextRoom;
                }

                if(wumpusRoom == currentRoom) {
                    System.out.println("Wumpus ate you.");
                    System.out.println("You failed to hunt Wumpus.");
                } else if (wumpusRoom == nextRoom) {
                    System.out.println("Wumpus has run away.");
                }
            }
        }
    }
}

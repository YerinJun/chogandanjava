package part13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HazzardInRooms {
    public static void main(String[] args) {
        int[] rooms = {0, 1, 2, 3};

        String BAT = "Bat";
        String PIT = "Pit";
        String WUMPUS = "Wumpus";
        String NOTHING = "Nothing";

        String[] hazards = {NOTHING, BAT, PIT, WUMPUS};

        HashMap<String, String> hazardMessages = new HashMap<>();

        hazardMessages.put(WUMPUS, "\"Something smells horrible somewhere.\"");
        hazardMessages.put(BAT, "\"I hear noise somewhere.\"");
        hazardMessages.put(PIT, "\"I hear wind blowing.\"");
        hazardMessages.put(NOTHING, "\"It seems like there's nobody in that room.\"");

        int[][] links = {{1,2,3},{2,3,0},{3,0,1},{0,1,2}};
        int currentRoom = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Now, You are at room number " + currentRoom + ".");
            int[] nextRooms = links[currentRoom];
            for(int nextRoom : nextRooms) {
                String hazard = hazards[nextRoom];
                String message = hazardMessages.get(hazard);
                System.out.println(message);
            }

            System.out.println("Choose the room number down below.");
            System.out.println(Arrays.toString(nextRooms));
            int roomNumber = scanner.nextInt();
            currentRoom = roomNumber;
        }
    }
}

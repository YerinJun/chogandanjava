import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class HuntTheWumpus {
    public static Integer[] rooms = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
    public static Integer[][] links = {{1,7,4},{0,9,2},{1,11,3},{2,13,4},{3,0,5},{4,14,6},{5,16,7},{6,0,8},{7,17,9},
            {8,1,10},{9,18,11},{10,2,12},{11,19,13},{12,3,14},{13,5,15},{14,19,16},{15,6,17},{16,8,18},{17,10,19},
            {18,12,15}};

    public static String WUMPUS = "Wumpus";
    public static String BAT = "Bat";
    public static String PIT = "Pit";
    public static String NOTHING = "Nothing";

    public static ArrayList<String> hazards = new ArrayList<>();
    public static HashMap<String, String> hazardMessages = new HashMap<>();
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static boolean gameOver = true;
    public static int currentRoom;
    public static int arrowCount;
    public static int wumpusRoom;

    public static void main(String[] args) {
        showIntro();
        initializeStaticValues();
        while(true) {
            initializePlayVariables();
            setupHazards();
            delay(1000L);
            System.out.println("\n...");
            delay(1000L);
            System.out.println("...");
            delay(1000L);
            System.out.println("You entered in a cave.\n");
            delay(1000L);
            System.out.println("\"Something spooky about this cave.\"");
            delay(1000L);
            game();
            selectReplay();
        }
    }

    private static void game(){
        while(gameOver == false) {
            System.out.println("You are now at the room number " + currentRoom + ".");
            System.out.println("Choose action number.");
            System.out.println("1. Move.");
            System.out.println("2. Shoot arrow.");
            System.out.println("3. Corridor list.");
            System.out.println("0. End the play.");

            String action = scanner.nextLine();

            if(action.equals("1")) {
                Integer[] nextRooms = links[currentRoom];
                System.out.println("\nWhich number of room will you move next?");
                System.out.println(Arrays.toString(nextRooms));
                String nextRoomInput = scanner.nextLine();
                int nextRoom = parseIntegerOrNegative1(nextRoomInput);

                if(Arrays.asList(nextRooms).contains(nextRoom)) {
                    move(nextRoom);
                } else {
                    System.out.println("You cannot move to the room You chose.");
                }
            } else if (action.equals("2")) {
                Integer[] nextRooms = links[currentRoom];
                System.out.println("\nWhich room do you want to shoot towards?");
                System.out.println(Arrays.toString(nextRooms));
                String targetRoomInput = scanner.nextLine();
                int targetRoom = parseIntegerOrNegative1(targetRoomInput);
                if(Arrays.asList(nextRooms).contains(targetRoom)) {
                    shoot(targetRoom);
                } else {
                    System.out.println("You cannot shoot to that number of room you chose.");
                }
            } else if (action.equals("3")) {
                System.out.println("These are connected paths to current room.");
                System.out.println(Arrays.asList(links[currentRoom]));
            } else if (action.equals("0")) {
                System.out.println("End the game play.");
                gameOver = true;
            } else {
                System.out.println("Wrong number.");
            }
        }
    }

    private static void showIntro() {
        try{
            FileInputStream inputStream = new FileInputStream("src/intro.txt");
            Scanner scanner = new Scanner(inputStream);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                delay(500L);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Intro isn't readable so we'll pass this time.");
        }
    }

    private static void initializePlayVariables() {
        gameOver = false;
        currentRoom = random.nextInt(rooms.length);
        arrowCount = 5;
    }

    private static void initializeStaticValues() {
        hazardMessages.put(WUMPUS, "\"Something smells horrible in here.\"");
        hazardMessages.put(BAT, "\"I hear some noise.\"");
        hazardMessages.put(PIT, "\"I hear wind blowing somewhere.\"");
        hazardMessages.put(NOTHING, "\"It seems like there are nothing int that room.\"");
    }

    public static void setupHazards() {
        if(hazards.size() == 0) {
            for(int i = 0; i < rooms.length; i++) {
                hazards.add(NOTHING);
            }
        }
        for(int i = 0; i <rooms.length; i++) {
            hazards.set(i, NOTHING);
        }
        String[] ordinals = {WUMPUS, BAT, BAT, BAT, PIT, PIT};
        for(String hazard : ordinals) {
            int room;
            while(true){
                room = random.nextInt(rooms.length);
                if (isTooCloseWithPlayer(room)){
                    continue;
                }
                if(hazards.get(room).equals(NOTHING)){
                    break;
                }
            }
            hazards.set(room,hazard);
            if(hazard.equals(WUMPUS)) {
                wumpusRoom = room;
            }
        }
    }

    public static boolean isTooCloseWithPlayer(int room) {
        if(currentRoom == room) {
            return true;
        }
        List<Integer> linkedRooms = Arrays.asList(links[currentRoom]);
        if(linkedRooms.contains(room)){
            return true;
        }
        return false;
    }

    public static void move(int room) {
        currentRoom = room;
        System.out.println("You moved to room number " + currentRoom + ".");
        String hazard = hazards.get(currentRoom);
        delay(1000L);
        if(hazard.equals(WUMPUS)){
            System.out.println("\"Wuuuuuuuuuuuuuuuuuuh!\"");
            delay(300L);
            System.out.println("Wumpus ate you.");
            gameOver = true;
        } else if (hazard.equals(PIT)) {
            System.out.println("\"Euuuuuuuuuuuuuuuuuuh~\"");
            delay(1000L);
            System.out.println("Drop!");
            delay(300L);
            System.out.println("You are deep in the pit.");
            delay(300L);
            System.out.println("You can't hunt the Wumpus anymore.");
            gameOver = true;
        } else if (hazard.equals(BAT)) {
            System.out.println("Drop!");
            delay(300L);
            System.out.println("Bat caught you then dropped you in a random room.");
            do{
                currentRoom = random.nextInt(rooms.length);
            } while (hazards.get(currentRoom).equals(BAT));
            hazards.set(room, NOTHING);
            while(true) {
                int newBatRoom = random.nextInt(rooms.length);
                if(newBatRoom == currentRoom) {
                    continue;
                }
                if(hazards.get(newBatRoom).equals(NOTHING)) {
                    hazards.set(newBatRoom, BAT);
                    break;
                }
            }
            move(currentRoom);
        } else {
            List<Integer> nextRooms = Arrays.asList(links[currentRoom]);
            Collections.shuffle(nextRooms);
            System.out.println("\"Look for connected paths.\"");
            for(int nextRoom : nextRooms) {
                delay(700L);
                String hazardAround = hazards.get(nextRoom);
                System.out.println(hazardMessages.get(hazardAround));
            }
        }
    }

    public static void shoot(int room) {
        arrowCount = arrowCount - 1;
        delay(1000L);
        System.out.println("Shoooot");
        delay(300L);
        if(hazards.get(room).equals(WUMPUS)) {
            System.out.println("Shoooot!");
            delay(100L);
            System.out.println("\"Woooooooo!\"");
            delay(1000L);
            System.out.println("Congratuations! You killed the Wumpus!");
            gameOver = true;
        } else {
            System.out.println("(...)");
            delay(1000L);
            System.out.println("\"Just another waste of arrow.\"");
            if(arrowCount == 0) {
                delay(300L);
                System.out.println("Oh Crap, No more arrows!");
                delay(300L);
                System.out.println("You failed hunting Wumpus.");
                gameOver = true;
            } else if (random.nextInt(4) != 0) {
                System.out.println("You make Wumpus awake.");
                delay(1000L);
                Integer[] nextRooms = links[wumpusRoom];
                int nextRoom = nextRooms[random.nextInt(3)];
                if(hazards.get(nextRoom).equals(NOTHING)) {
                    hazards.set(wumpusRoom, NOTHING);
                    hazards.set(nextRoom, WUMPUS);
                    wumpusRoom = nextRoom;
                }
                if(wumpusRoom == currentRoom) {
                    System.out.println("\"Ahhhhhhhhhh!\"");
                    delay(500L);
                    System.out.println("Wumpus ate you.");
                    gameOver = true;
                } else if (wumpusRoom == nextRoom) {
                    System.out.println("Wumpus ran away.");
                }
            }
        }
    }

    private static void selectReplay() {
        System.out.println("Game over. Replay?");
        while(true) {
            System.out.println("(0:End the game, 1:Replay.)");
            String action = scanner.nextLine();
            if(action.equals("0")){
                System.out.println("Finish the game.");
                System.exit(0);
            } else if (action.equals("1")) {
                System.out.println("Replay");
                break;
            } else {
                System.out.println("Wrong number.");
            }
        }
    }

    public static int parseIntegerOrNegative1(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void delay(Long ms) {
        try{
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {
        }
    }
}

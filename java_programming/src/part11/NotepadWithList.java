package part11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NotepadWithList {
    public static Scanner scanner = new Scanner(System.in);
    public static List<String> memoList = readMemoList();

    public static void main(String[] args) {
        while(true) {
            System.out.println("Choose number of the list.");
            System.out.println("1. Read memo.");
            System.out.println("2. Write new memo.");
            System.out.println("3. View memo list.");
            System.out.println("4. End the program.");

            String operation = scanner.nextLine();
            int taskNum = parseIntegerOrNegative1(operation);

            if(taskNum == 1) {
                System.out.println("Type the name of file to memo.");
                String fileName = scanner.nextLine();
                readMemo(fileName);
            } else if (taskNum == 2) {
                System.out.println("Type the name of file to save");
                String fileName = scanner.nextLine();
                writeMemo(fileName);
            } else if (taskNum == 3) {
                showMemoList();
            } else if (taskNum == 4) {
                System.out.println("End of program.");
                saveMemoList();
                break;
            } else {
                System.out.println("Wrong number.");
            }
        }
    }

    private static void readMemo(String fileName) {
        FileInputStream inputStream = null;

        try{
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist.");
            return;
        }
        System.out.println(fileName + " outputs.");
        Scanner reader = new Scanner(inputStream);
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        System.out.println("\n");
        reader.close();
    }

    private static void writeMemo(String fileName) {
    if (memoList.contains(fileName)) {
        System.out.println("This file exists already.");
        return;
    }
    FileWriter writer = null;
    try {
        writer = new FileWriter(fileName);
    } catch (IOException e) {
        System.out.println("Fail to create a file.");
        return;
    }
    System.out.println("Write memo.");
    System.out.println("(To end : just Enter.)");

    while (true) {
        String input = scanner.nextLine();
        if (input.equals("")) break;
        try {
            writer.write(input);
            writer.write("\n");
        } catch (IOException e) {
            System.out.println("Couldn't write memo at file.");
        }
    }
    try{
        writer.close();
        memoList.add(fileName);
        Collections.sort(memoList);
    } catch (IOException e) {
        System.out.println("Fail to close file.");
    }
    }

    public static ArrayList<String> readMemoList() {
    FileInputStream inputStream = null;
    ArrayList<String> memoList = new ArrayList<>();

    try {
        inputStream = new FileInputStream("src/notes.txt");
    } catch (FileNotFoundException e) {
        return memoList;
    }
    Scanner scanner = new Scanner(inputStream);

    while (scanner.hasNextLine()) {
        String fileName = scanner.nextLine();
        memoList.add(fileName);
    }
        return memoList;
    }

    public static void showMemoList() {
            if(memoList.isEmpty()) {
                System.out.println("There's no written memo.");
            } else {
                System.out.println("Output Memo.");

                for(String fileName : memoList) {
                    System.out.println(fileName);
                }
                System.out.println("");
            }
    }
        public static void saveMemoList() {
        FileWriter writer = null;

        try {
            writer = new FileWriter("src/notes.txt");

            for (String fileName : memoList) {
                writer.write(fileName);
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Fail to save memo list.");
        }
        }

        public static int parseIntegerOrNegative1(String input) {
        try{
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
        }
}

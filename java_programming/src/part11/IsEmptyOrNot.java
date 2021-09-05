package part11;

import java.util.ArrayList;
import java.util.Scanner;

public class IsEmptyOrNot {
    public static void main(String[] args) {
        System.out.println("Type the video name to add.(To end, Type 0)");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> videos = new ArrayList<>();

        while(true) {
            String title = scanner.nextLine();
            if(title.equals("0")) break;
            videos.add(title);
        }

        if(videos.isEmpty()){
            System.out.println("List is empty.");
        } else {
            System.out.println("There are " + videos.size() + " videos in total.");
        }
    }
}

package part12;

import java.util.HashMap;

public class MapSize {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();


        contacts.put("Justin Bieber", "010-1234-abcd");
        contacts.put("Obama", "010-abcd-abcd");
        contacts.put("Anteater", "010-ab12-ab34");

//        int size = contacts.size();
        if(contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        }
        System.out.println(contacts.size() + "개의 연락처가 있습니다.");
    }
}

package part11;

import java.util.ArrayList;

public class CollectionSize {
    public static void main(String[] args) {
        ArrayList<String> videos = new ArrayList<>();

        if(videos.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("There are " + videos.size() + " videos." );
        }

        videos.add("뽀로로와 노래해요.");
        videos.add("[헤이지니 비밀의 문] 미니특공대 루시 악당을 물리쳐라.");
        videos.add("[미방송_외장하드털이_2탄] 누가 펭수를 자극했는가");
        videos.add("겨털대마왕");

        System.out.println("There are " + videos.size() + " videos." );
    }
}

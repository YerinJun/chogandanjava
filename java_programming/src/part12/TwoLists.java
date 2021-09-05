package part12;

import java.util.Arrays;
import java.util.List;

public class TwoLists {
    public static void main(String[] args) {
        List<String> keys = Arrays.asList("chicken","hippo");
        List<String> values = Arrays.asList("닭","개미핥기");

        for(int i = 0; i < keys.size(); i++) {
            String englishWord = keys.get(i);
            String koreanWord = values.get(i);

            System.out.println(englishWord + "=" + koreanWord);
        }
    }
}

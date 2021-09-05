package part12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        String dictionaryFile = "src/dictionary.txt";

        Map<String, String> dictionary = readDictionary(dictionaryFile);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("번역할 영단어를 입력하세요(종료: 빈 줄로 엔터)");

            String englishWord = scanner.nextLine();

            if (englishWord.equals("")) break;
            if (dictionary.containsKey(englishWord)) {
                String koreanWord = dictionary.get(englishWord);
                System.out.println(englishWord + "은(는) " + koreanWord + "입니다.");
            } else {
                System.out.println("사전에서 단어를 찾을 수 없습니다.");
            }
        }
    }

    public static Map<String, String> readDictionary(String fileName) {
        Map<String, String> dictionary = new HashMap<>();
        FileInputStream inputStream = null;

        try{
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("사전 파일이 존재하지 않습니다.");
            System.exit(20);
        }

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNextLine()) {
            String englishWord = scanner.next();
            String koreanWord = scanner.next();
            dictionary.put(englishWord, koreanWord);
        }
        return dictionary;
    }
}

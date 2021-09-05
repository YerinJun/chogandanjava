package part9;

import java.io.*;
import java.util.*;

public class Diary {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("원하는 작업 번호를 입력해주세요.");
        System.out.println("1. 일기 읽기");
        System.out.println("2. 새 일기");
        System.out.println("3. 종료");

        int taskNum;

        try {
            String input = scanner.nextLine();
            taskNum = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다.");
            continue;
        }

        if (taskNum == 1) {
            System.out.println("년도를 입력하세요(예: 1970)");
            String year = scanner.nextLine();

            System.out.println("월을 입력하세요(예: 01)");
            String month = scanner.nextLine();

            System.out.println("날짜을 입력하세요(예: 01)");
            String date = scanner.nextLine();

            String fileName = year + "-" + month + "-" + date + ".txt";

            FileInputStream inputStream = null;

            try {
                inputStream = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                System.out.println("일기가 존재하지 않습니다.");
                continue;
            }

            System.out.println(year + "-" + month + "-" + date + "의 일기");

            Scanner reader = new Scanner(inputStream);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            System.out.println("\n");

            reader.close();
        } else if (taskNum == 2) {
            System.out.println("년도를 입력하세요(예: 1970)");
            String year = scanner.nextLine();

            System.out.println("월을 입력하세요(예: 01)");
            String month = scanner.nextLine();

            System.out.println("날짜을 입력하세요(예: 01)");
            String date = scanner.nextLine();

            String fileName = year + "-" + month +"-" + date + ".txt";

            FileWriter writer = null;

            try {
                writer = new FileWriter(fileName);
            } catch (IOException e) {
                System.out.println("파일 생성에 실패하였습니다.");
                continue;
            }

            System.out.println("날씨를 입력하세요.");
            String weather = scanner.nextLine();

            System.out.println("제목을 입력하세요.");
            String title = scanner.nextLine();

            try {
                writer.write("날씨: " + weather);
                writer.write("\n");
                writer.write("제목: " + title);
                writer.write("\n");
            } catch (IOException e) {
                System.out.println("파일에 문자열을 쓰지 못했습니다.");
            }

            System.out.println("일기 내용을 작성하세요");
            System.out.println("(종료: 빈 줄에서 엔터키 입력)");

            while (true) {
                String input = scanner.nextLine();
                if (input.equals("")) {
                    break;
                }

                try {
                    writer.write(input);
                    writer.write("\n");
                } catch (IOException e) {
                    System.out.println("파일에 문자열을 쓰지 못했습니다.");
                }
            }

            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("파일을 닫는 데 실패했습니다.");
            }
        } else if (taskNum == 3) {
            System.out.println("프로그램을 종료합니다.");
            break;
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
    }
}

package part10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiaryWithMethods {
public static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
    while(true) {
        System.out.println("원하는 작업 번호를 입력해주세요.");
        System.out.println("1. 일기 읽기");
        System.out.println("2. 새 일기");
        System.out.println("3. 종료");

        String operation = scanner.nextLine();
        int taskNum = parseIntegerOrNegative1(operation);

        if(taskNum == 1) {
            String fileName = readFileName();
            readDiary(fileName);
        } else if (taskNum == 2) {
            String fileName = readFileName();
            writeDiary(fileName);
        } else if(taskNum == 3) {
            System.out.println("프로그램을 종료합니다.");
            break;
        } else {
            System.out.println("잘못된 입력입니다.");
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

public static String readFileName() {
    System.out.println("년도를 입력하세요.(예: 1970)");
    String year = scanner.nextLine();
    System.out.println("월을 입력하세요.(예: 01)");
    String month = scanner.nextLine();
    System.out.println("날짜를 입력하세요.(예: 01)");
    String date = scanner.nextLine();
    return year + "-" + month + "-" + date + ".txt";
}

private static void readDiary(String fileName) {
    FileInputStream inputStream = null;

    try {
        inputStream = new FileInputStream(fileName);
    } catch (FileNotFoundException e) {
        System.out.println("일기가 존재하지 않습니다.");
        return;
    }

    String date = fileName.substring(0,10);
    System.out.println(date + "의 일기");
    Scanner reader = new Scanner(inputStream);

    while (reader.hasNextLine()) {
        System.out.println(reader.nextLine());
    }
    System.out.println("\n");
    reader.close();
}

private static void writeDiary(String fileName) {
    FileWriter writer = null;

    try {
        writer = new FileWriter(fileName);
    } catch (IOException e) {
        System.out.println("파일 생성에 실패했습니다.");
        return;
    }

    System.out.println("날씨를 입력하세요.");
    String weather = scanner.nextLine();
    System.out.println("제목를 입력하세요.");
    String title = scanner.nextLine();

    try {
        writer.write("날씨: " + weather);
        writer.write("\n");
        writer.write("제목: " + title);
        writer.write("\n");
    } catch (IOException e) {
        System.out.println("파일에 문자열을 쓰지 못했습니다.");
    }

    System.out.println("일기 내용을 작성하세요.");
    System.out.println("(종료: 빈 줄에서 엔터키 입력)");

    while(true) {
        String input = scanner.nextLine();
        if(input.equals("")) break;

        try {
            writer.write(input);
            writer.write("\n");
        } catch (IOException e) {
            System.out.println("파일에 문자열을 쓰지 못했습니다.");
        }
    }

    try{
        writer.close();
    } catch (IOException e) {
        System.out.println("파일을 닫는 데 실패했습니다.");
    }
}
}

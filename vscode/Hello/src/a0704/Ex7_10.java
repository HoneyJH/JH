package a0704;

import java.util.Scanner;

public class Ex7_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("단어를 입력하세요");
        String txt = scanner.nextLine();
        System.out.println( "출력: " + txt);
        scanner.close();
    }
} // 입력한 문자를 그대로 출력

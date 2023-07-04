package a0704;

import java.util.Scanner;

public class Ex7_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 문자를 입력하세요");
        String txt1 = scanner.next();
        System.out.println("두번째 문자를 입력하세요");
        String txt2 = scanner.next();
        System.out.println(txt2 + " " + txt1);
        scanner.close();
    }
} // 두 문자를 입력받았을때 두 문자의 자리를 바꿔서 출력

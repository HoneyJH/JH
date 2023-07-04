package a0704;

import java.util.Scanner;

public class Ex7_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("한 변의 길이를 입력하세요>");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
} // *로 사각형 만들기

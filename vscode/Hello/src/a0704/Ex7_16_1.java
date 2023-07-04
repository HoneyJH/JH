package a0704;

import java.util.Scanner;

public class Ex7_16_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("월을 입력하세요");
        int a = scan.nextInt();
        if (3 <= a && a <= 5) {
            System.out.println("spring");
        } else if (6 <= a && a <= 8) {
            System.out.println("summer");
        } else if (9 <= a && a <= 11) {
            System.out.println("fall");
        } else {
            System.out.println("winter");
        }

        scan.close();
    }
} // 입력받은 a,b 중 큰 값을 출력

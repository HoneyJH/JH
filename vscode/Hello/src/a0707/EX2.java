package a0707;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("두 정수를 입력하세요.");
        System.out.println("정수 a =");
        int a = scan.nextInt();
        System.out.println("정수 b =");
        int b = scan.nextInt();
        int x = 0;
        if (a > b) {
            if (a % b == 0) {
                x = a / b;
                System.out.printf("%d * %d = %d\n", b, x, a);
            } else {
                System.out.println("none");
            }
        } else {
            if (b % a == 0) {
                x = b / a;
                System.out.printf("%d * %d = %d\n", a, x, b);
            } else {
                System.out.println("none");
            }
        }

        scan.close();
    }
} // 두 자연수를 입력하면 b가 a의 배수이면 "a*x=b"를 출력하고, a가 b의 배수이면 "b*x=a"를 출력하고, 배수관계가 아니면 "none"을 출력하기

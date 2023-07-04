package a0704;

import java.util.Scanner;

public class Ex7_11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력하세요");
        float num = scanner.nextFloat();
        System.out.printf( "방법1 %f => %.2f",num,num);
        System.out.println();

        num = (num + 0.005f)*100;
        System.out.println(num);
        int i = (int)num;
        System.out.println(i);
        num = (float)i/100;
        System.out.println("두번째 방법" + num);

        scanner.close();
    }
} // 소숫점 2번째 자리에서 반올림해서 출력

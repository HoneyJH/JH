package a0704;

import java.util.Scanner;

public class Ex7_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력>");
        int num1 = scan.nextInt();
        System.out.print("두번째 숫자 입력>");
        int num2 = scan.nextInt();
        System.out.print("세번째 숫자 입력>");
        int num3 = scan.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + (float) sum / 3);
        // int / int = int
        // float / int = float
        // double / int = double
        
        scan.close();
    }
} // 정수 세 개를 입력받아 합과 평균을 출력

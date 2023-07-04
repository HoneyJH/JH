package a0704;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_18_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            System.out.println("정수" + (i + 1) + ">");
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);
        int min = num[0];
        System.out.println("최소값은? " + min);

        scan.close();
    }
} // 입력한 숫자 중 최솟값 찾기

package a0707;

import java.util.Arrays;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수를 입력하세요.");
        System.out.println("정수 a =");
        int a = scanner.nextInt();
        System.out.println("정수 b =");
        int b = scanner.nextInt();

        int[] Arr = new int[10];
        Arr[0] = a+b; 
        Arr[1] = b+a;
        Arr[2] = a-b;
        Arr[3] = b-a;
        Arr[4] = a*b;
        Arr[5] = b*a;
        Arr[6] = a/b;
        Arr[7] = b/a;
        Arr[8] = (int)Math.pow(a,b);
        Arr[9] = (int)Math.pow(b, a);

        Arrays.sort(Arr);
        System.out.println("최댓값: "+ Arr[9]);

        scanner.close();
    }
} // 두 실수 a, b가 입력되면 그 두수를 더하거나 빼거나 곱하거나 나누거나 제곱을 해서 가장 큰 수를 출력하기

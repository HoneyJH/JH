package a0704;

import java.util.Scanner;

public class Ex7_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력>");
        int a = scan.nextInt();
        System.out.print("두번째 숫자 입력>");
        int b = scan.nextInt();

        // 방법1
        /*
            int win;
            if(a>b){
            win = a;
            } else{
            win = b;
            }
        */

        // 방법2
        int win = (a > b) ? a : b;

        System.out.println(win);
        scan.close();
    }
} // 입력받은 a,b 중 큰 값을 출력

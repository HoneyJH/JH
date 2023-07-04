package a0704;

import java.util.Scanner;

public class Ex7_16_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("월을 입력하세요");
        int a = scan.nextInt();
        switch (a) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("월을 다시 입력해주세요");
        }

        scan.close();
    }
} // 입력받은 a,b 중 큰 값을 출력

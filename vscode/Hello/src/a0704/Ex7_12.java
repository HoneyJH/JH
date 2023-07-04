package a0704;

import java.util.Scanner;

public class Ex7_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("년을 입력하세요");
        int y = scan.nextInt();
        System.out.println("월을 입력하세요");
        int m = scan.nextInt();
        System.out.println("일을 입력하세요");
        int d = scan.nextInt();
        System.out.printf("방법1. %04d.%02d.%02d",y,m,d);
        System.out.println();

        String result = String.format("방법2. %04d.%02d.%02d", y,m,d);
        System.out.println(result);
        
        scan.close();
    }
}

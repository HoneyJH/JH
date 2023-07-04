package a0704;

import java.util.Scanner;

public class Ex7_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("문자1개를 입력하세요");
        String str = scan.nextLine();
        char c = str.charAt(0); // 인덱스0 문자를 가져옴
        int n = c;
        System.out.printf("%c의 아스키코드는 %d입니다",c,n);
        
        scan.close();
    }
}

package a0703;

import java.util.Scanner;

// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
public class Ex6_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.println("연도를 입력하세요.(1~4000)");
            int y = scanner.nextInt();
            if(y>=1 && y<=4000){
                if(y%4 == 0 && y%100 !=0 || y%400 == 0){
                    System.out.println("해당연도는 윤년입니다.");
                    break;
                } else{
                    System.out.println("해당연도는 윤년 아닙니다.");
                    break;
                }
            } else{
                System.out.println("연도를 다시 입력해주세요.");
            }
        }
        scanner.close();
    }
}

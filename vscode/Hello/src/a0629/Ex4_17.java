package a0629;

import java.util.Scanner;

public class Ex4_17 {
    public static void main(String[] args) {
        int input = 0, answer = 0;
        answer = (int)(Math.random() *100) + 1; // 다운 스케일링
        Scanner scanner = new Scanner(System.in);
        System.out.print("1과 100사이의 정수를 입력하세여.");
        do{
            input = scanner.nextInt();
            if(input > answer){
                System.out.println("더 작은 수로 다시 시도 해보세요");
            }else if(input < answer){
                System.out.println("더 큰 수로 다시 시도 해보세요");
            }
        } while(input != answer);
        System.out.println("정답입니다");
        scanner.close();
    }
} // do-while문 숫자맞추기

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = ' ';

        System.out.println("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.printf("당신의 학점은 %c%c입니다 .%n ", grade, opt);
        scanner.close();
    }
}

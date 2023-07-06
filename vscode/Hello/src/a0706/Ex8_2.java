import java.util.Scanner;

public class Ex8_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. 월요일");
        System.out.println("2. 화요일");
        System.out.println("3. 수요일");
        System.out.println("4. 목요일");
        System.out.println("5. 금요일");
        System.out.println("6. 토요일");
        System.out.println("7. 일요일");
        System.out.println("요일을 선택하세요>");
        int weekNum = scan.nextInt();
        if (weekNum == 1 && weekNum == 3 && weekNum == 5) {
            System.out.println("oh my god");
        } else {
            System.out.println("enjoy");
        }
        scan.close();
    }
} // 월,수,금,일 알바가는 날은 "oh my god"을 출력 쉬는날은 "enjoy" 출력
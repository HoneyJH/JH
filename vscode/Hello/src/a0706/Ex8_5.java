import java.util.Calendar;
import java.util.Scanner;

public class Ex8_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();


        int year = calendar.get(Calendar.YEAR) *10000;
        int month = (calendar.get(Calendar.MONTH) + 1)*100; // 월은 0부터 시작하므로 +1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int today = year + month + day;

        
        System.out.println("주민번호 앞 6자리를 입력하세요");
        int num1 = scan.nextInt();
        System.out.println("주민번호 뒤 첫자리를 입력하세요");
        int num2 = scan.nextInt();
        int age = 0;

        if (num2 == 1 || num2 == 2) {
            age = (today - (19000000 + num1)) / 10000;
            System.out.println("나이:" + age);
        } else {
            age = (today - (20000000 + num1)) / 10000;
            System.out.println("나이:" + age);
        }

        scan.close();
    }
} // 만나이 구하기

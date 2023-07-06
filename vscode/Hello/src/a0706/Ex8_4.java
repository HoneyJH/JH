import java.util.Scanner;

public class Ex8_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("주민번호 앞 6자리를 입력하세요");
        int number = scan.nextInt();
        System.out.println("주민번호 뒤 첫자리를 입력하세요");
        int male = scan.nextInt();
        int birth_year;
        if(male ==1 || male == 2){
            birth_year = 1900 + number / 10000;
        } else {
            birth_year = 2000 + number / 10000;
        }

        int age = 2023 - birth_year;
        System.out.println("나이는: " + age);
        scan.close();
    }
} // 년도수로만 나이 구하기

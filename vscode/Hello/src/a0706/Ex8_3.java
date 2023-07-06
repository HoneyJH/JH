import java.util.Scanner;

public class Ex8_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("주민번호 앞 6자리를 입력하세요");
        int num1 = scan.nextInt();
        System.out.println("주민번호 뒤 첫자리를 입력하세요");
        int num2 = scan.nextInt();
        int age = 0;
        int a = (int)num1/10000; // 앞2자리

        if(num2 == 1 || num2 == 2){
            age = 2023 - (1900+a);
            System.out.println("나이:"+age);
        } else{
            age = 2023 - (2000+a);
            System.out.println("나이:"+age);
        }

        scan.close();
    }
} // 년도수로만 나이 구하기

package a0629;

public class Ex4_21 {
    public static void main(String[] args) {
        while (true) {
            int num1 = (int) (Math.random() * 5) + 1;
            int num2 = (int) (Math.random() * 5) + 1;
            // System.out.printf("(%d,%d)", num1, num2);
            System.out.println("(" + num1 + "," + num2 + ")");
            if (num1 + num2 == 5) {
                break;
            }
        }
    }
} // 두 주사위를 던저 두 눈의 합이 5가 나오면 실행을 멈추는 코드

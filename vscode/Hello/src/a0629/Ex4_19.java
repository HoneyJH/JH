package a0629;

public class Ex4_19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                // 2로 나눈 나머지가 0이 아닌경우 = 홀수인 경우
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

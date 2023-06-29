package a0629;

public class Ex4_20 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) { 
                sum += i;
            }
        }
        System.out.println("3의배수의합: " + sum);
    }
} // 1~100까지 3의 배수의 총합

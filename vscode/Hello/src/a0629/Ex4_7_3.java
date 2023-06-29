package a0629;

public class Ex4_7_3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            // sum += i;
            sum = sum + i;
        }
        // System.out.println("1부터100까지의 합은 " + sum);
        System.out.printf("1부터100까지의 합은 %d%n", sum);
        System.out.printf("1부터100까지의 합은 %d%n", sum);
    }
} // 1~100까지의 합 출력


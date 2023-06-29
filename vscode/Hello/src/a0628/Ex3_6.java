public class Ex3_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.println();
        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        // 소수점을 나오게 하려면 d -> f
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
        System.out.printf("%d / %f = %f%n", a, (double)b, a / (double)b);
    }
}

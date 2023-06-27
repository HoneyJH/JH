public class Char2 {
    public static void main(String[] args) {
        int a = 65;
        int b = -66;

        char a2 = 65;
        // char b2 = -66; 에러남
        char a3 = 97;

        System.out.println(a);
        System.out.println((char)a);
        System.out.println((char)b); // 유효한 문자코드가 아님
        System.out.println((char)a2);
        System.out.println((char)a3);
    }
}

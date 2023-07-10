package a0710;

public class String2 {
    public static void main(String[] args) {
        String str = new String("abcd");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.compareTo("bcef")); // -1 (없음)
        System.out.println(str.compareTo("abcd")); // 0 (0번째 있음)

        System.out.println(str.compareTo("Abcd")); // 32 (a와A의 유니코드 값의 차이)
        System.out.println(str.compareToIgnoreCase("Abcd")); // 0 (대소문자를 구분하지않음)
        System.out.println("compareTo() 메소드 호출 후 원본 문자열: " + str);
    }
}

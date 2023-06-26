public class Datatype1 {
    public static void main(String[] args) {
        byte num1 = 127;
        byte num2 = -128;
        System.out.println(num1);
        System.out.println(num2);
        // byte는 1byte를 뜻하고 -128 ~ 127까지만 표현 가능
        // short는 2byte -32768 ~ 32767
        // int 4byte  -2,147,483,648 ~ 2,147,483,647
        // long 8byte
        num1++;
        num2--;
        System.out.println(num1);
        System.out.println(num2);
    }
}

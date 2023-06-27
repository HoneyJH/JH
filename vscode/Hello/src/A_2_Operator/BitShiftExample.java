package A_2_Operator;

public class BitShiftExample {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 <<3;
        int result2 = num1 *(int) Math.pow(2,3);
        // Math.pow(2,3)dms 2의3제곱 -> double값을 산출
        // int 값을 얻고싶다면 (int)를 캐스팅해야함
        System.out.println("result:"+ result1);
        System.out.println("result:"+ result2);
        int num2 = -8;
        int result3 = num2 >>3;
        int result4 = num2 /(int) Math.pow(2,3);
        System.out.println("result:"+ result3);
        System.out.println("result:"+ result4);
    }
}
